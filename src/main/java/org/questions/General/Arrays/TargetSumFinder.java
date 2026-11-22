package org.questions.General.Arrays;

import java.util.*;

import static java.lang.IO.println;

public class TargetSumFinder {
    static void main() {

        int nums[]={1,2,7,9,3};
        int target=7;
        int indexs[]=findSum(nums,target);
        IO.println("target found at "+Arrays.toString(indexs));
        }

        public static int[] findSum(int[] nums, int target) {
        Map<Integer,Integer> seen= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int compliment= target-nums[i];
            if(seen.containsKey(compliment))
            {
                return new int[]{seen.get(compliment),i};
            }
            seen.put(nums[i],i);
        }
        return new int []{};
        }
}
