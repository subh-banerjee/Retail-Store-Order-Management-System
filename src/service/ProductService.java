package service;
import model.*;
import exception.*;
import java.util.*;
public class ProductService{
    public List<Product> p=new ArrayList<>();
    public void add(Product x){
        p.add(x);
    }
    public Product fnd(int i)throws ProductNotFoundException{
        for(Product x:p){
            if(x.i==i)return x;
        }
        throw new ProductNotFoundException("Err");
    }
    public void view(){
        for(Product x:p){
            System.out.println(x.i+" "+x.n+" P:"+x.p+" S:"+x.s);
        }
    }
}