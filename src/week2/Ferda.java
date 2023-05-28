package week2;

public class Ferda {
    public static void main(String[] args) {
        swap(3,5);
        division();
    }

    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("1st number is "+a+ ", 2nd number is "+b);
    }
    public static void division() {
        String result3="";
        String result5="";
        String result15="";
        for (int i = 0; i < 100; i++) {

            if (i % 3 == 0) {
                result3=result3+i+", ";
            }
            if (i % 5 == 0) {

                result5 = result5 + i + ", ";
            }
            if (i % 3 == 0 && i%5==0) {

                result15 = result15 + i + ", ";
            }

        }
        System.out.println("Divisible by 3= "+result3.substring(0,result3.length()-2));
        System.out.println("Divisible by 5= "+result5.substring(0,result5.length()-2));
        System.out.println("Divisible by 15= "+result15.substring(0,result15.length()-2));


    }

}
