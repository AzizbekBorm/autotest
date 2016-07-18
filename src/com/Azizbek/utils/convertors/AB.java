package com.Azizbek.utils.convertors;

import java.util.Scanner;

/**
 * Created by Yarik on 18.07.2016.
 */
public class AB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = (int) scanner.nextDouble();
        System.out.println("Enter b ");
        int b = (int) scanner.nextDouble();

        if(a > b){
            do {a = a - 1;
                System.out.println("a is " + a + "b is " + b);}
                while(a>b);
        }

            else {
            System.out.println("a is " + "b is " + b);

        }
    }
}
