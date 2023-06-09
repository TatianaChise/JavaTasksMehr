package week4;


import java.util.Arrays;
import java.util.Collections;

public class Ferda {

    public static void main(String[] args) {
        System.out.println("Frequency of every single character method 1 ="+frequencyOfEverySingleChar("aabbjjhjjhy"));
        System.out.println("Frequency of every single character method 2 ="+frequencyOfEverySingleChar2("aabbjjhjjhy"));
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



    }}



