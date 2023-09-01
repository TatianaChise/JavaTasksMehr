package week11;
import java.util.HashMap;
import java.util.Map;

public class senem {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 4);
        map.put("B", 3);
        map.put("C", 2);
        map.put("D", 1);

        String minKey = findMinValueKey(map);
        int minValue = map.get(minKey);

        System.out.println("Key with Minimum Value: " + minKey);
        System.out.println("Minimum Value: " + minValue);
    }

    public static String findMinValueKey(Map<String, Integer> map) {
        String minKey = null;
        int minValue = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minValue) {
                minKey = entry.getKey();
                minValue = entry.getValue();
            }
        }

        return minKey;
    }
}