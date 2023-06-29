package week6;

public class Ferda {

    public static void main(String[] args) {

        System.out.println("password(\"asD123$%\") = " + password("asD123$%"));
        System.out.println("password(\"al56\") = " + password("al56"));
        System.out.println("password(\" gY677*9)\") = " + password(" gY677*9)"));
        System.out.println("max() = " + max());
        int[] arr={1,2,3,4,5};
        System.out.println("max(arr) = " + max(arr));

        System.out.println("sumOfDigit(\"Ferda\") = " + sumOfDigit("Ferda"));
        System.out.println("sumOfDigit(\"123ferda\") = " + sumOfDigit("123ferda"));


    }

    public static int sumOfDigit(String word){
        int sum=0;


        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)>=48 && word.charAt(i)<=57) {
                sum = sum+Integer.parseInt(""+word.charAt(i));
            }
            else {
                continue;
            }

        }
        return sum;
    }








    public static int max(){

        int[]number={1,23,5,6,-9};
        int max=number[0];

        for (int i = 1; i < number.length; i++) {

            if(number[i]>max){
                max=number[i];
            }


        }
        return max;
    }

    public static int max( int[] array){


        int max=array[0];

        for (int i = 1; i < array.length; i++) {

            if(array[i]>max){
                max=array[i];
            }


        }
        return max;
    }



    public static boolean password(String password) {


        int lower = 0;
        int upper = 0;
        int special = 0;
        int number = 0;

        if(password.length()>=6 && !password.contains(" ")) {

            for (int i = 0; i < password.length(); i++) {

                if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                    lower = lower + 1;

                } else if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                    upper = upper + 1;

                } else if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    number = number + 1;

                } else if ((password.charAt(i) >= 33 && password.charAt(i) <= 47) || (password.charAt(i) >= 58 && password.charAt(i) <= 64)) {
                    special = special + 1;
                }

            }
            if (lower >= 1 && upper >= 1 && number >= 1 && special >= 1) {
                return true;
            }
        }
        return false;

    }
}