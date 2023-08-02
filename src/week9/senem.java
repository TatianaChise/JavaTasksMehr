package week9;

import java.util.ArrayList;
import java.util.List;

public class senem {
    public static void main(String[] args) {

        // 1) Array - Concat two arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] resultArray = concatenateArrays(array1, array2);

        System.out.println("1) Concat two arrays:");

        for (int num : resultArray) {
            System.out.print(num + " ");
        }

        // 2) ArrayList - Remove "Ahmed"
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        removeName(names, "Ahmed");

        System.out.println("\n\n2)Remove 'Ahmed':");
        for (String name : names) {
            System.out.println(name);
        }

        //3) ArrayList - Remove some values
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(101);
        numbers.add(3);
        numbers.add(4);
        numbers.add(200);

        removeValuesGreaterThan100(numbers);

        System.out.println("\n3) Remove some values:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // 1) Array - Concat two arrays
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    //2) ArrayList - Remove "Ahmed"
    public static void removeName(List<String> list, String target) {
        list.removeIf(name -> name.equals(target));
    }

    // 3) ArrayList - Remove some values
    public static void removeValuesGreaterThan100(List<Integer> list) {
        list.removeIf(num -> num > 100);
    }
}