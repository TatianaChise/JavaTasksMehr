package week5;


public class Gizem {
    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
        findUnique("AAABBBCCCDEF");

    }

    public static void findUnique(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {


            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                unique += ch;
            }
        }
        System.out.println(unique);


    }

    public static String reverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;

    }

}
