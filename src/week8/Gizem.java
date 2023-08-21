package week8;

public class Gizem {

    public static int[] generateArray(int count) {
        int[] result = new int[count];
        int sum = 0;

        for (int i = 0; i < count - 1; i++) {
            result[i] = i + 1;
            sum += i + 1;
        }
        result[count - 1] = -sum;

        return result;
    }


    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int count = 4;
        int[] uniqueArray = generateArray(count);
        System.out.print("Generated array: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(arr);
        System.out.print("Array after moving zeros to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
