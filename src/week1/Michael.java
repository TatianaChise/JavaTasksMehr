package week1;

public class Michael {
    public static void main(String[] args) {
        System.out.println("Hello everybody");
        System.out.println("Great group Mehr");
        System.out.println("knvlkdsvl");
        identifyOddEven(155);


    }

    public  static  String  identifyOddEven( int  n ) {
        return  n%2==0 ? "Even" : "odd" ;
    }
// Second Task ////////////
    public static void devides(int num1, int num2) {
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" devid by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }

    public static void FINRA() {
        String result = "";
        for(int i=1; i <= 30; i++) {
            if(i % 5==0 && i %3 ==0)
                result += "FINRA ";
            else if(i%5 == 0)
                result += "RA ";
            else if(i%3==0)
                result+="FIN ";
            else
                result += i+" ";
        }
        System.out.println(result);
    }

}
