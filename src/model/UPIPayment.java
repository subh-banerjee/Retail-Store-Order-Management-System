package model;
public class UPIPayment implements Payment{
    public void pay(double a){
        System.out.println("UPIPaid:"+a);
    }
    public void ref(double a){
        System.out.println("UPIRef:"+a);
    }
}