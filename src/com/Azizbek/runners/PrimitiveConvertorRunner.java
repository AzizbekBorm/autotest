package com.Azizbek.runners;

import com.Azizbek.utils.convertors.PrimitiveConvertor;

/**
 * Created by Yarik on 16.07.2016.
 */
public class PrimitiveConvertorRunner {
    public static void main(String args[]) {
    PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar();
        primitiveConvertor.intToChar();
        primitiveConvertor.charToInt();
    }
}
