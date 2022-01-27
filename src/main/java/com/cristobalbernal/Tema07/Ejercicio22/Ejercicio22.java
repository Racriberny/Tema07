package com.cristobalbernal.Tema07.Ejercicio22;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.util.Arrays;

public class Ejercicio22 {
    public static void main(String[] args) {
        final int LONGITUD = 10;
        final int MIN = 0;
        final int MAX = 50;
        int [] arrayP = new int[LONGITUD];
        int [] arrayS = arrayP;
        Lib.arrayAlea(arrayP,MIN,MAX);
        Lib.visualizarArraysInt(arrayP);
        System.out.println(Arrays.toString(mayoresDeDiez(arrayP,arrayS)));

    }
    public static int [] mayoresDeDiez(int [] arrayP,int[] arrayS){
        for (int i = 0; i <arrayP.length ; i++) {
            if (arrayP[i] >= 10){
                arrayS[i] = arrayP[i];
            }else {
                arrayS[i] = -1;
            }
        }
        return arrayS;
    }
}
