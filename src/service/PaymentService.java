package service;
import model.*;
public class PaymentService{
    public void proc(Payment p,double a){
        System.out.println("InitPay...");
        p.pay(a);
    }
}