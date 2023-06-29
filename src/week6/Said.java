package week6;

import java.util.Arrays;
import java.util.Collections;

public class Said {
    public static void main(String[] args) {
        System.out.println("*******************  MAX in an array    ***************************");
         /*
            Array -- Find Maximum
            Write a method that can find the maximum number from an int Array
         */
        System.out.println("maxInArray1(new int[]{1, 5, 6, 2, -4, 12, 5}) = " + maxInArray1(new int[]{1, 5, 6, 2, -4, 12, 5}));
        System.out.println("maxInArray1(new int[]{1, 1, 1, 1, -1, -1}) = " + maxInArray1(new int[]{1, 1, 1, 1, -1, -1}));
        System.out.println("maxInArray1(new int[]{}) = " + maxInArray1(new int[]{}));
        System.out.println("maxInArray1(new int[]{-10, -10, 10, 34, 65}) = " + maxInArray1(new int[]{-10, -10, 10, 34, 65}));

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("maxInArray2(new int[]{-10, -10, 10, 34, 65}) = " + maxInArray2(new int[]{-10, -10, 10, 34, 65}));
        System.out.println("maxInArray2(new int[]{7, 5, 10, -4}) = " + maxInArray2(new int[]{7, 5, 10, -4}));
        System.out.println("maxInArray2(new int[]{}) = " + maxInArray2(new int[]{}));
        System.out.println("maxInArray2(new int[]{-7 / 3, -25, 0, -4}) = " + maxInArray2(new int[]{-7 / 3, -25, 0, -4}));

        System.out.println("*******************  SUM of the digits in a String    ***************************");

         /*
        String -- sum of digits in a string
            Write a method that can return the sum of the digits in a string
        */
        System.out.println("sumDigitInString(\"1254\") = " + sumDigitInString("1254"));
        System.out.println("sumDigitInString(\"\") = " + sumDigitInString(""));
        System.out.println("sumDigitInString(\"000\") = " + sumDigitInString("000"));
        System.out.println("sumDigitInString(\"Said\") = " + sumDigitInString("Said"));
        System.out.println("sumDigitInString(\"1000\") = " + sumDigitInString("1000"));
        System.out.println("sumDigitInString(\"1Said\") = " + sumDigitInString("1Said"));
        System.out.println("sumDigitInString(\"Said2\") = " + sumDigitInString("Said2"));
        System.out.println("sumDigitInString(\"-1657\") = " + sumDigitInString("-1657"));
        System.out.println("sumDigitInString(\"-165T45\") = " + sumDigitInString("-165T45"));
        System.out.println("sumDigitInString(\"165T45\") = " + sumDigitInString("165T45"));
        System.out.println("sumDigitInString(\"-0000\") = " + sumDigitInString("-0000"));
        System.out.println("*******************  PASSWORD VALIDITY CHECK    ***************************");
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
        System.out.println("----------------POSITIVE TESTING---------------------");
        System.out.println("passwordValidity(\"Aa:1vB\") = " + passwordValidity("Aa:1vB"));
        System.out.println("passwordValidity(\"Aa1vB!\") = " + passwordValidity("Aa1vB!"));
        System.out.println("passwordValidity(\"!Aa01vB\") = " + passwordValidity("!Aa01vB"));
        System.out.println("----------------NEGATIVE TESTING---------------------");
        System.out.println("passwordValidity(\":1vB\") = " + passwordValidity(":1vB"));
        System.out.println("passwordValidity(\"\") = " + passwordValidity(""));
        System.out.println("passwordValidity(\"::::::\") = " + passwordValidity("::::::"));
        System.out.println("passwordValidity(\"abcdef\") = " + passwordValidity("abcdef"));
        System.out.println("passwordValidity(\"012345\") = " + passwordValidity("012345"));
        System.out.println("passwordValidity(\"ABCDEF\") = " + passwordValidity("ABCDEF"));
        System.out.println("passwordValidity(\"@-@/@^@\") = " + passwordValidity("@-@/@^@"));
    }
    //##################################  MAX in an array #####################################
    public static String maxInArray1(int[] arr) {

        if (arr.length < 1) {
            return ("array's length has to be more than 1");
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max + "";
    }

    //==============================================================================================
    public static String maxInArray2(int[] arr) {
        if (arr.length < 1) {
            return ("array's length has to be more than 1");
        }
        Integer[] arr1 = new Integer[arr.length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return Collections.max(Arrays.asList(arr1)) + "";

    }
    //################################ SUM of the digits in a String ###############################################
    public static String sumDigitInString(String str) {
        int sum = 0;
        String[] arr = str.split("");

        if (str.length() < 1) {
            return ("The string's length has to be more than 1");
        }
        if (str.charAt(0) == '-') { //if  str < 0
            for (int i = 1; i < arr.length; i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    sum += Integer.parseInt(arr[i]);
                } else {
                    return ("The string has to be numerical");
                }
            }
            sum = sum * -1;

        } else {
            for (int i = 0; i < arr.length; i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    sum += Integer.parseInt(arr[i]);
                } else {
                    return ("The string has to be numerical");
                }
            }
        }
        return String.valueOf(Integer.valueOf(sum));
    }
    //################################# PASSWORD VALIDITY CHECK #########################################
    public static boolean passwordValidity(String password) {
        boolean validPassword;

        //1. Password MUST be at least have 6 characters and should not contain space
        boolean sixChar = password.length() >= 6;

        //2. PassWord should at least contain one upper case letter
        boolean containUppCase = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                containUppCase = true;
                break;
            }
        }

        //3. PassWord should at least contain one lowercase letter
        boolean containLowCase = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                containLowCase = true;
                break;
            }
        }

        //4. Password should at least contain a digit
        boolean containADigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                containADigit = true;
                break;
            }
        }

        //5. Password should at least contain one special characters
        boolean containASpecialChar = false;
        for (int i = 0; i < password.length(); i++) {
            boolean containASpecialCharSet1 = password.charAt(i) >= '!' && password.charAt(i) <= '/';
            boolean containASpecialCharSet2 = password.charAt(i) > 'Z' && password.charAt(i) < 'a';
            boolean containASpecialCharSet3 = password.charAt(i) > 'z' && password.charAt(i) <= '~';
            boolean containASpecialCharSet4 = password.charAt(i) >= ':' && password.charAt(i) < 'A';
            containASpecialChar = containASpecialCharSet1 || containASpecialCharSet2 || containASpecialCharSet3 || containASpecialCharSet4;

            if (containASpecialChar) {
                break;
            }
        }
        validPassword = sixChar && containLowCase && containADigit && containUppCase && containASpecialChar;
        return validPassword;
    }
}
