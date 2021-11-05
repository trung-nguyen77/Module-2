package bai2;

public class SNT {
    public static void main(String[] args) {
        int x = 0;
        int count = 0;
        for (int i = 13;count < 20 ;i++) {
            boolean check = true;
            for (int j = 2;j <= Math.sqrt(x); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                x = i;
            }
        }
        System.out.println(x);
    }
}
