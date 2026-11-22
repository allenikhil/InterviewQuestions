package org.questions.Innova;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
        public static void main(String[] args) {

            CopyOnWriteArrayList<String> list =
                    new CopyOnWriteArrayList<>();

            list.add("Java");
            list.add("Spring Boot");
            list.add("Kafka");

            Thread t1 = new Thread(() -> {
                for (String item : list) {
                    System.out.println("Reading: " + item);
                }
            });

            Thread t2 = new Thread(() -> {
                list.add("Microservices");
                System.out.println("Element added");
            });

            t1.start();
            t2.start();
        }
    }

