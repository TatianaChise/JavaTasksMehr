package week3;

public class Gizem {

    public static void main(String[] args) {

        System.out.println("isPrime(7) = " + isPrime(7));
        System.out.println("reverseNegative(-12345) = " + reverseNegative(-12345));

    }

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNegative(int number) {
        if (number >= 0) {
            return number;
        }

        int positiveNumber = -number;
        int reversed = 0;

        while (positiveNumber != 0) {
            int digit = positiveNumber % 10;
            reversed = reversed * 10 + digit;
            positiveNumber /= 10;
        }

        return -reversed;
    }
}

