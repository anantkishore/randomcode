package in.kishore.anant.july.sliding.window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithAtMostTwoDistinctCharacters {

    public static void main(String[] args) {

        int k = 2;
        String s = "abbbbbbc";

        int ans = lengthOfLongestSubstringTwoDistinct(k, s);
        System.out.println(ans);

        k = 3;
        s = "abcddefg";

        ans = lengthOfLongestSubstringTwoDistinct(k, s);
        System.out.println(ans);

        k = 3;
        s = "aaaaaaaa";

        ans = lengthOfLongestSubstringTwoDistinct(k, s);
        System.out.println(ans);

        k = 1;
        s = "abcefg";

        ans = lengthOfLongestSubstringTwoDistinct(k, s);
        System.out.println(ans);

    }

    private static int lengthOfLongestSubstringTwoDistinct(int k, String str) {
        int maxWindow = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        while (end < str.length()) {
            char ch = str.charAt(end);
            set.add(ch);

            while (set.size() > k) {
                ch = str.charAt(start);
                set.remove(ch);
                start++;
            }

            if (set.size() <= k) {
                if (maxWindow < end - start + 1) {
                    maxWindow = end - start + 1;
                }
            }

            end++;
        }
        return maxWindow;
    }
}
