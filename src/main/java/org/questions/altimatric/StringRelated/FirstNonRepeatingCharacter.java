package org.questions.altimatric;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

import static java.lang.IO.println;

public class FirstNonRepeatingCharacter {
    static void main() {

        String str="Nikhil";
        Character ch = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(entry->entry.getKey())
                .findFirst()
                .orElse(null);

        println(ch);

    }
}
