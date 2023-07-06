package in.kishore.anant.july.day15;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "the sky is blue";

        String result = reverseWords(s);

        System.out.println(result);
    }

    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length-1; i >= 0; i--) {
            String word = words[i];
            if(word.trim().length() > 0) {
                sb.append(word).append(" ");
            }
        }
        return sb.toString().trim();
    }

}
