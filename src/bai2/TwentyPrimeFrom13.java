package bai2;

public class TwentyPrimeFrom13 {
    public static void main(String[] args) {
        int x;
        int count = 0;
        for (int i = 13;count < 20 ;i++) {
            boolean check = true;
            for (int j = 2;j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                x = i;
                System.out.println(x);
                count++;
            }
        }
    }
}
