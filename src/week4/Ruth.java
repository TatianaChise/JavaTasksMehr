package week4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ruth {

    public static void main(String[] args) {
        System.out.println(charFrequency("aaabbbccxxxxxxxxxxx"));
        System.out.println(charFrequency("ABCD123$%#@&456EFG!!!"));
        ///////////////////////////////
        System.out.println(removeDup("jlllllkkkkmmmmllllnnss"));
        ////////////////////
        System.out.println(sameLetters("abcccccdefg", "abcdefffg"));

    }


    public static boolean sameLetters(String str1,String str2){
        ArrayList<Character> str1list=new ArrayList<Character>();
        for(int i=0;i<str1.length();i++)
        {
            str1list.add(str1.charAt(i));

        }
        ArrayList<Character>str2list=new ArrayList<Character>();
        for(int i=0;i<str2.length();i++)
        {
            str2list.add(str2.charAt(i));

        }

return (str2list.containsAll(str1list)&&(str1list.containsAll(str2list)));


    }
    public static String removeDup(String str)
    {
        ArrayList<Character>list=new ArrayList<>();
        char[]strArray=str.toCharArray();
        for (Character each : strArray) {
            if(!list.contains(each))
            {list.add(each);}
        }
        String strnonDup=list.toString();
        strnonDup=strnonDup.substring(1,strnonDup.length()-1).replaceAll(", ","");
        return strnonDup;
    }



    public static String charFrequency(String str) {

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
            String StrEach = each + "" + count;
            if (!list1.contains(StrEach)) {
                list1.add(StrEach);
            }
        }

        String strfrequency=list1.toString();
        strfrequency=strfrequency.substring(1,strfrequency.length()-1);
        strfrequency=strfrequency.replaceAll(", ","");
        return strfrequency;

    }
}