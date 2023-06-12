package week4;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Tatiana {
    public static void main(String[] args) {
        System.out.println("Week 4,has 3 Tasks");
        System.out.println("\t #1. Task: Frequency of Characters\n\tWrite a return method that can find the frequency of characters:  \n\tEX: FrequencyOfCharacters(AAABBCDD)==>A3B2C1D2");

        System.out.println("Frequency of all characters in given string is: "+FrequencyOfCharacters("AAABBCDD"));

        System.out.println("---------------------------------------------");

        System.out.println("\t #2. Task: Same letters\n\tWrite a return method that check if a string is build out of yje same letters as another string.\n\tEX:same(abc,cab);-->true\n\tsame(abc,abb);-->false");

        System.out.println("'abc' and 'cab' have same letters : "+SameLettersString("abc","cab"));
        System.out.println("'tatiana' and 'titiana' have same letters : "+SameLettersString("tatiana","titiana"));
        System.out.println("'abc' and 'abb' have the same letters : "+SameLettersString("abc","abb"));


        System.out.println("-----------------------------------------------------");

        System.out.println("\t #3 Task: Remove Duplicates\n\tWrite a method that can remove the duplicated values from String\n\tEX: removeDup(AAABBBCCC)==>ABC");

        System.out.println("Letters used for this string are : "+RemoveDuplicates("AAAAGGVRRE"));
        System.out.println("Letters used for this string are : "+RemoveDuplicates("ggdddderraccbnjggg"));



    }

    public static String FrequencyOfCharacters(String str) {
        String str1="";

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            char ch = str.charAt(i);//ch os assigning the new value
            for(int j=0; j< str.length();j++) {
                if(str.charAt(j)==ch){
                    frequency++;
                }
            }
            if(str1.contains(ch+"")){
                continue;
            }
            str1+=ch+""+frequency;

        }
        return str1;
    }


    public static boolean SameLettersString(String str,String str1) {
        boolean same = true;
        char[] a = str.toCharArray();
        char[] b = str1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            return same;
        }
        return false;
    }


    public static String RemoveDuplicates(String s2) {

        String s3 = "";
        int count = 0;

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j) && !s3.contains(""+s2.charAt(j))) {
                    s3+=ch+"";
                }
            }
        }
        return s3;
    }



}
