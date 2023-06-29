package week6;

import java.lang.reflect.Array;

public class Ruth {
    public static void main(String[] args) {
        System.out.println(verifyPassword("Aa4$bc"));
        System.out.println(verifyPassword("Aa$bcdddd")+" :no digit");
        System.out.println(verifyPassword("Aa4bcddd")+" :no special character");
        System.out.println(verifyPassword("a4$bcd")+" :no upper case");
        System.out.println(verifyPassword("AB4$CDE")+" :no lower case");
        System.out.println(verifyPassword("Aa4$b c")+" :space");
        System.out.println(verifyPassword("Aa4$")+" :4 character password");


        int[] array={4,20,6,7,7};
        System.out.println(maxNumber(array));

        System.out.println(sumOfDigits("rojn46579jnm"));


    }
    public static boolean verifyPassword(String password){

        boolean uppercase=false;
        boolean lowercase=false;
        boolean digit=false;
        boolean specialChar=false;
        boolean noSpace=!password.contains(" ");
        boolean passwordLength=(password.length()>=6);
        for (int i=(password.length()-1);i>=0; i--)
        {
            char ch=password.charAt(i);
           if((ch>=48)&&(ch<=57))digit=true;
            if(ch>='a'&&ch<='z')lowercase=true;
            if(ch>='A'&&ch<='Z')uppercase=true;
            if( (ch>=33&&ch<=47)||(ch>=58&&ch<=64)||(ch>=123&&ch<=126))specialChar=true;
        }

        return (noSpace&&passwordLength&&uppercase&&lowercase&&digit&&specialChar);
    }

    public static int maxNumber(int[] intArray){
        int  max=intArray[0];
        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i]>max) max=intArray[i];


        }

        return max;
    }
public static int sumOfDigits(String str){
        int sumOfDigits=0;
        for (int i=0; i<=str.length()-1; i++){
            if (str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                sumOfDigits+=(int)str.charAt(i);
            }
        }

        return sumOfDigits;
}

}
/*


String -- sum of digits in a string
Write a method that can return the sum of the digits in a string*/
