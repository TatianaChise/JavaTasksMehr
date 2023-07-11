package week8;

import java.util.Arrays;

public class senem {

    public static int[] ArrayWithZeroSum(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N - 1; i++) {
            arr[i] = i + 1;
            arr[N - 1] -= arr[i];
        }
        return arr;
    }

    public static void moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index] = num;
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] zeroSumArray = ArrayWithZeroSum(4);
        System.out.println("Array with zero sum: " + Arrays.toString(zeroSumArray));

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }
}