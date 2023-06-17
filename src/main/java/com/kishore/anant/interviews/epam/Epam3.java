package com.kishore.anant.interviews.epam;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.HashMap;
import java.util.TreeMap;

public class Epam3 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6};

        int k=3;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.println(num);
            hashMap.put(i, num);
            treeMap.put(i, num);
        }
        System.out.println(k);
        System.out.println(treeMap.toString());
        System.out.println(hashMap.toString());
    }
}
