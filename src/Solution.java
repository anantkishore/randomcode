import java.util.*;

public class Solution {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        //strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }

        HashMap<String, Map<String, Object>> cache = new HashMap<>();


        while (true) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            if (line != null && !line.isEmpty()) {
                String[] inputs = line.split(" ");
                if (inputs.length == 1) {
                    String command = inputs[0];
                    if (command.equalsIgnoreCase("exit")) {
                        break;
                    } else if (command.equalsIgnoreCase("keys")) {
                        System.out.println(cache.keySet());
                    }
                } else if (inputs.length >= 2) {
                    String command = inputs[0];
                    String key = inputs[1];
                    if (command.equalsIgnoreCase("get")) {
                        if (cache.get(key) != null)
                            System.out.println(cache.get(key));
                    } else if (command.equalsIgnoreCase("delete")) {
                        cache.remove(key);
                    } else if (command.equalsIgnoreCase("search")) {
                        Object value = inputs[2];
                        List<String> matchingKeys = new ArrayList<>();
                        Map.Entry<String, Map<String, Object>> entries = (Map.Entry<String, Map<String, Object>>) cache.entrySet();
                        for (Map.Entry<String, Map<String, Object>> entry : cache.entrySet()) {
                            String currentKey = entry.getKey();
                            Map<String, Object> dataMap = entry.getValue();
                            for (Map.Entry<String, Object> dataMapEntry : dataMap.entrySet()) {
                                if (key == dataMapEntry.getKey()) {
                                    Object currentValue = dataMapEntry.getValue();
                                    if (value == currentValue) {
                                        matchingKeys.add(currentKey);
                                    }
                                }
                            }
                        }
                        System.out.println(matchingKeys.toString());
                    } else {
                        HashMap<String, Object> dataMap = new HashMap<>();
                        for (int i = 2; i < inputs.length - 1; i = i + 2) {
                            dataMap.put(inputs[i], inputs[i + 1]);
                        }
                        cache.put(key, dataMap);
                    }
                }
            }
        }
    }


}

