package org.questions.Innova;

import java.time.LocalDate;

public record Employee(int id,
                       String name,
                       String gender, LocalDate dateOfJoining,
         double salary) {
}
