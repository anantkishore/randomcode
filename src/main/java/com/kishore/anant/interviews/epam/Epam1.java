package com.kishore.anant.interviews.epam;

import java.util.HashMap;
import java.util.Map;

public class Epam1 {

    public static void main(String[] args) {


        String str = "abcbadb";

        int i =0;
        int len = 0;
        int start = 0;
        int max_len = 0;
        int max_start = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(i < str.length()){
            char c = str.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, i);
                len++;
            }
            else{
                int lastIndex = map.get(c);
                start = i - lastIndex;
                if(start < lastIndex) {
                    len = i - lastIndex;
                }
            }
            if(len > max_len){
                max_len = len;
                max_start = start;
            }
            i++;
        }
        System.out.println(max_len);
        System.out.println(max_start);
        System.out.println(str.substring(max_start, max_start+max_len));


    }
}
