package com.kishore.anant.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyStreams {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //System.out.println(list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));


    }
}
