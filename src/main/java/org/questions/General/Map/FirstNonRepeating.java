package org.questions.General.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    static void main() {
        String s="INDIA";

        Optional<Character> ch=s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting())
                ).entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();

        IO.println(ch.isPresent()?"First non repeating: "+ch.get():"Not found");
    }
}
