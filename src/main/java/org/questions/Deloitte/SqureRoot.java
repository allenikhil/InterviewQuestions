package org.questions.Deloitte;

public class SqureRoot {

    static void main() {
        int result = findSqureRoot(10);
        System.out.println(result);
        double resultb = findSqureRootUsingBinarySearch(10);
        System.out.println(resultb);
    }

    public static int findSqureRoot(int n) {
        int result = 0;

        for (int i = 1; i <= n / i; i++) {
            result = i;
        }

        return result;
    }

    public static double findSqureRootUsingBinarySearch
            (double n) {
        double low=0;
        double high = Math.max(1,n);
        double precision = 0.000001;

        while(high-low>precision)
        {
            double mid= low + (high-low)/2;
            if(mid * mid <n)
            {
                low=mid;
            }
            else
            {
                high=mid;
            }
        }
        return (high+low)/2;
    }

}
