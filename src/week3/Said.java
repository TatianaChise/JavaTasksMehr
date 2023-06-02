package week3;

public class Said {
    public static void main(String[] args) {
        System.out.println("---------- isPrime -------------------------");
        System.out.println(isPrime(29));
        System.out.println(isPrime(0));
        System.out.println(isPrime(-81));
        System.out.println("----------Reversing Negative Numbers----------");
        System.out.println(revNegNum(-6527));
        System.out.println(revNegNum(-25));
        //System.out.println(revNegNum(0));
        //System.out.println(revNegNum(115));
    }
                           /*
                            1. Numbers -- Prime Number
                            Write a method that can check if a number is
                            prime or not
                             */
    public static boolean isPrime(int number) {
        boolean prime = true;
        if (number <= 0) {
            prime = false;
        } else {
            for (int i = number - 1; i > 1; i--) {
                if (number % i == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }
    /*
                             2. Numbers -- Reverse negative number
                                 Write a return method that can reverse
                                 negative number and return it as int
                              */
    public static int revNegNum(int number) {//6527
        int number1 = 0;
        if (number >= 0) {
            System.err.println("this method is used to reverse NEGATIVE numbers");
            System.exit(1);
        } else {
            number1 = number * -1;

            int remainder;
            int newNumber = 0;
            if (number1 >= 10) {
                do {
                    remainder = number1 % 10;// 7, 2, 5,
                    number1 = number1 / 10;// 652, 65, 6,
                    newNumber = remainder + newNumber * 10;// 7+ 0 x 10= 7, 2+ 7 x 10= 72, 5+ 72 x 10= 725,

                } while (number1 > 9);// t, t, t, f

                number1 = number1 % 10 + newNumber * 10;// 6 % 10 + 725 x 10= 6 + 7250= 7256
            }
        }
        return number1 * -1; //-7256

    }
}
