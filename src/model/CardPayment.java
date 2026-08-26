package model;
public class CardPayment implements Payment{
    public void pay(double a){
        System.out.println("CardPaid:"+a);
    }
    public void ref(double a){
        System.out.println("CardRef:"+a);
    }
}