package org.questions.altimatric;

public class FunctionaInterfaceExample {
    static void main() {

        Payment payment = amount ->{
            if(Payment.validateAmount(amount)){//static method of interface can be called using interface name
                System.out.println("Payment of " + amount + " is successful.");
            } else {
                System.out.println("Invalid payment amount: " + amount);
        }
        };
        payment.pay(100.0);
        payment.printReceipt();//default method of interface can be called using object of implementing class
        //default method can be overridden in implementing class
        //static method can be called using interface name
        Payment upiPayment = new UPIPayment();
        upiPayment.pay(200.0);
        upiPayment.printReceipt();
}
}