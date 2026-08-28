package service;
import model.*;
import exception.*;
import java.util.*;
public class ProductService{
    public List<Product> p=new ArrayList<>();
    public void add(Product x){p.add(x);}
    public Product fnd(int i)throws ProductNotFoundException{
        for(Product x:p){
            if(x.i==i)return x;
        }
        throw new ProductNotFoundException("Error: Product Not Found");
    }
    public void view(){
        for(Product x:p)System.out.println("Product ID: "+x.i+" | Name: "+x.n+" | Price: "+x.p+" | Stock: "+x.s);
    }
}