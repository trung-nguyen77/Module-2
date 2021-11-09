package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        String str = "abcdefg abchijk";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to look for:");
        String str2 = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str2)) {
                count++;
                System.out.println(str2 + " in place " + i);
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(delete(arr,str2,count)));
    }
    public static String[] delete(String[] arr,String value, int wordCount) {
        String[] arrNew = new String[arr.length - wordCount];
        int count = 0;
        for (int i = 0; i < arr.length - count; i++) {
            if (arr[i + count].equals(value)) {
                count++;
            }
            arrNew[i] = arr[i + count];

        }
        return arrNew;
    }
}
