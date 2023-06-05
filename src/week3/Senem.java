package week3;

public class Senem {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            return number;
        }

        StringBuilder reversedString = new StringBuilder(String.valueOf(number)).reverse();
        String reversedNumString = reversedString.deleteCharAt(reversedString.length()-1).insert(0, "-").toString();

        return Integer.parseInt(reversedNumString);
    }

    public static void main(String[] args) {
        int number2 = -56;


        int reversedNumber2 = reverseNegativeNumber(number2);
        System.out.println("num: " + number2);
        System.out.println("result: " + reversedNumber2);
    }
}

