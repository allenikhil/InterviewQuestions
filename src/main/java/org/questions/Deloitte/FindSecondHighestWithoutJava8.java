package org.questions.Deloitte;

import java.util.Arrays;
import java.util.List;

public class FindSecondHighestWithoutJava8 {
    static void main() {
        List<Integer> list= Arrays.asList(51,63,13,49,35);
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i:list)
        {
            if(i>highest)
            {
                secondHighest = highest;
                highest=i;
            }
            if(i<highest && i>secondHighest)
            {
                secondHighest=i;
            }
        }
        if(secondHighest==Integer.MIN_VALUE)
        {
            System.out.println("SecondHighest not found");
        }
        else
        {
            System.out.println("SecondHighest is :"+secondHighest);
        }
    }
}
