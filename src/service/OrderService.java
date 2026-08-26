package service;
import model.*;
import java.util.*;
public class OrderService{
    public List<Order> o=new ArrayList<>();
    public void add(Order x){
        o.add(x);
        x.s=OrderStatus.CONFIRMED;
    }
}