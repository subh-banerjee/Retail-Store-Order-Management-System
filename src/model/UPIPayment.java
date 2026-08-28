package model;
public class UPIPayment implements Payment{
    public void pay(double a){System.out.println("UPI Payment Successful for Amount: "+a);}
    public void ref(double a){System.out.println("UPI Refund Processed for Amount: "+a);}
}