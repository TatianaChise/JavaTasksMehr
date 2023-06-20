package week5;

public class Ferda {
    public static void main(String[] args) {
        System.out.println("UniqueCharacters(\"aaabgbbsjsjssjkl\") = " + UniqueCharacters("aaabgbbsjsjssjkl"));
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
    }
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
        // System.out.println(str1);
        return str1;
    }

    public static String reverse(String word){
        String res="";

        for (int i = word.length()-1; i >=0 ; i--) {
            res=res+word.charAt(i);

        }
        return res;
    }
}
