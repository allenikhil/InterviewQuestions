package org.questions.cognizant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.IO.println;

public class TargetSumFinder {
    static void main() {

        List<Integer> list= Arrays.asList(1,4,5,2,9,6);
        int target=11;
        Set<Integer> set=new HashSet<>();
        for(int num:list)
        {
            int compliment=target-num;
            if(set.contains(compliment))
            {
                println("Pair found: (" + num + ", " + compliment + ")");
            }
            set.add(num);
        }
    }
}
