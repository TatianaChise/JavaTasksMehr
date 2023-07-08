package week7;

public class Tatiana {
    public static void main(String[] args) {

        System.out.println("Write a method that can find minim and max number from an int Array ");
        int[] arr={109,23,54,34,3,7,1};
        System.out.println("Array_Minim_number(arr) = " + Array_Minim_number(arr));
        System.out.println("Array_Maxim_number(arr) = " + Array_Maxim_number(arr));
        int[]arr1={4,8,23,76,34,100,256};
        System.out.println("Array_Minim_number(arr1) = " + Array_Minim_number(arr1));
        System.out.println("Array_Maxim_number(arr1) = " + Array_Maxim_number(arr1));
        int[]arr2={34,53,56,345,54,279,77};
        System.out.println("Array_Minim_number(arr2) = " + Array_Minim_number(arr2));
        System.out.println("Array_Maxim_number(arr2) = " + Array_Maxim_number(arr2));

        System.out.println("-----------------------------------");
        System.out.println("Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class");

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





}
