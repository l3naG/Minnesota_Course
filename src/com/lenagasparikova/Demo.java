package com.lenagasparikova;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.println("Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.println("Enter side 3: ");
        int side3 = scanner.nextInt();

        if (isTriangle(side1, side2, side3)) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("This is not a triangle");
        }
    }

    public static boolean isTriangle(double side1, double side2, double side3) {
        if ((side1 + side2 > side3)
                && (side2 + side3 > side1)
                && (side1 + side3 > side2)) {
            return true;
        }
        return false;
    }


}
