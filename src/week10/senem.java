package week10;

import java.util.*;

public class senem {

    public static void main(String[] args) {

        // ArrayList - Sorting in Ascending Order (without using the sort method):
        ArrayList<Integer> ascendingList = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5));
        ascendingList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List in Ascending Order: " + ascendingList);

        // ArrayList - Sorting in Descending Order (without using the sort method):
        ArrayList<Integer> descendingList = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5));
        descendingList.sort(Comparator.reverseOrder());
        System.out.println("Sorted List in Descending Order: " + descendingList);

        // Map - Sort the map by values:
        Map<Integer, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put(3, 20);
        unsortedMap.put(1, 50);
        unsortedMap.put(2, 10);

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map by Values: " + sortedMap);
    }
}

