package week10;

import java.util.*;

public class Said {
    /*
               ArrayList - sorting in ascending
                   Write a method that can sort the ArrayList in Ascending order without using
                   the sort method.

               ArrayList - sorting in descending order
                   Write a method that can sort the ArrayList in descending order without
                   using the sort method.

               Map - Sort the map by values
                   Write a method that can sort the Map by values.
        */
    public static void main(String[] args) {
        System.out.println("[5, 8, 6] ----------> " + arrayListAscendSort(new ArrayList<Integer>(Arrays.asList(5, 8, 6))));
        System.out.println("[6] ----------> " + arrayListAscendSort(new ArrayList<Integer>(Arrays.asList(6))));
        // arrayListAscendSort(new ArrayList<Integer>(Arrays.asList()));
        System.out.println("[-15, 8, -4, 7, 0, 10, 44] ----------> " + arrayListAscendSort(new ArrayList<Integer>(Arrays.asList(-15, 8, -4, 7, 0, 10, 44))));
        System.out.println("[5, -4, 0, 1, -2, 10] ----------> " + arrayListAscendSort(new ArrayList<Integer>(Arrays.asList(5, -4, 0, 1, -2, 10))));

        System.out.println("----------------------------------------------------------------------");

        System.out.println("[5, 8, 6] ----------> " + arrayListDescSort(new ArrayList<Integer>(Arrays.asList(5, 8, 6))));
        System.out.println("[6] ----------> " + arrayListDescSort(new ArrayList<Integer>(Arrays.asList(6))));
        //arrayListDescSort(new ArrayList<Integer>(Arrays.asList()));
        System.out.println("[-15, 8, -4, 7, 0, 10, 44] ----------> " + arrayListDescSort(new ArrayList<Integer>(Arrays.asList(-15, 8, -4, 7, 0, 10, 44))));

        System.out.println("----------------------------------------------------------------------");

        Map<String, Integer> map = new TreeMap<>();
        map.put("Said", 100);
        map.put("Hana", 102);
        map.put("Jordan", 98);
        map.put("Omar", 67);
        map.put("POJO", 85);

        Map<String, Integer> map1 = new TreeMap<>();

        Map<String, Integer> map2 = new TreeMap<>();

        map2.put("a",-2);

        Map<String, Integer> map3 = new TreeMap<>();
        map3.put("Said", -5);
        map3.put("Hana", 1000);
        map3.put("Jordan", -9);
        map3.put("Omar", 670);
        map3.put("POJO", -805);

        System.out.println("mapSortValues(map) = " + mapSortValues(map));
        System.out.println("mapSortValues(map1) = " + mapSortValues(map1));
        System.out.println("mapSortValues(map2) = " + mapSortValues(map2));
        System.out.println("mapSortValues(map3) = " + mapSortValues(map3));

    }

    public static ArrayList arrayListAscendSort(ArrayList<Integer> r) {
        for (int i = 0; i < r.size(); i++) {
            int min = r.get(i);
            for (int j = i + 1; j < r.size(); j++) {
                if (r.get(j) < min) {
                    int med = min;
                    min = r.get(j);
                    r.set(i, min);
                    r.set(j, med);
                }
            }
        }

        return r;
    }

    public static ArrayList arrayListDescSort(ArrayList<Integer> r) {
        for (int i = 0; i < r.size(); i++) {
            int max = r.get(i);
            for (int j = i + 1; j < r.size(); j++) {
                if (r.get(j) > max) {
                    int med = max;
                    max = r.get(j);
                    r.set(i, max);
                    r.set(j, med);
                }
            }
        }
        return r;
    }

    public static Map mapSortValues(Map<String, Integer> map) {
        if (map.size() < 1) {
            return null;
        }
        ArrayList<Integer> valuesSortedList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            valuesSortedList.add(entry.getValue());
        }
        arrayListAscendSort(valuesSortedList);
        //System.out.println("valuesSortedList = " + valuesSortedList);
        Map<Integer, String> mapEntryReversed = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            mapEntryReversed.put (eachEntry.getValue(), eachEntry.getKey());
        }
        //System.out.println("mapEntryReversed = " + mapEntryReversed);

        Map<String,Integer>sortedMap = new LinkedHashMap<>();
        for (int value : valuesSortedList) {
            sortedMap.put(mapEntryReversed.get(value),value);
        }
        return sortedMap;
    }
}
