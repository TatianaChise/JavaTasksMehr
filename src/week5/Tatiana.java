package week5;

public class Tatiana {
    public static void main(String[] args) {
        System.out.println("UniqueCharacters(\"AAABBBCCCDEF\") = " + UniqueCharacters("AAABBBCCCDEF"));
        System.out.println("UniqueCharacters(\"KKKKALAMARRI\") = " + UniqueCharacters("KKKKALAMARRI"));

        System.out.println("Reverse(\"ABCD\") = " + Reverse("ABCD"));
        System.out.println("Reverse (\"Tatiana\")= "+Reverse("Tatiana"));


    }
    /*
    String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static String UniqueCharacters(String str){
        String str1="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                str1 += ch;
            }

        }
        System.out.println(str1);
        return str1;
    }

    /*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */

    public static String Reverse(String s1){
        String s2="";
        for (int i =s1.length()-1; i >=0; i--) {
            char chr=s1.charAt(i);
            s2+=chr+"";

        }

        return s2;
    }

}
