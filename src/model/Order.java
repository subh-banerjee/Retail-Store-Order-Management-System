package model;
import java.util.*;
import java.time.*;
public class Order{
    public int i;
    public LocalDateTime d;
    public OrderStatus s;
    public List<OrderItem> o=new ArrayList<>();
    public double st;
    public double ds;
    public double tx;
    public double t;
    public Order(int i){
        this.i=i;
        this.d=LocalDateTime.now();
        this.s=OrderStatus.CREATED;
    }
    public void add(OrderItem it){
        o.add(it);
        calc();
    }
    public void calc(){
        st=0;
        for(OrderItem it:o)st+=it.tot();
        ds=st*0.05;
        tx=(st-ds)*0.18;
        t=st-ds+tx;
    }
}