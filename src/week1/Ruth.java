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

    public static String  swap(int x, int y)
    {
        String str="";

        x=x*y;//x=15 15/3
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

    public static void main(String[] args) {

        System.out.println(divide(25,5));
        System.out.println(swap(30,5));
        System.out.println(consecutiveNumbers(24));
    }
}
