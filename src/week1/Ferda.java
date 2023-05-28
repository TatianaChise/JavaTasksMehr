package week1;

public class Ferda {

    public static void main(String[] args) {

        System.out.println(oddOrEven(20));
        System.out.println(division(2,20));
        System.out.println(division(300,2));
        System.out.println(division(300,300));
        System.out.println(division(300.0,5.0));
        FINRA();

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

    public static void FINRA() {
        String result = "";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result += "FINRA ";
            else if (i % 5 == 0)
                result += "RA ";
            else if (i % 3 == 0)
                result += "FIN ";
            else
                result += i + " ";
        }
        System.out.println(result);
    }
}
