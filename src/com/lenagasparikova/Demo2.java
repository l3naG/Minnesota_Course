package com.lenagasparikova;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
//
////        $$A = 4 \pi r^2$$
//        area = 4 * Math.PI * Math.pow(r, 2);
//        System.out.println(area);


        double r, area, circum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        r = scanner.nextDouble();

        circum = 2 * Math.PI * r;
        area = Math.PI * Math.pow(r, 2);

        System.out.println("For a circle with radius " + r + ",");
        System.out.println(" the circumference is " + circum);
        System.out.println(" and the area is " + area + ".");

        scanner.close();


    }
}
