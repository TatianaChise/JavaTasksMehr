package week2;

public class Respective {
    public static void main(String[] args) {
        respective(24);
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
}
