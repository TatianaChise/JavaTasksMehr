package week4;

public class Said {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDADBBACAD"));
        System.out.println(frequencyOfChars("aAAAppPPwW"));
        System.out.println("---------------------------------------------");
        System.out.println(same("acb", "cab"));
        System.out.println(same("djhe", "b"));
        System.out.println(same("abcdefg", "gfedcba"));
        System.out.println(same("abcdefg", "hgfedcba"));
        System.out.println(same("", ""));
        System.out.println("---------------------------------------------");
        System.out.println(removeDup("AAAAABBBcccBCCCaaAA"));

    }
    /* String -- Frequency of Characters
       Write a return method that can find the frequency of characters.
              Ex: FrequencyOfChars("AAABBCDD")==>A3B2C1D2
     */
    public static String frequencyOfChars(String str){
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {//0,1
            int count = 1;

            for (int j = i+1; j < str.length(); j++) {//1,2,3,4,5,6,7
                if (str.charAt(i) == str.charAt(j)) {//t,t,f,f,f,t,f
                    count++;//2,3,4,
                }
            }
            if(!str1.contains(""+str.charAt(i))) {
                str1 = str1 + str.charAt(i) + "" + count;//A4
            }
        }
        return str1;
    }
    //----------------------------------------------------------------------------------------------------
                 /*
                    String -- Same letters
                    Write a return method that check if a string is build out of the same letters as another string
                    Ex: same("abc","cab");->true;
                    Same("abc","abb");->false
                 */
    public static boolean same(String s1, String s2) {//acb, cba

        boolean result = false;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {//0,1,2
            for (int j = 0; j < s2.length(); j++) {//0,1,2,0,1,2,0,1,2
                if (s1.charAt(i) == s2.charAt(j)) {//f,f,t,t,f,f,f,t,f
                    count++;//1,2,3
                }
            }
        }
        if (s1.length() == s2.length() && count == s1.length()) {
            result = true;
        }
        return result;
    }
    //-------------------------------------------------------------------------------------------------------
                /*
                String -- Remove Duplicates
                Write a return method that can remove the duplicated values from String
                Ex: removeDup("AAABBBCCC")==>ABC
                 */
    public static String removeDup(String str) {//("AAAAABBBBBBBBBBCCCC")==>ABC
        String newStr = "";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {//0,2,
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j) && !newStr.contains(""+str.charAt(i))){
                    newStr = newStr + str.charAt(i);
                }
            }
        }
        return newStr;
    }
}

