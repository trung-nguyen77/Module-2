package bai3.tongcot;

public class SumColumn {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("The sum of values in column of the array is: " + SumColumn(arr));
    }

    public static int SumColumn(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) sum += array[i];
        return sum;
    }
}
