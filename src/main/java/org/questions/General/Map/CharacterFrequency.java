package org.questions.General.Map;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    static void main() {
        String s="India";
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        IO.println(map.toString());
    }
}
