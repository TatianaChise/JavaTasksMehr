package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




    public class Ferda {

        public static void main(String[] args) {

            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6, 7};
            System.out.println(Arrays.toString(concat(arr1, arr2)));

            Integer[] arr11 = {1, 2, 3};
            Integer[] arr22 = {4, 5, 6, 7};
            System.out.println((Arrays.toString(concat2(arr11, arr22))));


            System.out.println(removeName(new ArrayList<>(Arrays.asList("kdjdl", "AHMED"))));

            System.out.println(removeGreaterThanHundred(new ArrayList<>(Arrays.asList(1, 2, 220, 322, 25, 2, 89, 99, -100))));

        }

        public static int[] concat(int[] arr1, int[] arr2) {


            int[] arr = new int[arr1.length + arr2.length];

            for (int i = 0; i < arr1.length; i++) {
                arr[i] = arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                arr[i + arr1.length] = arr2[i];
            }
            return arr;
        }

        public static Integer[] concat2(Integer[] arr1, Integer[] arr2) {

            List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
            list.addAll(Arrays.asList(arr2));

            return list.toArray(new Integer[0]);
        }

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */

        public static ArrayList<String> removeName(ArrayList<String> list) {
            list.removeIf(p -> p.equalsIgnoreCase("Ahmed"));
            return list;
        }


    /*
    3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
     */

        public static ArrayList<Integer> removeGreaterThanHundred(ArrayList<Integer> list) {
            list.removeIf(p -> p > 100);
            return list;
        }

    }


