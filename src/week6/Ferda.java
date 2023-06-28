package week6;

public class Ferda {

    public static void main(String[] args) {

        System.out.println("password(\"asD123$%\") = " + password("asD123$%"));
        System.out.println("password(\"hgh123\") = " + password("hgh123"));

    }



    public static boolean password(String password) {
        int lower = 0;
        int upper = 0;
        int special = 0;
        int number = 0;
        boolean isValidPassword=true;

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
            return isValidPassword;
        }
        return false;

    }
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
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */


