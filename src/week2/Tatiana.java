package week2;

public class Tatiana {

    public static void main(String[] args) {


        System.out.println("Week 2 task:\n #1. Swab two variable values without using a third variable");

        int a = 20;
        int b = 25;
        System.out.println("Before swapping : " + "\n\t a=" + a + "\n\t b=" + b);
        a = a + b; //a=45
        b = a - b; //b=20
        a = a - b;// a=25
        System.out.println("After swapping : " + "\n\t a=" + a + "\n\t b=" + b);

    }
}
