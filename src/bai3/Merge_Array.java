package bai3;

public class Merge_Array {
    public static void main(String[] args) {
        mergeArray();
    }

    public static double[] mergeArray() {
        System.out.println("MERGE ARRAY");
        double[] arr1 = {1.2, 2.3, 3.4, 4.5};
        double[] arr2 = {5.6, 6.7, 7.8, 8.9};
        double[] arrNew = new double[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arrNew, 0, arr1.length);
//        for (int i = 0; i < arr1.length ; i++) {
//            arrNew[i] = arr1[i];
//        }

        System.arraycopy(arr2, 0, arrNew, 0 + arr1.length, arr2.length);
//        for (int i = 0; i < arr2.length; i++) {
//            arrNew[i + arr1.length] = arr2[i];
//        }
        return arrNew;
    }
}
