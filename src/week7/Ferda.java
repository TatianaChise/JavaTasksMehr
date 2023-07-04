package week7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ferda {

    public static void main(String[] args) {
        int[] array={1,-9,8,-98,70,0};
        System.out.println("max(array) = " + max(array));
        ascending(array);
        descending(array);
    }

    //Write a method that can find the maximum number from an int Array

    public static int max(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {

            if(array[i]>max){
                max=array[i];
            }

        }
        return max;
    }

    public static void ascending(int[] array){

        int swap=0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j <array.length ; j++) {
                if(array[i]>array[j]){
                    swap=array[i];
                    array[i]=array[j];
                    array[j]=swap;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void descending(int[] array){

        int swap=0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j <array.length ; j++) {
                if(array[i]<array[j]){
                    swap=array[i];
                    array[i]=array[j];
                    array[j]=swap;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
