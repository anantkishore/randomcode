package in.kishore.anant.july.sliding.window;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowSubString {

    public static void main(String[] args) {
        String text = "ADOBECODEBANC";
        String pattern = "ABC";

        String result = findSmallestWindow(text, pattern);

        System.out.println(result);
    }

    private static String findSmallestWindow(String s, String t) {

        int end =0;
        int start = 0;
        int minWindow = Integer.MAX_VALUE;
        String result = "";

        Map<Character, Integer> map = new HashMap<>();
        int len = t.length();

        for (char ch: t.toCharArray()){
            if(map.get(ch) != null) {
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }

        while(end < s.length()){

            char ch = s.charAt(end);

            if(map.get(ch) != null){
                if(map.get(ch) > 0){
                    len--;
                }
                map.put(ch, map.get(ch)-1);
            }

            while(len == 0){

                if(minWindow > end-start+1){
                    minWindow = end-start+1;
                    result = s.substring(start, end+1);
                }
                ch = s.charAt(start);
                if(map.get(ch) != null) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) > 0 ){
                        len++;
                    }
                }
                start++;
            }
            end++;
        }
        return result;
    }



}
