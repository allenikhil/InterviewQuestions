package org.questions.altimatric;

@FunctionalInterface
public interface MyFunctionalInterface {
    void myMethod();
    default  void defaultMethod() {
        System.out.println("This is a default method in the functional interface.");
    }

    static void staticMethod() {
        System.out.println("This is a static method in the functional interface.");
    }
}
