package com.Azizbek.utils.convertors;

/**
 * Created by Yarik on 16.07.2016.
 */
public class PrimitiveConvertor {
    char char1 = 0;
    int int1 = 0;
    float float1 = 69.0f;
    public void floatToChar() {
        char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
    }
    public void intToChar() {
        int1 = char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }
    public void charToInt(){
        char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);

    }
}


