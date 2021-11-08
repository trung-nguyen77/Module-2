package bai3;

public class AddElement {
    public static void add(int[] arr,int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = value;
        arr = newArr;

        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        add(new int[]{1, 2, 3, 4}, 8);
    }
}
