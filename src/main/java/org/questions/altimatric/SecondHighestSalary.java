package org.questions.altimatric;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static java.lang.IO.println;

record Employee( String name, int id, double salary)
        { }
public class SecondHighestSalary {
    static void main() {
        Employee e1=new Employee( "srija", 6469, 168009.0);
        Employee e2=new Employee( "nikhil", 6468, 1555625.0);
        Employee e3=new Employee( "sharvani", 6470, 650328.0);
        List<Employee> employees=new LinkedList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        Optional<Double> secondHighestSalaryEmployee = employees.stream()
                .map(Employee::salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        println(secondHighestSalaryEmployee.orElse(null));

        Optional<Employee> secondHigehstSalaryEmployee = employees.stream()
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .skip(1)
                .findFirst();
        secondHigehstSalaryEmployee.ifPresent(System.out::println);
    }
}
