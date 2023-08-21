package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gizem {

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] concatenatedArray = concatenateArrays(array1, array2);
        System.out.println("Concatenated array: " + Arrays.toString(concatenatedArray));

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        List<String> namesWithoutAhmed = new ArrayList<>();
        for (String name : names) {
            if (!name.equals("Ahmed")) {
                namesWithoutAhmed.add(name);
            }
        }

        System.out.println("Names after removing Ahmed: " + namesWithoutAhmed);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 105, 6, 200));

        List<Integer> filteredNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number <= 100) {
                filteredNumbers.add(number);
            }
        }

        System.out.println("Numbers after removing values greater than 100: " + filteredNumbers);
    }
    }


