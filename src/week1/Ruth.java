package week1;

public class Ruth {
    public static int divide(int x,int y){
        int quotient=0;

        for (int i = y; i <=x ; ) {
            x=x-y;
            quotient++;
        }
        return quotient;

    }

    ////////////////////////////////////////
    public static String finra(int num){
        // boolean div3=(num%3==0); boolean div5=(num%5==0);
        String str="";
        for (int i = 1; i <= num; i++) {
            boolean div3=(i%3==0); boolean div5=(i%5==0);
            str+=i+" "+((div3&&div5)?"FINRA ":div3?"FIN ":div5?"RA ":"");
        }

        return str;
    }
    //////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(finra(50));
        System.out.println(divide(10,3));
    }
}
