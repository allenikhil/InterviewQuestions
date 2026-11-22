package org.questions.persistance;

// Question: implement a function to find largest palindrome substring in given string

public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindrome: aba
            int len1 = expand(s, i, i);

            // Even-length palindrome: abba
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLength) {
                start = i - (len - 1) / 2;
                maxLength = len;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static int expand(String s, int left, int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        String input = "babad";

        System.out.println(longestPalindrome(input));
    }
}
