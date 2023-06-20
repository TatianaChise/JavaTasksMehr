package week5;

public class Ferda {

    public static void main(String[] args) {
        System.out.println("uniqueCharacter(\"aaddhhgdhjd;doc\") = " + uniqueCharacter("aaddhhgdhjd;doc"));


        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));


    }

    /*
    String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static String uniqueCharacter (String word) {

        String res="";
        for (int i = 0; i < word.length(); i++) {
            int count=0;

            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)){
                    count=count+1;
                }

            }
            if(count>=2){
                continue;
            }
            else{
                res=res+word.charAt(i);

            }

        }
        return res;
    }

    /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse(String word){

        String res="";
        for (int i = word.length()-1; i >=0; i--) {
            res=res+word.charAt(i);
        }
        return res;
    }


    }



