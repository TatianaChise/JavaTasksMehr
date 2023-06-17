package week5;

public class Said {
    public static void main(String[] args) {
        System.out.println("unique(\"AABCCCDEF\") = " + unique("AABCCCDEF"));
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));
        System.out.println("unique(\"N\") = " + unique("N"));
        System.out.println("unique(\"aaVVABbbbVv\") = " + unique("aaVVABbbbVv"));
        System.out.println("--------------------------------------------------------------");
        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));
        System.out.println("reverseString(\"A\") = " + reverseString("A"));
        System.out.println("reverseString(\"123456789\") = " + reverseString("123456789"));
        System.out.println("reverseString(\"])###$$$([\") = " + reverseString("])###$$$(["));
    }

    /*
      String -- Find the unique
          Write a return method that can find the unique characters from the String
          Ex: unique("AAABBBCCCDEF") ==> "DEF";
       */
    public static String unique(String str) {
        int count;
        String uniqueChrStr = "";
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count++;
                }
                if (count == 1) {
                    break;
                }
            }
            if (count == 0) {
                uniqueChrStr += str.charAt(i);
            }
        }
        return uniqueChrStr;
    }

    //------------------------------------------------------------------------------------------------
    /*
     String -- Reverse
      Write a return method that can reverse String
      Ex: Reverse("ABCD"); ==> DCBA
   */
    public static String reverseString(String str) {
        String strRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strRev += str.charAt(i);
        }
        return strRev;
    }
}
