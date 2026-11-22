package org.questions.Epam;

import static java.lang.IO.println;

public class ArrayProduct {
    static void main() {
        int arr[]={1,2,3,4};

        int pro[]=new int[arr.length];
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(count!=i) {
                pro[i] = pro[i] * arr[i];
            }
            count++;
        }
        println(pro);
    }
}
