import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Solution6 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 50, 200, 51, 49, 52}));
    }
    public static int longestConsecutive(int[] nums) {

        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        int max_value = Integer.MIN_VALUE;
        int max_seq_count = 0;
        for(int i: nums){
            boolean flag = false;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                int key = entry.getKey();
                int value = entry.getValue();
                if(key-1 == i){
                    map.remove(key);
                    map.put(i, value);
                    if(max_value < value+1){
                        max_seq_count = value+1;
                    }
                    flag = true;
                }
                else if(key+value == i) {
                    map.put(key, value+1);
                    if(max_value < value+1){
                        max_seq_count = value+1;
                    }
                    flag = true;
                }
            }
            if(!flag){
                map.put(i, 1);
            }
        }
        return max_seq_count;

    }
}
