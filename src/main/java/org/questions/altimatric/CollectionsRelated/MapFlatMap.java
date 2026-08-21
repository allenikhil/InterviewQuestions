package org.questions.altimatric;

import java.util.List;

import static java.lang.IO.println;

public class MapFlatMap
{
    static void main() {

        List<String> list = List.of("Nikhil", "Kumar", "Singh");

        List<Integer> len=list.stream()
                .map(String::length)
                .toList();
        println(len);

        List<List<String>> listOfList = List.of(List.of("Nikhil", "Kumar"),
                List.of("Singh", "Verma"));

        List<String> flatList=listOfList.stream()
                .flatMap(List::stream)
                .toList();
        println(flatList);
    }
}
