package week7;

import java.util.Arrays;

public class Tatiana {
    public static void main(String[] args) {
        int []arr={4,1,29,301,0,5};
        System.out.println("Array_Sort_Ascending(arr) = " + Arrays.toString(Array_Sort_Ascending(arr)));
        System.out.println("Array_Sort_Descending(arr) = " + Arrays.toString(Array_Sort_Descending(arr)));

    }
    public static int [] Array_Sort_Ascending(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            int temp=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;

    }


    public static int [] Array_Sort_Descending(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            int temp=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;

    }

}
