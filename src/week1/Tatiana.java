package week1;

public class Tatiana {
    public static void main(String[] args) {
        System.out.println("Good morning! Happy Thursday for everyone!");

        System.out.println("Week 1, has 3 Java tasks");
        System.out.println("#1. Write a method which can identifies given number is even or odd.\nEX :\n\t identify(5)->'Odd'\n\t identify(6)->'Even'");

        OddOrEven(5);
        OddOrEven(6);


    }

    public static void OddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}




