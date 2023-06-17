import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KUniqueCharacters {

    /*
    Have the function KUniqueCharacters(str) take the str parameter being passed and find the longest substring
    that contains k unique characters, where k will be the first character from the string.
The substring will start from the second position in the string because the first character will be the integer k.
For example: if str is "2aabbacbaa" there are several substrings that all contain 2 unique characters,
namely: ["aabba", "ac", "cb", "ba"], but your program should return "aabba" because it is the longest substring.
If there are multiple longest substrings, then return the first substring encountered with the longest length.
k will range from 1 to 6.

     */
    public static String KUniqueCharacters(String str) {

        int k = Integer.parseInt(str.substring(0,1));
        int i = 1;

        HashMap<Character, Integer> map = new HashMap<>();
        int max_start = i;
        int max_end = i;
        int max_len = 1;
        int len = 0;
        int start = 1;

        while(i < str.length()){
            char c = str.charAt(i);
            if (map.containsKey(c) || map.size() < k){
                map.put(c, i);
                len++;
            }
            else {
                if(len>0){
                    char ch = find_least_index(map);
                    int last_index = map.get(ch);
                    start = last_index+1;
                    map.remove(ch);
                    len = i-last_index;
                }
            }
            if(max_len < len){
                max_len = len;
                max_start = i-len+1;
            }
            i++;
        }
        System.out.println(str.substring(max_start, max_start+len));
        return str.substring(max_start, max_start+len);
    }

    private static Character find_least_index(HashMap<Character, Integer> map) {
        int min_index = Integer.MAX_VALUE;
        Character result = null;
        for (Map.Entry<Character, Integer> entry: map.entrySet())
        {
            char c = entry.getKey();
            int i = entry.getValue();
            if(i < min_index){
                min_index = i;
                result = c;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.print("Test 1 passing: " + (KUniqueCharacters("3aabacbebebe") == "cbebebe") + "\r\n");
        System.out.print("Test 2 passing: " + (KUniqueCharacters("2aabbcbbbadef") == "bbcbbb") + "\r\n");
    }
}
