package com.Azizbek.arrays.loops;

/**
 * Created by Yarik on 21.07.2016.
 */
public class Array {
    public static void main(String[] args) {
        int[] number = new int[11];
        for(int i = 1; i<number.length; i++){
            number[i] = i*2;
        }
        for(int i = 1; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}
