package com.kishore.anant.stack;

import java.util.Stack;

public class SortUsingRecursion {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.add(4);
        s.add(3);
        s.add(-3);
        s.add(-1);
        s.add(2);
        System.out.println(s.toString());


        sortStackRecursively(s);

        System.out.println(s.toString());
    }

    private static void sortStackRecursively(Stack<Integer> s) {
        if (s.empty())
            return;

        int item = s.pop();

        sortStackRecursively(s);

        insertSorted(item, s);
    }

    private static void insertSorted(int item, Stack<Integer> s) {

        if (s.isEmpty() || s.peek() <= item)
            s.push(item);
        else {
            int top = s.pop();
            insertSorted(item, s);
            s.add(top);
        }
    }
}
