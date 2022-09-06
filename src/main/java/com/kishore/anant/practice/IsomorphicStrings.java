package com.kishore.anant.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    public static void main(String[] args) {
        isIsomorphic("badc", "baba");
    }

    private static boolean isIsomorphic(String s, String t) {

        int m = s.length();
        int n = t.length();

        if(m != n)
            return false;

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            if(s.charAt(i) != t.charAt(i))
            {
                if (map.get(s.charAt(i)) == null && !set.contains(t.charAt(i)) || (map.get(s.charAt(i)) == t.charAt(i)))
                {
                    map.put(s.charAt(i), t.charAt(i));
                    set.add(t.charAt(i));
                }
                else{
                    return false;
                }
            }
            map.put(s.charAt(i), t.charAt(i));
            set.add(t.charAt(i));
        }

        return true;
    }


}
