package org.questions.General.Arrays;

import java.util.Arrays;
public class BinarySearch {
    static void main() {

        int[] numbers = {10, 20, 30, 40, 80};
        int target = 80;

        //we have to give sorted array only
        int inbulidIndex = Arrays.binarySearch(numbers, target);
        int index = binarySearch(numbers, target);

        IO.println("The binary search result From Inbulid Method: " + inbulidIndex);
        IO.println("The binary search result From Own Method: " + index);
    }

    public static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;

            if(numbers[mid] == target)
            {
                return mid;
            }
            else if(numbers[mid] < target)
            {
                low = mid+1;
            } else if (numbers[mid]>target) {
                high = mid-1;
            }
        }
        return -1;
    }
}
