package week6;

public class Gizem {
    public static boolean  PasswordValidator(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        if (password.length() >= 6 && !password.contains(" ")) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if ("!@#$%^&*()_+\\-=[\\]{};':\"\\\\|,.<>/?".contains(String.valueOf(c))) {
                    hasSpecialChar = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    public static int MaxNumberFinder(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }


    public static int sumOfDigits(String input) {
        int sum = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }







    public static void main(String[] args) {
        String password = "P@ssw0rd";
        boolean isValid =  PasswordValidator(password);
        System.out.println("Is the password valid? " + isValid);

        int[] numbers = {10, 5, 8, 21, 17};
        int maxNumber = MaxNumberFinder(numbers);
        System.out.println("Maximum number: " + maxNumber);

        String input = "abc123xyz";
        int digitSum = sumOfDigits(input);
        System.out.println("Sum of digits: " + digitSum);



    }
}

