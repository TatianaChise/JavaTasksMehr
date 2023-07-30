package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Said {
    public static void main(String[] args) {
        System.out.println("concat2Array1 ({1, 5, 8},{7, 2}) = --------------------->" + Arrays.toString(concat2Array1(new int[]{1, 5, 8}, new int[]{7, 2})));
        System.out.println("concat2Array2 ({1, 2, 3},{4, 5, 6}) = ------------------>" + Arrays.toString(concat2Array2(new Integer[]{1, 2, 3}, new Integer[]{4, 5, 6})));
        System.out.println("concat2Array3 ({\"I\", \"You\", \"He\"}, {\"She\", \"It\"})) = --->" + Arrays.toString(concat2Array3(new String[]{"I", "You", "He"}, new String[]{"She", "It"})));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("ahmedRemoval(\"AHmed\", \"Jean\", \"Michael\", \"Ahmed\", \"Said\", \"Karim\", \"Hana\") = --------->" + ahmedRemoval(new ArrayList<>(Arrays.asList("AHmed", "Jean", "Michael", "Ahmed", "Said", "Karim", "Hana"))));
        System.out.println("nameRemoval((\"ahmED\",\"nancY\", \"Jean Pierre\", \"Caroline\", \"Nancy\", \"naNCy\"),\"Nancy\")---> = " + nameRemoval(new ArrayList<>(Arrays.asList("ahmED", "nancY", "Jean Pierre", "Caroline", "Nancy", "naNCy")), "Nancy"));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("valuesRemoval(Arrays.asList(12,10,101,100,956,99,2,-8,11,213)) = " + valuesRemoval(new ArrayList<>(Arrays.asList(12, 10, 101, 100, 956, 99, 2, -8, 11, 213))));
        System.out.println("valuesRemoval(Arrays.asList()) = " + valuesRemoval(new ArrayList<>(Arrays.asList())));
    }
    /*
                            1) Array - Concat two arrays
                            Write a return method that can concatenate two arrays
    */
    public static int[] concat2Array1(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i + arr1.length] = arr2[i];
        }
        return arr;
    }

    public static Integer[] concat2Array2(Integer[] arr1, Integer[] arr2) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr1));
        arrayList.addAll(Arrays.asList(arr2));
        return arrayList.toArray(new Integer[0]);
    }

    public static String[] concat2Array3(String[] arr1, String[] arr2) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        return list.toArray(new String[0]);
    }
//--------------------------------------------------------------------------------------------------------------
   /*
                    2) ArrayList - Remove "Ahmed"
                    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
                    Write a java operation to remove all the names named Ahmed
     */
    public static ArrayList<String> ahmedRemoval(ArrayList<String> list) {
    list.removeIf(p -> p.equalsIgnoreCase("Ahmed"));
    return list;
}

    public static ArrayList<String> nameRemoval(ArrayList<String> list, String nameToBeRemoved) {
        list.removeIf(p -> p.equalsIgnoreCase(nameToBeRemoved));
        return list;
    }
    //------------------------------------------------------------------------------------------------
    /*
                3) ArrayList - Remove some values
                    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
     */
    public static ArrayList<Integer> valuesRemoval(ArrayList<Integer> list) {
        list.removeIf(p -> p > 100);
        return list;
    }
}
