package com.kishore.anant.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveItemsfromList {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");

        List<Integer> indices = new ArrayList<>();

        indices = Arrays.asList(1,2);

        for (Integer i: indices
        ) {
            System.out.println(i);
        }

        System.out.println(strings); // prints [one, two, three, four]


        purge(strings, indices);
        for (Integer i: indices
        ) {
            strings.remove(i);
        }
        System.out.println(strings);

    }


    private static void purge(List<String> strings, List<Integer> indices) {
        System.out.println(strings);
        for (Integer i: indices
             ) {
            strings.remove(i);
        }
        System.out.println(strings);
    }


}
