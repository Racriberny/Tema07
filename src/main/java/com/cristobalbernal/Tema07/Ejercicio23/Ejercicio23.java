package com.cristobalbernal.Tema07.Ejercicio23;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.util.Arrays;

public class Ejercicio23 {
    public static void main(String[] args) {
        final int N_ELEMENTOS = 10;
        final int MIN = 1;
        final int MAX = 20;
        int[] arrayNumeros = new int[N_ELEMENTOS];
        Lib.arrayAlea(arrayNumeros,MIN,MAX);
        System.out.println("Array normal!!!!!");
        Lib.visualizarArraysInt(arrayNumeros);
        System.out.println("Array invertido!!!!");
        System.out.println(Arrays.toString(invertir(arrayNumeros)));
    }

    /**
     * Invertir el array.
     * @param vector el array con los numeros a invertir
     * @return devuelve el array invertido
     */
    public static int[] invertir(int[] vector){
        int[] invertido = new int[vector.length];
        for (int i = 0; i < vector.length ; i++) {
            invertido[i] = vector[vector.length-1-i];
        }
        return invertido;
    }

}
