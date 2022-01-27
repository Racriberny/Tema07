package com.cristobalbernal.Tema07.Ejercicio25;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.util.Arrays;

public class Ejercicio25 {
    public static void main(String[] args) {
        final int N_ELEMENTOS = 50;
        final int MIN = 1;
        final int MAX = 50;
        int[] arrayV = new int[N_ELEMENTOS];
        int[] arrayP = new int[paresEnP(arrayV)];

        Lib.arrayAlea(arrayV,MIN,MAX);

        int contadorPares = comprobarNumeroPares(arrayV);

        if (contadorPares == 0){
            System.out.println("El array no tiene ningun par");
        }else {
            System.out.println("Array de P");
            System.out.println(Arrays.toString(copiarArrayP(arrayV,arrayP)));
            System.out.println("Array de V");
            Lib.visualizarArraysInt(arrayV);
        }
    }
    public static int paresEnP(int[]arrayV){
        int contador =0;
        for (int i = 0; i < arrayV.length ; i++) {
            if (arrayV[i] % 2 == 0){
                contador++;
            }
        }
        return contador;

    }

    public static int[] copiarArrayP(int[] arrayV, int[]arrayP){
        for (int i = 0; i < arrayV.length ; i++) {
            if (arrayV[i] % 2 == 0){
                arrayP[i] = arrayV[i];
            }
        }
        return arrayP;
    }
    public static int comprobarNumeroPares(int [] vector){
        int contador = 0;
        for (int i = 0; i <vector.length ; i++) {
            if (vector[i] % 2 ==0){
                contador++;
            }
        }
        return contador;
    }


}
