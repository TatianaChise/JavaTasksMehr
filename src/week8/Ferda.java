package week8;

import java.util.Arrays;

public class Ferda {
    public static void main(String[] args) {
        System.out.println("sumZero1(5) = " + Arrays.toString(sumZero1(5)));

        System.out.println("(sumZero2(5)) = " + Arrays.toString(sumZero2(5)));

        int[] arr={1,2,0,5,0,6,8,0,7,9,11};

        System.out.println("(swapZero(arr)) = " + Arrays.toString(swapZero(arr)));
    }

    public static int[] sumZero1(int N) {
        int[] array1 = new int[N];

        if (N <= 2) {
            return null;
        }

        for (int i = 0; i < N; i++) {

            if (i == N - 1) {
                array1[i] = -(N - 2) * (N - 1) / 2;
            } else {
                array1[i] = i;
            }

        }
        return array1;
    }

    public static int[] sumZero2(int N) {
        int[] array = new int[N];

        for (int i = 1, j = N / 2; i <= N / 2; i++, j++) {

            array[i - 1] = i;
            array[j] = -i;

        }
        return array;
    }

    public static int[] swapZero(int[] arr1) {


        int count = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == 0) {
                count = count + 1;
            }
        }

        int[] arr3 = new int[arr1.length - count];

        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                arr3[j] = arr1[i];
                j++;
            }
        }

        int temp = 0;

        for (int i = 0; i < arr3.length; i++) {  // to sort

            for (int j = i + 1; j < arr3.length; j++) {

                if (arr3[i] > arr3[j]) {
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        int[] arr4=new int[arr1.length];

        for (int i = 0; i < arr3.length; i++) {
            arr4[i]=arr3[i];
        }
        return arr4;
    }

}
