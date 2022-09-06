package com.kishore.anant.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RearrangeWordsInSentence {

    public static void main(String[] args) {

        System.out.println(arrangeWords("Leetcode is cool"));

    }

    public static String arrangeWords(String text) {

        String[] words = text.split(" ");
        TreeMap<Integer, List<String>> tm = new TreeMap<Integer, List<String>>();
        for(String word: words)
        {
            if(tm.get(word.length()) == null) {
                List<String> list = new ArrayList<>();
                list.add(word);
                tm.put(word.length(), list);
            }
            else
            {
                List<String> list = tm.get(word.length());
                list.add(word);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, List<String>> entry: tm.entrySet())
        {
            for(String word: entry.getValue()) {
                sb.append(word + " ");
            }
        }

        String sentence = sb.toString().trim().toLowerCase();
        String final_sent = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
        return final_sent;
    }
}
