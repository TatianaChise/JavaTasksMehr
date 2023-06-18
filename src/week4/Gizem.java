package week4;

import java.util.Arrays;
import java.util.Collections;

public class Gizem {
    public static void main(String[] args) {

        frequency("aaabbcdd");

        System.out.println("isSameLetters(\"abc\", \"abb\") = " + isSameLetters("abc", "abb"));
        removeDuplicates("aaaaabbbbbbbcccccc");


    }

    public static void frequency(String str) {

        String result = "";

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (!result.contains(each)) {
                result += each + frequency;
            }
        }
        System.out.println("Frequency = "+result);

    }

    public static boolean isSameLetters(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();


        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    public static void removeDuplicates(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+ each)) {

                result += each;
            }


        }
        System.out.println("Remove Duplicates = "+result);
    }

    }


