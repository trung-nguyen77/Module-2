package bai1;

import java.util.Scanner;

public class ReadNumbersIntoLetters {
    public static void main(String[] args) {
        String number1st = "1";
        int number2nd = 12;
        System.out.println(number1st + number2nd);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number >= 10) {
            while (number >= 10) {
                show(number % 10);
                number = number / 10;
            }
            show(1);
        } else {
            show(number);
        }
    }

    public static void show(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
    }
}
