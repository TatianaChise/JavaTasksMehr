package week2;

public class Tatiana {

    public static void main(String[] args) {


        System.out.println("Week 2 has 3 tasks.");
        System.out.println(" ");
        System.err.println("Week 2 task:\n #1. Swab two variable values without using a third variable");

        int a=20;
        int b=25;
        System.out.println("Before swapping : "+"\n\t a="+a+"\n\t b="+b);
        a=a+b; //a=45
        b=a-b; //b=20
        a=a-b;// a=25
        System.out.println("After swapping : "+"\n\t a="+a+"\n\t b="+b);

        System.out.println("-------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.err.println("Week 2 second task : \n#2. Write a program that can print the numbers between 1-100, that can be divisible by 3,5,and 15.\n\tif the number can be divisible by 3,5,15, then it should only be displayed in DivisibleBy15 section\n\tif the number can be divisible by 3, but can not be divisible by 15, then it should be only displayed in DivisibleBy3 section\n\tif number can be divisible by 5  but can not be divisible by 15, then it should be only displayed in DivisibleBy5 section. ");

        DivisibleBy3_5_15();

        System.out.println("-----------------------------------------");
        System.out.println(" ");
        System.out.println(" ");

        System.err.println(" Write a function that , given a positive integer N, prints the consecutive numbers from 1 to N, each on separate line. However, any number divisible by 2,3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatination of the respective words Codility,Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3,5 should be replaced by CodilityTestCoders." );

        CTC(27);

        System.out.println(" ");


    }
    public static void DivisibleBy3_5_15() {
        String DivisibleBy15= "";
        String DivisibleBy5="";
        String  DivisibleBy3="";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                DivisibleBy15+=i+" ";
            } else if (i % 3 == 0 ) {
                DivisibleBy3+=i+" ";
            } else if (i % 5 == 0) {
                DivisibleBy5+=i+" ";
            } else {
                continue;
            }

        }
        System.out.println("Divisible by 15 : "+DivisibleBy15);
        System.out.println("Divisible by 3 : "+DivisibleBy3);
        System.out.println("Divisible by 5 : "+DivisibleBy5);
    }

    public static void CTC(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("Codility" + "Test" + "Coders");
            } else if (i % 2 == 0 && i % 3 == 0 ) {
                System.out.println("Codility" + "Test");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("Codility" + "Coders");
            }else if (i%3==0 && i%5==0 ){
                System.out.println("Test"+"Coders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            }else{
                System.out.println(i);
            }
        }
    }



}

