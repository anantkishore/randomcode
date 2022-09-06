package com.kishore.anant.misc;

import java.util.*;

public class BookSale {
    public static int nthLowestSelling(int[] sales, int n) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: sales){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        HashMap<Integer, Integer> reverseMap = new HashMap<Integer, Integer>();

        List<Integer> values = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: entrySet){
            int value = entry.getValue();
            int key = entry.getKey();
            values.add(value);
            reverseMap.put(value, key);
        }

        Collections.sort(values);

        Map<Integer, Integer> linkHashMap = new LinkedHashMap<Integer, Integer>();
        int counter = 1;
        for(int i: values){
            int key = reverseMap.get(i);
            if(counter == n)
                return key;
            counter++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = nthLowestSelling(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
        System.out.println(x);
    }
}
