package org.questions.altimatric;

public class SumOfDigit {
    static void main() {

        int num=12345;
        int sum=0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
