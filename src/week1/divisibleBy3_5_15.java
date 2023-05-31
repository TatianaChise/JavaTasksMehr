package week1;

public class divisibleBy3_5_15 {
    public static void main(String[] args) {
        System.out.println(divisibleBy3_5_15());
    }
    public static String divisibleBy3_5_15() {
        String result1 = "Divisible by15: ";
        String result2 = "Divisible by3: ";
        String result3 = "Divisible by5: ";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                result1 += i + " ";
            }
            if (i % 3 == 0) {
                result2 += i + " ";
            }
            if (i % 5 == 0) {
                result3 += i + " ";
            }
        }
        return result1 + "\n" + result2 + "\n" + result3;
    }
}
