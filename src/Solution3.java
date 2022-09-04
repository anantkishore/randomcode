import java.util.*;

public class Solution3 {

    /*
    Given an unsorted array of numbers, find the top ‘K’ frequently occurring numbers in it.

Example 1:

Input: [1, 3, 5, 12, 11, 12, 11], K = 2
Output: [12, 11]
Explanation: Both '11' and '12' apeared twice.
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 12, 11, 12, 11};
        Map<Integer, Integer> frequncyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (frequncyMap.containsKey(arr[i])) {
                frequncyMap.put(arr[i], frequncyMap.get(arr[i]) + 1);
            } else {
                frequncyMap.put(arr[i], 1);
            }
        }
        TreeMap<TreeSetElement, Integer> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : frequncyMap.entrySet()) {
            treeMap.put(new TreeSetElement(entry.getKey(), entry.getValue()), 0);
        }
        int k = 2;
        int counter = 0;
        List<Integer> values = new ArrayList<>();
        for (Map.Entry<TreeSetElement, Integer> entry : treeMap.entrySet()) {
            if (counter == k)
                break;
            TreeSetElement element = entry.getKey();
            values.add(element.getItem());
        }
        System.out.println(values.toString());
    }
}

class TreeSetElement implements Comparable {

    int item;
    int frequency;

    public TreeSetElement(Integer key, Integer value) {
        this.item = key;
        this.frequency = value;
    }

    public int getItem() {
        return this.item;
    }

   
    @Override
    public int compareTo(Object o) {
        TreeSetElement element = null;
        if (o instanceof TreeSetElement) {
            element = (TreeSetElement) o;
        }
        if (element != null) {
            if (element.frequency > this.frequency) {
                return 1;
            }
            if (element.frequency == this.frequency) {
                return 0;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
