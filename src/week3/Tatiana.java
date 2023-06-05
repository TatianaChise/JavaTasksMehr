package week3;

public class Tatiana {
        public static void main(String[] args) {
            System.out.println(" ");
            System.out.println("Hello and Welcome to our week 3 ");
            System.out.println(" ");
            System.out.println("First task of week 3.\n1. Numbers -- Prime Number\n" +
                    "Write a method that can check if a number is\n" +
                    "prime or not\n" +
                    "Prime are the numbers that are only divisible byt itself or 1");
            isPrime(23);
            isPrime(25);
            isPrime(-7);
            isPrime(31);
            isPrime(100);
            isPrime(63);
            isPrime(3);

            ReverseNegativeNumber(-56);


        }

        public  static  boolean isPrime(int num) {
            boolean isPrime = true;
            if (num <= 1) {   //first condition is that the number has to be a positive number
                System.out.println(num +" is not a positive number");
                return false;

            }
            for (int i = 2; i < num ; i++) {  //second condition is that number can not be divided by any other number but 1 and number itself, this is why we start from 2
                if (num % i == 0) {
                    System.out.println(num+" is not a prime number ");
                    return false;

                }
            }
            System.out.println(num+" is a prime number" );
            return isPrime;

        }


    public static void ReverseNegativeNumber(int num){
        int reverse=0;
        int reminder;

        while(num!=0){
            reminder=num%10; //reminder =6
            //reminder=5

            reverse=reverse*10+reminder;//reverse=6
            //60+5=65

            num=num/10; //num=5
            //num=0
        }

        System.out.println(reverse);


    }

}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
Prime are the numbers that are only divisible byt itself or 1
 */

