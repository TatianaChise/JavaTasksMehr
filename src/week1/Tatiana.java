package week1;

public class Tatiana {
    public static void main(String[] args) {
        System.out.println("Good morning! Happy Thursday for everyone!");

        System.out.println("Week 1, has 3 Java tasks");
        System.err.println("#1. Write a method which can identifies given number is even or odd.\nEX :\n\t identify(5)->'Odd'\n\t identify(6)->'Even'");

        OddOrEven(5);
        OddOrEven(6);
        System.out.println("-----------------------------------------------");

        System.out.println("Happy Friday everyone!");
        System.err.println("Week 1, second task : \n #2. Write a method that can divide two numbers without using division operator. ");

        Divide(50,9);
        System.out.println("------------------------------------------------");

        System.err.println("\nWeek 2 , third task : FINRA :\n" +
                "Write a method which prints out the numbers from 1 to 30 but for numbers which\n" +
                "are a multiple of 3print \"FIN\" instead of the number and for numbers which are a\n" +
                "multiple of 5, print \"RA\" instead of the number. for numbers which are a multiple of\n" +
                "both 3 and 5, print \"FINRA\" instead of the number.");

        FINRA();



    }

    public static void OddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }

    public static void Divide(int n1,int n2){
        int reminder =0;
        while (n1>=n2){
            n1-=n2;
            reminder ++;
        }
        System.out.println("Division of this 2 numbers is equal "+reminder+" with a reminder of "+n1);
    }

    public static void FINRA() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA"+" ");
            } else if (i % 3 == 0) {
                System.out.print("FIN"+" ");
            } else if (i % 5 == 0) {
                System.out.print("RA"+"");
            } else {
                System.out.print(i+"");
            }
        }
    }
}




