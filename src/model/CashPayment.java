package model;
public class CashPayment implements Payment{
    public void pay(double a){
        System.out.println("CashPaid:"+a);
    }
    public void ref(double a){
        System.out.println("CashRef:"+a);
    }
}