package com.Azizbek.menus;
import com.Azizbek.utils.convertors.CircleArea;
import com.Azizbek.utils.convertors.EvenOrOdd;

import java.util.Scanner;

/**
 * Created by Yarik on 20.07.2016.
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            int a = (int) scanner.nextDouble();
            if (a == 1) {
                CircleArea.calculate();}
            System.out.println( );
        }
        while(i>0);


    }
}
