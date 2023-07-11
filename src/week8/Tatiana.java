package week8;

import java.util.Arrays;

public class Tatiana {

    public static void main(String[] args) {
        int[]arr={2,0,4,0,6,0,3,0,0,4};
        System.out.println("array_move_to_zero(arr) = " + Arrays.toString(array_move_to_zero(arr)));
        System.out.println("uniqueIntegersThatSumUpToZero(10) = " + Arrays.toString(uniqueIntegersThatSumUpToZero(10)));
        System.out.println("uniqueIntegersThatSumUpToZero(5) = " + Arrays.toString(uniqueIntegersThatSumUpToZero(5)));

    }

    public static int[] uniqueIntegersThatSumUpToZero(int N){
        int[] arr=new int[N];

        for (int i = 0; i < N; i++) {
            arr[i]=i*2-N+1;
        }

        return arr;

    }

/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
 */

    public static int[] array_move_to_zero(int[] arr) {
        int [] endWithZero=new int [arr.length];
        int j=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                endWithZero[j++]=arr[i];
            }
        }
        while(j< arr.length){
            endWithZero[j++]=0;
        }
        return  endWithZero;

    }


/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
 */

}
