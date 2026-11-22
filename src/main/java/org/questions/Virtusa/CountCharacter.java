package org.questions.Virtusa;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.lang.IO.println;

public class CountCharacter {
    static void main() {
        String s="amcbcajs";
       Map<Character,Long> map = s.chars()
                       .mapToObj(c->(char)c)
                               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        println(map);
    }
}
