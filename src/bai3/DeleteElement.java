package bai3;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 9, 3, 4, 5};
        delete(arr,9);
    }
    public static void delete(int[] arr, int x) {
        int[] newArr = new int[arr.length - 1];
        int index_del = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (x == arr[i]){
                index_del = i;
            }
        }
        for (int i = 0; i < newArr.length ; i++) {
            if (i >= index_del) {
                newArr[i] = arr[i + 1];
            } else {
                newArr[i] = arr[i];
            }
        }
        arr = newArr;
        for (int j : arr) {
            System.out.println(j);
        }
    }

}
