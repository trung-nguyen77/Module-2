package bai4;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c :");
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner1.nextDouble();
        double b = scanner1.nextDouble();
        double c = scanner1.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if(qe.getDiscriminant()<0) System.out.println("The equation has no roots");
        else if(qe.getDiscriminant()==0) System.out.println("The equation has one root: "+qe.getRoot1());
        else{
            System.out.println("The equation has two roots: ");
            System.out.println("Delta is: "+qe.getDiscriminant());
            System.out.println("Root1 is: "+qe.getRoot1());
            System.out.println("Root2 is: "+qe.getRoot2());
        }
    }
}
