package model;
public class Product{
    public int i;
    public String n;
    public double p;
    public int s;
    public ProductCategory c;
    public Product(int i,String n,double p,int s,ProductCategory c){
        this.i=i;
        this.n=n;
        this.p=p;
        this.s=s;
        this.c=c;
    }
    public boolean isAvail(int q){
        return s>=q;
    }
    public void updStk(int q){
        s-=q;
    }
}