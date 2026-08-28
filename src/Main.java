import model.*;
import service.*;
import exception.*;
import util.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ProductService ps=new ProductService();
        CustomerService cs=new CustomerService();
        OrderService os=new OrderService();
        PaymentService pys=new PaymentService();
        ReportService rs=new ReportService();
        int c=0;
        int oi=1;
        int ci=1;
        while(c!=7){
            System.out.print("====================\nQUICKMART STORE SYSTEM\n=====\n1. Product Management\n2. Customer Management\n3. Order Management\n4. Payment Management\n5. Reports\n6. Search\n7. Exit\n=====\nEnter your choice: ");
            c=InputUtil.readInt(s);
            if(c==1){
                System.out.println("1. Add Product  2. View Products");
                int pc=InputUtil.readInt(s);
                if(pc==1){
                    System.out.println("Enter Product ID: ");
                    int i=InputUtil.readInt(s);
                    System.out.println("Enter Product Name: ");
                    String n=s.next();
                    System.out.println("Enter Product Price: ");
                    double p=s.nextDouble();
                    System.out.println("Enter Stock Quantity: ");
                    int st=InputUtil.readInt(s);
                    if(ValidationUtil.isPos(st))ps.add(new Product(i,n,p,st,ProductCategory.ELECTRONICS));
                }
                if(pc==2)ps.view();
            }
            if(c==2){
                System.out.println("Enter Customer Name: ");
                String n=s.next();
                System.out.println("Enter Mobile Number: ");
                String m=s.next();
                System.out.println("Enter Email Address: ");
                String e=s.next();
                if(ValidationUtil.valEmail(e)){
                    cs.add(new Customer(ci++,n,m,e,new Address("","")));
                    System.out.println("Customer Added Successfully!");
                }
            }
            if(c==3){
                Order o=new Order(oi++);
                System.out.println("Enter Product ID: ");
                int pi=InputUtil.readInt(s);
                System.out.println("Enter Quantity: ");
                int q=InputUtil.readInt(s);
                try{
                    Product p=ps.fnd(pi);
                    p.updStk(q);
                    o.add(new OrderItem(p,q,p.p));
                    System.out.println("Order Subtotal: "+o.st+" | Total Amount: "+o.t);
                    os.add(o);
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            if(c==4){
                System.out.println("Enter Payment Amount: ");
                double a=s.nextDouble();
                pys.proc(new UPIPayment(),a);
            }
            if(c==5){
                rs.totOrd(os.o);
                rs.totSales(os.o);
                rs.lowStk(ps.p);
            }
            if(c==6){
                System.out.println("Enter Product ID to Search: ");
                int id=InputUtil.readInt(s);
                try{
                    Product p=ps.fnd(id);
                    System.out.println("Product Found: "+p.n+" | Price: "+p.p);
                }catch(Exception ex){
                    System.out.println("Error: Product Not Found.");
                }
            }
        }
    }
}