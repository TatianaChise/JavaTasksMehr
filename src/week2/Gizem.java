package week2;

import java.util.ArrayList;
import java.util.Arrays;

public class Gizem {

    public static void main(String[] args) {

        divisible();
        swap(5,10);


    }

    public static void divisible() {
        System.out.println("Divisible By 15");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDivisible By 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDivisible By 3");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }

        }

        }

        public static void swap(int a , int b ){


            System.out.println("Before swapping:");
            System.out.println("a = " + a);

            System.out.println("b = " + b);

            a = a * b;
            b = a * b;
            a = a / b;

            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

    }

