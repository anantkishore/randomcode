import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.util.stream.Collector;

public class HashMapSortingBasedOnValue {

    public static void main(String[] args) {


        int[] arr = { 1,13,5, 6, 2};

        arr = Arrays.stream(arr).filter(num -> {
            return num>=5;
        }).sorted().toArray();

        Arrays.sort(arr);

       /* for (int i = arr.; i < ; i++) {

        }*/




        /*HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 5);
        map.put('b', 3);
        map.put('c', 2);
        map.put('d', 4);

        List<Integer> valueList = new ArrayList<>();
        HashMap<Integer, Character> reverseMap = new HashMap<>();
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            valueList.add(entry.getValue());
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        Collections.sort(valueList);

        HashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (int i=valueList.size()-1; i >= 0; i--){
            int value = valueList.get(i);
            sortedMap.put(reverseMap.get(value), value);
            System.out.println( reverseMap.get(value) +" :: "+ value);
        }*/







    }
}
