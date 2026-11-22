package org.questions.Innova;
import java.util.concurrent.*;

public class CompletableFutureExample {
    static void main() {
                CompletableFuture<Void> task1 =
                        CompletableFuture.runAsync(() -> {
                            System.out.println("Task 1 executing");
                        });

                CompletableFuture<Void> task2 =
                        CompletableFuture.runAsync(() -> {
                            System.out.println("Task 2 executing");
                        });

                CompletableFuture<Void> task3 =
                        CompletableFuture.runAsync(() -> {
                            System.out.println("Task 3 executing");
                        });

                // Wait for all tasks to complete
        try {
            CompletableFuture.allOf(task1, task2, task3).join();

            System.out.println("All tasks successful");

        } catch (CompletionException e) {
            System.out.println("One or more tasks failed: " + e.getCause());
        }

                // Executes after all tasks finish successfully
                //System.out.println("All tasks completed");

                System.out.println("Executing next task");
            }
        }

