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
            int num=23;
            System.out.println(num +" is a prime number : "+ isPrime(num));
            isPrime(-7);
            isPrime(100);



            System.out.println("----------------");
            System.out.println("Second task of week 3.\n2. Numbers -- Reverse negative number\n" +
                    "Write a return method that can reverse\n" +
                    "negative number and return it as int\n");

           int n=-56;
            System.out.println("Before reversing : "+ n+"\nAfter reversing : "+ReverseNegativeNumber(n));


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
            //System.out.println(num+" is a prime number" );
            return isPrime;

        }


    public static  int ReverseNegativeNumber(int n){
        int reverse=0;
        int reminder;

        while(n!=0){
            reminder=n%10; //reminder =6
            //reminder=5

            reverse=reverse*10+reminder;//reverse=6
            //60+5=65

            n=n/10; //num=5
            //num=0
        }
        //System.out.println("Reverse number is : "+reverse);
        return reverse;

        }

}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
Prime are the numbers that are only divisible byt itself or 1
 */

