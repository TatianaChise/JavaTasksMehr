package week6;

public class Ferda {

    public static void main(String[] args) {

        System.out.println("password(\"asD123$%\") = " + password("asD123$%"));



    }

    public static int max(int[] number){

        number=new int[number.length-1];
        int max=number[0];

        for (int i = 1; i < number.length; i++) {

            if(number[i]>max){
                max=number[i];
            }


        }
        return max;
    }

}
