package org.questions.Innova;

public class ThreadWait {
        public static void main(String[] args) throws InterruptedException {

            Thread t1 = new Thread(() -> {
                System.out.println("Child Thread 1 started");
                // Some business logic
                System.out.println("Child Thread 1 completed");
            });

            Thread t2 = new Thread(() -> {
                System.out.println("Child Thread 2 started");
                // Some business logic
                System.out.println("Child Thread 2 completed");
            });

            t1.start();
            t2.start();

            // Main thread waits for both child threads
            t1.join();
            t2.join();

            // Executes only after both threads complete
            System.out.println("All child threads completed");

            System.out.println("Executing subsequent task");
        }
    }
