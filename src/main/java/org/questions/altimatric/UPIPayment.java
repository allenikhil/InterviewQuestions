package org.questions.altimatric;

import static java.lang.IO.println;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        if (Payment.validateAmount(amount)) {
            println("UPI Payment of " + amount + " is successful.");
        } else {
            println("Invalid UPI payment amount: " + amount);
        }
    }

    @Override
    public void printReceipt() {
        println("UPI Payment receipt generated");
    }
}
