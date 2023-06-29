package week5;

import java.util.ArrayList;

public class Ruth {
    public static void main(String[] args) {
        System.out.println(uniqueChar("AAABBBCCCDEF"));
        System.out.println(uniqueChar("ABBB2CCCDDEF!"));

        System.out.println(reverseString("abcdef"));
    }
    public static String uniqueChar(String str){


            ArrayList<String> list1 = new ArrayList<>();
            int count = 0;

            char[] strArray = str.toCharArray();
            for (char each : strArray) {
                count=0;
                for (char comparison : strArray) {
                    if (each == comparison) {
                        count++;
                    }
                }

                if(count==1) {list1.add(String.valueOf(each));}

            }

            String strfrequency=list1.toString();
            strfrequency=strfrequency.substring(1,strfrequency.length()-1);
            strfrequency=strfrequency.replaceAll(", ","");
            return strfrequency;


    }
public static String reverseString(String Str){
    String reverseStr="";
        for (int i=(Str.length()-1);i>=0; i--)
    {
        reverseStr+=Str.charAt(i);
    }
        return reverseStr;


}

}
