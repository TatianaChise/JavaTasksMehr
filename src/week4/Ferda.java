package week4;


import java.util.Arrays;
import java.util.Collections;

public class Ferda {

    public static void main(String[] args) {
        System.out.println("Frequency of every single character method 1 ="+frequencyOfEverySingleChar("aabbjjhjjhy"));
        System.out.println("Frequency of every single character method 2 ="+frequencyOfEverySingleChar2("aabbjjhjjhy"));
        System.out.println("They have same letters= "+sameLetter("absc", "csba"));
        System.out.println(removeDuplicates("aahjdhhdjuldl,djs"));
    }


    public static String frequencyOfEverySingleChar(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {
            int frequency=0;
            char each=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if(each==str.charAt(j)){
                    frequency=frequency+1;
                }
            }
            if(result.contains(each+"")){
                continue;
            }
            result=result+each+""+frequency;
        }
        return result;

    }

    public static String frequencyOfEverySingleChar2(String str){

        String res="";
        String []array=str.split("");
        for (String each : array) {
            int frequency= Collections.frequency((Arrays.asList(array)),each);
            if(!(res.contains((each)))){
                res=res+each+frequency;
            }
        }
        return res;



    }

    public static boolean sameLetter(String str1, String str2) {

        int count = 0;
        boolean isSameLetter = true;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {

                for (int j = 0; j < str2.length(); j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {
                        count = count + 1;
                    }
                }
            }
            if (count > str1.length()) ;
            return true;

        }
        return false;
    }

    public static String  removeDuplicates(String str) {

        String res="";

        for (int i = 0; i < str.length(); i++) {
            if(res.contains(str.charAt(i)+"")){
                continue;
            }
            res=res+str.charAt(i);



        }
        return res;
    }



}



