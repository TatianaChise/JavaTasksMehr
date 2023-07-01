package week6;

public class Tatiana {
    public static void main(String[] args) {
        int[] arr={10,23,65,24,3,7,100};
        System.out.println("Array_maxim_number(arr) = " + Array_maxim_number(arr));

        int [] arr1={34,68,23,11,7,9,22};
        System.out.println("Array_maxim_number(arr1) = " + Array_maxim_number(arr1));
        System.out.println("Second task");
        String str="fefwe1fe234";
        System.out.println("sum_of_digits(str) = " + sum_of_digits(str));
        String str1="bjsh2khkh3b4h5566";
        System.out.println("sum_of_digits(str1) = " + sum_of_digits(str1));
        System.out.println("PasswordValidation(\"Taniufka01\") = " + PasswordValidation("Taniufka01"));
        System.out.println("PasswordValidation(\"tank\") = " + PasswordValidation("tank"));
        System.out.println("PasswordValidation(\"Msina12$\") = " + PasswordValidation("Msina12$"));
        System.out.println("PasswordValidation(\"T24&\") = " + PasswordValidation("T24&"));
        System.out.println("PasswordValidation(\"TGFDBJKLNBV\") = " + PasswordValidation("TGFDBJKLNBV"));
        System.out.println("PasswordValidation(\"FT JHvgas12&\") = " + PasswordValidation("FT JHvgas12&"));
        System.out.println("PasswordValidation(\"65243789123\") = " + PasswordValidation("65243789123"));
        System.out.println("PasswordValidation(\"Pa$wordWooden5234\") = " + PasswordValidation("Pa$wordWooden5234"));
        System.out.println("PasswordValidation(\"hdk243bdTRD***snj\") = " + PasswordValidation("hdk243bdTRD***snj"));


    }



    /*
    Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */
    public static int Array_maxim_number(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    /*
    String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */


    public static int sum_of_digits(String str){
        int sum=0;

        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                sum=sum +Integer.parseInt(String.valueOf(str.charAt(i)));

            }

        }

        return sum;
    }

    /*
    String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean PasswordValidation(String password) {
        boolean p = true;
        int countUpperCase=0;
        int countLowerCase=0;
        int countDigits=0;
        int countSpecialCharacters=0;

        for (int i = 0; i < password.length(); i++) {


            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                countUpperCase++;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                countLowerCase++;
            } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                countDigits++;
            } else {
                countSpecialCharacters++;
            }

            if (countDigits >= 1 && countLowerCase >= 1 && countUpperCase >= 1 && countSpecialCharacters >= 1 && password.length() >= 6 && !password.contains(" ")) {
                return p;
            }
        }
        return false;
    }








}
