package week3;

public class Ferda {

    public static void main(String[] args) {

        System.out.println("isPrime(97) = " + isPrime(97));
        System.out.println("isPrime(16) = " + isPrime(16));

        System.out.println("rev(-456) = " + rev(-456));
        System.out.println("rev(-987654321) = " + rev(-987654321));
        System.out.println("rev(98) = " + rev(98));


    }


    public static boolean isPrime(int a) {
        int count = 0;
        boolean isPrime = true;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                count = count + 1;
            }
        }
        if (count <= 2) {
            return isPrime;
        }

        return false;
    }

    public static int rev(int a) {
        int b = a * (-1);
        String c = "" + b;
        //System.out.println(c);
        int length = c.length();
        //System.out.println(length);
        int res = 0;
        if (a >= 0) {
            System.out.println(a + " is not a negative number");
            System.exit(1);
        } else {
            String d = "";
            for (int i = length - 1; i >= 0; i--) {

                d = d + "" + c.charAt(i);
                //System.out.println(d);

            }
            int e = Integer.parseInt(d);
            int f = e * (-1);
            //System.out.println(f);
            res = f;
        }
        return res;

    }
}
