package week3;
import java.lang.Math;
import java.util.ArrayList;

public class Ruth {
       public static void main(String[] args) {
           System.out.print("Prime numbers: ");
           for (int i = 0; i < 10; i++) {

               if (isPrime(i))
               {
                   System.out.print(i+" , ");
               }
              // System.out.println(isPrime(i)+" "+i);
           }

           System.out.println();
        System.out.println(reveseInt(-56789));
           System.out.println(reveseInt(56789));
           System.out.println(reveseInt(-12789));
           System.out.println(reveseInt(12789));
    }
    public static int reveseInt(int number){
        ArrayList<Integer> num = new ArrayList<>();
        String sign="";
        if (number>0) {sign="+";}
        else if (number<0)
        {sign="-";

        }
        else {sign="0";}


        int digit=0; int rev=0;
        for (int i = Math.abs(number); i >0 ;) {
            num.add(i%10);
            i=i/10;
            digit++;

        }
        for (int i = 0; i <num.size(); i++) {
            digit--;
            rev+= num.get(i)*(Math.pow(10,digit));

        }
        if (sign.equals("-")){rev=(-1)*rev;}
        return rev;
    }
    /////////////////////////////////
    public static boolean isPrime(int number){
        int numberOfFactors=0;
        for (int i = number; i >0 ; i--) {
            if (number%i==0){numberOfFactors++;}
        }
        if (numberOfFactors==2){
            return true;}
        else
        {return false;}
    }
    ///////////////////////////
}