package week2;

import java.util.Scanner;

public class Ferda {
    public static void main(String[] args) {
        swap(3,5);
        division();
        consNum();
    }
//TASK 1 Swap two number without using third number
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("1st number is "+a+ ", 2nd number is "+b);
    }

    //TASK 2 Division 3 & 5 & 15
    public static void division() {
        String result3="";
        String result5="";
        String result15="";
        for (int i = 0; i < 100; i++) {

            if (i % 3 == 0) {
                result3=result3+i+", ";
            }
            if (i % 5 == 0) {

                result5 = result5 + i + ", ";
            }
            if (i % 3 == 0 && i%5==0) {

                result15 = result15 + i + ", ";
            }

        }
        System.out.println("Divisible by 3= "+result3.substring(0,result3.length()-2));
        System.out.println("Divisible by 5= "+result5.substring(0,result5.length()-2));
        System.out.println("Divisible by 15= "+result15.substring(0,result15.length()-2));


    }

    //TASK 3 Consecutive number
    public static void consNum() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        String result = "";
        for (int i = 1; i <= a; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                result = "CodilityTest";
            }
            else if (i % 2 == 0 && i % 5 == 0) {
                result = "CodilityCoders";

            }
            else if (i % 3 == 0 && i % 5 == 0) {
                result = "TestCoders";

            }
            else if (i % 2 == 0) {
                result = "Codility";

            }
            else if (i % 3 == 0) {
                result = "Test";
            }
            else if (i % 5 == 0) {
                result = "Coders";

            } else {
                result = "" + i;
            }
            System.out.println(result);
        }

    }

}
