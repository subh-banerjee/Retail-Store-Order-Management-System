package service;
import model.*;
import exception.*;
import java.util.*;
public class OrderService{
    public List<Order> o=new ArrayList<>();
    public void add(Order x)throws InvalidOrderException{
        if(x.o.isEmpty())throw new InvalidOrderException("EmptyOrd");
        o.add(x);
        x.s=OrderStatus.CONFIRMED;
    }
}