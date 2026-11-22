package org.questions.altimatric.StringRelated;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidString {

   /* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

    Example 1:
    Input: s = "()"
    Output: true
    Example 2:
    Input: s = "()[]{}"
    Output: true
    Example 3:
    Input: s = "(]"
    Output: false
    Example 4:
    Input: s = "([])"
    Output: true
    Example 5:
    Input: s = "([)]"
    Output: false*/

    public static void main(String[] args) {

        String s="";
        //s="()";
        s="([])";
        //s="()[]{}";
        //s="(]";
       //s = "([)]";

        System.out.println(isValid(s));

    }

    public static boolean isValid(String s)
    {
        if(s==null)
            return false;

        Deque<Character> stack=new ArrayDeque<>();
        for(char c:s.toCharArray())
        {
            switch(c)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop()!='(')
                        return false;
                    break;

                case '}':

                    if(stack.isEmpty() || stack.pop()!='{')
                        return false;
                    break;

                case ']':

                    if(stack.isEmpty() || stack.pop()!='[')
                        return false;
                    break;

                default :
                    return false;

            }
        }
        return stack.isEmpty();
    }
}
