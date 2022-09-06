package com.kishore.anant.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {


    }

    public static boolean isValidParenthesis(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> brakcets = new HashMap<>();
        brakcets.put('(', ')');
        brakcets.put('{', '}');
        brakcets.put('[', ']');

        HashSet<Character> openBrackets = new HashSet<>();
        openBrackets.add('(');
        openBrackets.add('{');
        openBrackets.add('[');

        HashSet<Character> closedBrackets = new HashSet<>();
        closedBrackets.add(')');
        closedBrackets.add('}');
        closedBrackets.add(']');


        for (Character c : s.toCharArray()
        ) {
            if (openBrackets.contains(c)) {
                stack.push(c);
            } else if (closedBrackets.contains(c) && c == brakcets.get(stack.peek())) {
                stack.pop();
            } else {
                break;
            }
        }
        if (stack.size() == 0) {
            result = true;
        }

        return result;
    }
}
