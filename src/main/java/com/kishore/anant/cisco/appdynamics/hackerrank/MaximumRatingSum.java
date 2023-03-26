package com.kishore.anant.cisco.appdynamics.hackerrank;

import java.util.ArrayList;

public class MaximumRatingSum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int i =0;
        long maxSum = list.get(i);
        long max_so_far = list.get(i);

        for (i = 1; i < list.size(); i++) {
            long temp_max_so_far = max_so_far + list.get(i);
            max_so_far = Math.max(temp_max_so_far, list.get(i));
            maxSum = Math.max(max_so_far, maxSum);

        }
        System.out.println(maxSum);
    }
}
