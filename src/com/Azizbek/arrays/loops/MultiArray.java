package com.Azizbek.arrays.loops;

/**
 * Created by Yarik on 21.07.2016.
 */
public class MultiArray {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8};

        int[][]matrice = {{1,2,3,4,5,},
                {6,7,8,9,10,11,},
                {12,13,14,15,16,},
                {17,18,19,20,21,},
                {22,23,24,25,26,},
                {27, 28,29,30,31,},
                {32, 33,34,35,36,},
                {37,38,39,40,41}};
        for(int i = 0; i<matrice.length; i++){
            for(int j = 0; j<matrice.length; j++){
                System.out.println(matrice[i][j] +" ");
            }
            System.out.println();
        }

    }
}
