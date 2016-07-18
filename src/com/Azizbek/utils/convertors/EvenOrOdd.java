package com.Azizbek.utils.convertors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Yarik on 18.07.2016.
 */
public class EvenOrOdd {
    public static void main(String[] args) throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number: ");
        int no =Integer.parseInt(reader.readLine());

        if(no%2==0)
        {
            System.out.println("Even ");
        }
        else
        {
            System.out.println("Odd ");
        }

    }
}
