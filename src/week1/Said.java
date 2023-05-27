package week1;

public class Said {
    public static void main(String[] args) {

    }
    /*
           Write a method which can identify given number is even or odd
           example: identify(5) -> "Odd" ; identify(6) ->"Even".
        */
    public static void oddOrEven(int number) {
        if(number <= 0){
            System.out.println("The provided number "+number+" <= 0. It must be positive");
        }
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    /*
             Write a method that can divide two numbers without using division operator
          */
    public static void division(int num1, int num2) {
        double remainder = num1;
        int divisor = 0;
        if (num2 == 0) {
            System.err.println("num2 cannot be zero");
            System.exit(1);
        }

        if (num1 > num2) {
            while (remainder > num2) {//7 >2, 5>2, 3>2,
                remainder = remainder - num2;//5, 3,1,
                divisor++;//1,2,3
            }
            System.out.println(num1 + "/" + num2 + " = " + num2 + " x " + divisor + " + " + remainder);
        }
        // System.out.println("---------------------------------------------------------------------");
        double divisor1 = 0.0;
        if (num1 < num2) {
            double x = Math.floor(Math.log10(num2)) + 1;// it checks how many digits num2 has
            double num3 = num1 * Math.pow(10, x);// we add enough 0's to num1 so that it becomes > num2 (the more digits num2, the 0's we add to num1)

            while (num3 >= num2) {
                num3 = num3 - num2;//same logic as when num1 > num2
                divisor1++; //we count how many times num2 is being subtracted, to find out the number of times num3 contains num2
            }
            System.out.println(num1 + "/" + num2 + " = " + divisor1 * Math.pow(10, -x));
        }
        if (num1 == num2) {
            System.out.println(num1 + "/" + num2 + " = " + 1);
        }
    }
}
