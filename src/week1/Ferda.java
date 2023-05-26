package week1;

public class Ferda {

    public static void main(String[] args) {

        System.out.println(oddOrEven(20));
        System.out.println(division(2,20));
    }
    public static String oddOrEven(int a){
        if(a%2==0){
            return "Even";
        }
        return "Odd";
    }

    public static int division(int a, int b) {
        int count = 0;
        if (a <=b) {

            for (int i = a; i <= b; i = i + a) {
                count = count + 1;

            }
        }
        if (a > b) {

            for (int i = b; i <= a; i = i + b) {
                count = count + 1;

            }

        }
        return count;
    }
}
