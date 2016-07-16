package com.Azizbek.utils.convertors;

import java.util.Scanner;

/**
 * Created by Yarik on 16.07.2016.
 */
public class CircleArea {
    public static final  double PI = 3.14d;

        public static void calculate() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Radius values");
            double radius = scanner.nextDouble();
            double circleArea = radius * radius * PI;
            System.out.println("Area is " + circleArea);

        }
}

