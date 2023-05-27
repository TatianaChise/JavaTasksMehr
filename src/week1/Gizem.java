package week1;

import java.util.ArrayList;
import java.util.Arrays;

public class Gizem {
    public static void main(String[] args) {


        ArrayList<String> groupMehr = new ArrayList<>();
        groupMehr.addAll(Arrays.asList("Tetiana", "Ruth", "Said", "Enes", "Ferda", "Senem",
                "Gizem", "Khurshed", "Alexandr", "Micheal", "Anastasia"));
        System.out.println("Hello");
        System.out.println("Nice day");
        System.out.println("have good night");

    }

    public static void OddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("even number" + num);

        } else {
            System.out.println("odd number" + num);
        }

    }
}
