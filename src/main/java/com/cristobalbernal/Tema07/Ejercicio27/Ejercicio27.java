package com.cristobalbernal.Tema07.Ejercicio27;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio27 {
    public static void main(String[] args) {
        final int ELMENTOS_V = 50;
        final int ELMENTOS_P = 20;
        final int ELMENTOS_M = 50;
        final int MIN = 0;
        final int MAX = 50;
        int[] vectorV = new int[ELMENTOS_V];
        int[] vectorP = new int[ELMENTOS_P];
        int[] vectorM = new int[ELMENTOS_M];

        Lib.arrayAlea(vectorV,MIN,MAX);
        Lib.arrayAlea(vectorP,MIN,MAX);

        for (int i = 0; i <vectorV.length ; i++) {
            for (int j = 0; j < vectorP.length ; j++) {
                vectorM[i] = vectorV[i] * vectorP[j];
            }
        }
        Lib.visualizarArraysInt(vectorM);
    }
}
