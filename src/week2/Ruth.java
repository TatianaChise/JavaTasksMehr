package week2;

import java.util.ArrayList;

public class Ruth {
    public static String  swap(int x, int y)
    {
        String str="";

        x=x*y;
        y=x/y;
        x=x/y;
        str+="x="+x+" y="+y;
        return str;

    }

    public static String consecutiveNumbers(int x){
        String str="";
        for (int i = 1; i <=x ; i++) {
            if ((i%2!=0)&&(i%3!=0)&&(i%5!=0)){str+=""+i;}
            if (i%2==0){str+="Codility";}
            if (i%3==0){str+="Test";}
            if (i%5==0){str+="Coders";}
            str+="\n";

        }

        return str;

    }
    public static void divlist(int x){
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer>div5=new ArrayList<>();
        ArrayList<Integer>div15=new ArrayList<>();
        for (int i=1; i<=x; i++)
        {
            if(i % 3 == 0 && i % 5 == 0) {div15.add(i);}
            if (i % 3 == 0){div3.add(i);}
            if (i % 5 == 0){div5.add(i);}

        }
        System.out.println("divisible by 15 "+div15);
        System.out.println("divisible by  5 "+div5);
        System.out.println("divisible by  3 "+div3);
    }
public static String divisibleby3515(int x){
        String str="";

        String div3="Divisible by 3: ";
        String div5="Divisible by 5: ";
        String div15="Divisible by 15: ";
        for (int i=1; i<=x; i++)
        {
            if(i % 3 == 0 && i % 5 == 0) {div15+=" "+i;}
            if (i % 3 == 0){div3+=" "+i;}
            if (i % 5 == 0){div5+=" "+i;}

            }
str=div3+"\n"+div5+"\n"+div15;
        return str;
}
    public static void main(String[] args) {
        System.out.println(consecutiveNumbers(30));
        System.out.println(swap(3,8));
        System.out.println(divisibleby3515(60));

        divlist(60);
    }
}
