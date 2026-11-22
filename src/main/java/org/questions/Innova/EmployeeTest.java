package org.questions.Innova;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.IO.println;

public class EmployeeTest {
    static void main() {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Nikhil", "Male", LocalDate.of(2023, 5, 10), 50000),
                new Employee(2, "Rahul", "Male",LocalDate.of(2025, 5, 10), 60000),
                new Employee(3, "Priya", "Female",LocalDate.of(2024, 5, 18), 45000),
                new Employee(4, "Sneha", "Female",LocalDate.of(2023, 3, 1), 55000)
        );

        Map<String , Double> avergSalary= employees.stream()
                .collect(Collectors.groupingBy(Employee::gender,
                        Collectors.averagingDouble(Employee::salary)));

        avergSalary.forEach((gender,average)->
                System.out.println("Gender:"+gender +" average:"+average));

      List<String> names= employees.stream()
              .filter(emp->emp.dateOfJoining().getYear() == 2023)
              .map(Employee::name)
              .collect(Collectors.toList());

      println(names);

    }
}
