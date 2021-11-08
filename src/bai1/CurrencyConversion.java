package bai1;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter usd:");
        double usd = scanner.nextDouble();
        double rate = usd * 23000;
        System.out.println("VND value: " + rate);
    }
}
