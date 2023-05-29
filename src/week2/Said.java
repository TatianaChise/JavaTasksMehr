package week2;

public class Said {
    public static void main(String[] args) {
        System.out.println(swap(-52,-100));
        System.out.println(swap(-2,100));
        System.out.println(swap(20,-10));
    }
    //Swap 2 variable values without using a 3rd variable

    public static String swap(int a, int b){

        a = b + a; //a = 5 + 10 = 15;
        b = a - b; //b = a - b = 15 - 5 = 10;
        a = a - b; //;a = 15 - 10 = 5;
        return "Before swapping, a = "+b+", b = "+a+"\nAfter swapping,  a = "+a+", b = "+b+"\n";
    }
}
