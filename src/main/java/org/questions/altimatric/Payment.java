package org.questions.altimatric;

@FunctionalInterface
interface Payment {

    // Exactly one abstract method
    void pay(double amount);

    // Can be inherited and overridden
    default void printReceipt() {
        System.out.println("Receipt generated");
    }

    // Belongs to interface
    static boolean validateAmount(double amount) {
        return amount > 0;
    }
}
