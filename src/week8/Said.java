package week8;

import java.util.Arrays;

public class Said {
    public static void main(String[] args) {
        System.out.println("sumZero(6) = " + Arrays.toString(sumZero(6)));
        System.out.println("sumZero(5) = " + Arrays.toString(sumZero(5)));
        System.out.println("sumZero(100) = " + Arrays.toString(sumZero(100)));
        System.out.println("sumZero(1) = " + Arrays.toString(sumZero(1)));
        System.out.println("sumZero(0) = " + Arrays.toString(sumZero(0)));
        System.out.println("sumZero(33) = " + Arrays.toString(sumZero(33)));
        System.out.println("-------------------------------------------------------------");
        System.out.println("{1, 0, 2, 0, 3, 0, 4, 0} ---> " + Arrays.toString(moveZeros(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));
        System.out.println("{1, 0, 0, 0, 0, 0, 4, 0} ---> " + Arrays.toString(moveZeros(new int[]{1, 0, 0, 0, 0, 0, 4, 0})));
        System.out.println("{0, 0, 0, 0, 0, 0, 0, 1} ---> " + Arrays.toString(moveZeros(new int[]{0, 0, 0, 0, 0, 0, 0, 1})));
        System.out.println("{} ---> " + Arrays.toString(moveZeros(new int[]{})));
        System.out.println("{1,0} ---> " + Arrays.toString(moveZeros(new int[]{1, 0})));
        System.out.println("{0} ---> " + Arrays.toString(moveZeros(new int[]{0})));
        System.out.println("{1, 3, 2, 0, 1, 1, 4, 0} ---> " + Arrays.toString(moveZeros(new int[]{1, 3, 2, 0, 1, 1, 4, 0})));
        System.out.println("{1, 3, 2, 0, 1, 0, 0, 0}) ---> " + Arrays.toString(moveZeros(new int[]{1, 3, 2, 0, 1, 0, 0, 0})));

    }

    public static int[] sumZero(int N) {
        int[] arr = new int[N];

        if (N <= 1 || N >= 100) {
            return new int[]{};
        }
        for (int i = 1, j = N / 2; i <= N / 2; i++, j++) {
            arr[i - 1] = i;
            arr[j] = -i;
        }

        return arr;
    }

    //------------------------------------------------------------------------------------------
    public static int[] moveZeros(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
        return arr1;
    }
}
