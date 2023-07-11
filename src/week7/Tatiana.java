package week7;

import java.util.Arrays;

public class Tatiana {

    public static void main(String[] args) {

        System.out.println("Write a method that can find the maximum number from an int Array");
        int[] arr2={34,28,1,20,204,38,92};
        System.out.println("Array_Maxim_number(arr2) = " + Array_Maxim_number(arr2));
        System.out.println("Array_Minim_number(arr2) = " + Array_Minim_number(arr2))





        System.out.println(" Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class");
        int []arr={4,1,29,301,0,5};
        System.out.println("Array_Sort_Ascending(arr) = " + Arrays.toString(Array_Sort_Ascending(arr)));


        System.out.println("Write a return method that can sort an int array in descending order without using the sort method of the Arrays class");

        int[]arr1={45,79,3,2,1,102};
        System.out.println("Array_Sort_Descending(arr) = " + Arrays.toString(Array_Sort_Descending(arr1)));


    }

    public static int Array_Minim_number(int[] arr){
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int Array_Maxim_number(int[] arr){
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
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
