package week7;

import java.util.Arrays;

public class Senem {

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tempValue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempValue;
                }
            }
        }
        return arr;
    }

    public static int[] sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int tempValue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempValue;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        int minimum = findMinimum(arr);
        System.out.println("Minimum: " + minimum);

        int[] ascendingArr = sortAscending(arr);
        System.out.println("Ascending: " + Arrays.toString(ascendingArr));

        int[] descendingArr = sortDescending(arr);
        System.out.println("Descending: " + Arrays.toString(descendingArr));
    }



}
