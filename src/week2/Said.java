package week2;

public class Said {
    public static void main(String[] args) {
        System.out.println(swap(-52, -100));
        System.out.println(swap(-2, 100));
        System.out.println(swap(20, -10));
        System.out.println(divisibleBy3_5_15());
        respective(24);
    }

    //Swap 2 variable values without using a 3rd variable
    public static String swap(int a, int b) {

        a = b + a; //a = 5 + 10 = 15;
        b = a - b; //b = a - b = 15 - 5 = 10;
        a = a - b; //;a = 15 - 10 = 5;
        return "Before swapping, a = " + b + ", b = " + a + "\nAfter swapping,  a = " + a + ", b = " + b + "\n";
    }

    public static void respective(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            }
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            }
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            }
            if (i % 2 == 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println("Codility");
            }
            if (i % 2 != 0 && i % 3 == 0 && i % 5 != 0) {
                System.out.println("Test");
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 == 0) {
                System.out.println("Coders");
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }

    }
    public static String divisibleBy3_5_15() {
        String result1 = "Divisible by15: ";
        String result2 = "Divisible by3: ";
        String result3 = "Divisible by5: ";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                result1 += i + " ";
            }
            else if (i % 3 == 0) {
                result2 += i + " ";
            }
            else if (i % 5 == 0) {
                result3 += i + " ";
            }
        }
        return result1 + "\n" + result2 + "\n" + result3;
    }
}
