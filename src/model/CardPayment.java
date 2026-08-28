package model;
public class CardPayment implements Payment{
    public void pay(double a){System.out.println("Card Payment Successful for Amount: "+a);}
    public void ref(double a){System.out.println("Card Refund Processed for Amount: "+a);}
}