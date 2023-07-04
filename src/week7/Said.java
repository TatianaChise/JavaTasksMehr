package week7;

import java.util.Arrays;

public class Said {
    public static void main(String[] args) {

        System.out.println("minInArray(new int[]{1, 2, 3, 0, 4}) = " + minInArray(new int[]{1, 2, 3, 0, -1, 4}));
        System.out.println("minInArray(new int[]{0, 0, 0, 0, -0, -4}) = " + minInArray(new int[]{0, 0, 0, 0, -0, -4}));
        System.out.println("minInArray(new int[]{1, 0, 3, 0, -1, -4}) = " + minInArray(new int[]{1, 0, 3, 0, -1, -4}));
        System.out.println("minInArray(new int[]{}) = " + minInArray(new int[]{}));
        System.out.println("minInArray(new int[]{1}) = " + minInArray(new int[]{1}));

        System.out.println("//------------------------------------------------------------------------------------------");
        System.out.println("maxInArray(new int[]{5, 4, 3, 2, 1}) = " + maxInArray(new int[]{5, 4, 3, 2, 1}));
        System.out.println("maxInArray(new int[]{10}) = " + maxInArray(new int[]{10}));
        System.out.println("maxInArray(new int[]{}) = " + maxInArray(new int[]{}));
        System.out.println("maxInArray(new int[]{ 4, 0, 4, 5, -19, 3, 11 }) = " + maxInArray(new int[]{4, 0, 4, 5, -19, 3, 11}));

        System.out.println("//------------------------------------------------------------------------------------------");
        System.out.println("sortAscend(new int[]{0,3,-9,11})) = " + Arrays.toString(sortAscend(new int[]{0, 3, -9, 11})));
        System.out.println("sortAscend(new int[]{0}) = " + Arrays.toString(sortAscend(new int[]{0})));
        System.out.println("sortAscend(new int[]{}) = " + Arrays.toString(sortAscend(new int[]{})));
        System.out.println("sortAscend(new int[]{-5, 8, 10, 1, 4, -7, 8, 1, -2}) = " + Arrays.toString(sortAscend(new int[]{-5, 8, 10, 1, 4, -7, 8, 1, -2})));

        System.out.println("//------------------------------------------------------------------------------------------");
        System.out.println("sortDescend(new int[]{0,3,-9,11})) = " + Arrays.toString(sortDescend(new int[]{0, 3, -9, 11})));
        System.out.println("sortDescend(new int[]{0}) = " + Arrays.toString(sortDescend(new int[]{0})));
        System.out.println("sortDescend(new int[]{}) = " + Arrays.toString(sortDescend(new int[]{})));
        System.out.println("sortDescend(new int[]{-5, 8, 10, 1, 4, -7, 8, 1, -2}) = " + Arrays.toString(sortDescend(new int[]{-5, 8, 10, 1, 4, -7, 8, 1, -2})));

    }

    public static String minInArray(int[] arr) {

        if (arr.length == 0) {
            return "array length must ne greater than 0";
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min + "";
    }

    //--------------------------------------------------------------------------------------------
    public static String maxInArray(int[] arr) {

        if (arr.length == 0) {
            return "array length must ne greater than 0";
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max + "";
    }
    //--------------------------------------------------------------------------------------------

    public static int[] sortAscend(int[] arr) {//  arr = {10, 9, 8, 7};
        //          0  1  2  3
        //int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int med = arr[i];
                    arr[i] = arr[j];
                    arr[j] = med;
                }
            }
        }
        return arr;
    }

    //------------------------------------------------------------------------------------------
    public static int[] sortDescend(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int med = arr[i];
                    arr[i] = arr[j];
                    arr[j] = med;
                }
            }
        }
        return arr;
    }


}
