package service;
import model.*;
import java.util.*;
public class ReportService{
    public void totSales(List<Order> o){
        double t=0;
        for(Order x:o)if(x.s!=OrderStatus.CANCELLED)t+=x.t;
        System.out.println("Total Sales Revenue: "+t);
    }
    public void totOrd(List<Order> o){System.out.println("Total Orders Placed: "+o.size());}
    public void hiOrd(List<Order> o){
        double m=0;
        for(Order x:o)if(x.t>m)m=x.t;
        System.out.println("Highest Order Amount: "+m);
    }
    public void lowStk(List<Product> p){
        for(Product x:p)if(x.s<5)System.out.println("Low Stock Alert for Product: "+x.n);
    }
    public void cancOrd(List<Order> o){
        int c=0;
        for(Order x:o)if(x.s==OrderStatus.CANCELLED)c++;
        System.out.println("Total Cancelled Orders: "+c);
    }
}