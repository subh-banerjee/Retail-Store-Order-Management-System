package service;
import model.*;
import exception.*;
import java.util.*;
public class CustomerService{
    public List<Customer> c=new ArrayList<>();
    public void add(Customer x){
        c.add(x);
    }
    public Customer fnd(int i)throws CustomerNotFoundException{
        for(Customer x:c){
            if(x.i==i)return x;
        }
        throw new CustomerNotFoundException("Err");
    }
}