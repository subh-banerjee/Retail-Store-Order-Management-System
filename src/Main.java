import model.*;
import service.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ProductService ps=new ProductService();
        CustomerService cs=new CustomerService();
        OrderService os=new OrderService();
        PaymentService pys=new PaymentService();
        int c=0;
        int oi=1;
        int ci=1;
        while(c!=7){
            System.out.print("====================\nQUICKMART STORE SYSTEM\n=====\n1. Product Management\n2. Customer Management\n3. Order Management\n4. Payment Management\n5. Reports\n6. Search\n7. Exit\n=====\nEnter your choice: ");
            c=s.nextInt();
            if(c==1){
                System.out.println("1.Add 2.View");
                int pc=s.nextInt();
                if(pc==1){
                    System.out.println("Id:");
                    int i=s.nextInt();
                    System.out.println("Name:");
                    String n=s.next();
                    System.out.println("Price:");
                    double p=s.nextDouble();
                    System.out.println("Stk:");
                    int st=s.nextInt();
                    ps.add(new Product(i,n,p,st,ProductCategory.ELECTRONICS));
                }
                if(pc==2)ps.view();
            }
            if(c==2){
                System.out.println("Name:");
                String n=s.next();
                System.out.println("Mob:");
                String m=s.next();
                cs.add(new Customer(ci++,n,m,"",new Address("","")));
                System.out.println("CustAdded");
            }
            if(c==3){
                Order o=new Order(oi++);
                System.out.println("Pid:");
                int pi=s.nextInt();
                System.out.println("Qty:");
                int q=s.nextInt();
                try{
                    Product p=ps.fnd(pi);
                    if(p.isAvail(q)){
                        p.updStk(q);
                        o.add(new OrderItem(p,q,p.p));
                        System.out.println("Sub:"+o.st+" Disc:"+o.ds+" Tax:"+o.tx+" Tot:"+o.t);
                        os.add(o);
                    }
                }catch(Exception e){
                    System.out.println("Err");
                }
            }
            if(c==4){
                System.out.println("Amt:");
                double a=s.nextDouble();
                pys.proc(new UPIPayment(),a);
            }
            if(c==5){
                System.out.println("TotOrders:"+os.o.size());
                double tt=0;
                for(Order x:os.o)tt+=x.t;
                System.out.println("TotRev:"+tt);
            }
            if(c==6){
                System.out.println("Pid:");
                int id=s.nextInt();
                try{
                    Product p=ps.fnd(id);
                    System.out.println("Fnd:"+p.n+" P:"+p.p);
                }catch(Exception e){
                    System.out.println("NotFnd");
                }
            }
        }
    }
}