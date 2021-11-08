package bai3;

public class DeleteElement {
    public static void delete(int[] arr, int x) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int index_del = 0;
            if (x == arr[i]){
                i = index_del;
            }
            if (i > index_del) {
                newArr[i] = arr[i - 1];
            } else {
                newArr[i] = arr[i];
            }
        }
        arr = newArr;
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 9, 3, 4, 5};
        delete(arr,9);
    }
}
