package com.kishore.anant.neetcode;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};
        boolean flag = false;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                flag = true;
                break;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(flag);
    }
}
