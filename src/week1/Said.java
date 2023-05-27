package week1;

public class Said {
    public static void main(String[] args) {
        oddOrEven(-5);
        oddOrEven(5);
        oddOrEven(20);
        oddOrEven(0);
    }

    /*
        Write a method which can identify given number is even or odd
        example: identify(5) -> "Odd" ; identify(6) ->"Even".
     */
    public static void oddOrEven(int number) {
        if (number < 0) {
            System.out.println("The provided number " + number + " <= 0. It must be positive");
        }
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}