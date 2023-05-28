package week2;

public class Ferda {
    public static void main(String[] args) {
        swap(3,5);
    }

    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("1st number is "+a+ ", 2nd number is "+b);
    }
}
