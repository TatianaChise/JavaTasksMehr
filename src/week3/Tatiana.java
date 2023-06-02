package week3;

public class Tatiana {
        public static void main(String[] args) {
            isPrime(23);
            isPrime(25);
            isPrime(-7);
            isPrime(31);
            isPrime(100);
            isPrime(63);
            isPrime(3);


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



    }
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
Prime are the numbers that are only divisible byt itself or 1
 */

