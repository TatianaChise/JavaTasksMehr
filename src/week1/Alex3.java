package week1;

public class Alex3 {
    public static void main(String[] args) {
        int n= 100;
        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";
        for (int i = 0; i <100 ; i++) {

            if (i % 5 == 0 && i% 3 ==0 && i% 15 == 0 ){
                divisibleBy15 +=i + "";
            } else if (i % 15 !=0 && i % 3 !=0 && i % 5 ==0 ) {
                divisibleBy5 +=i + "";
            } else if (i % 15 != 0 && i % 5  !=0 && i % 3 ==0) {
                divisibleBy3 +=i + "";
            }else {
              continue;
            }

        }
        System.out.println("DivisibleBy15 :"+ divisibleBy15);
        System.out.println("DivisibleBy5 :"+ divisibleBy5);
        System.out.println("DivisibleBy3 :"+ divisibleBy3);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
          byte a =20;
          byte b =25;

           a = (byte) (a+b);
           b = (byte) (a-b);
           a = (byte) (a-b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }






}
