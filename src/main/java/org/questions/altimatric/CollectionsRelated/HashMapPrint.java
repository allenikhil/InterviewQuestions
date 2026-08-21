package org.questions.altimatric;

import java.util.HashMap;
import java.util.Map;

import static java.lang.IO.println;

public class HashMapPrint {
    static void main() {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Nikhil", 1);
        map.put("srija", 2);
        map.put("laddu", 3);
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
