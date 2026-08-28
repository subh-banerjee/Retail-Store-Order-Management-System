package model;
public class CashPayment implements Payment{
    public void pay(double a){System.out.println("Cash Payment Received for Amount: "+a);}
    public void ref(double a){System.out.println("Cash Refund Given for Amount: "+a);}
}