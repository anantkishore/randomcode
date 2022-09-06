package com.kishore.anant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(30);
        marks.add(20);
        marks.add(40);
        marks.add(10);
        System.out.println("Hello World!");
        System.out.println(marks.toString());
        Collections.sort(marks);
        System.out.println(marks.toString());
    }
}

