package model;
public class OrderItem{
    public Product p;
    public int q;
    public double u;
    public OrderItem(Product p,int q,double u){
        this.p=p;
        this.q=q;
        this.u=u;
    }
    public double tot(){
        return q*u;
    }
}