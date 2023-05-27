package week1;

public class Ferda {

    public static void main(String[] args) {

        System.out.println(oddOrEven(20));
        System.out.println(division(2,20));
        System.out.println(division(300,2));
        System.out.println(division(300,300));
        System.out.println(division(300.0,5.0));

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
        public static double division(double a, double b) {
            double count = 0;
            if (a <= b) {

                for (double i = a; i <= b; i = i + a) {
                    count = count + 1;

                }
            }
            if (a > b) {

                for (double i = b; i <= a; i = i + b) {
                    count = count + 1;

                }

            }
            return count;
        }
}
