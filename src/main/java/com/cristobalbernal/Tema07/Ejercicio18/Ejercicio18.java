package com.cristobalbernal.Tema07.Ejercicio18;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.util.Arrays;

public class Ejercicio18 {
    public static void main(String[] args) {
        final int ELEMENTOS_PRIMERA = 10;
        final int MIN = 1;
        final int MAX = 10;
        final int ELEMENTOS_SEGUNDA = 10;
        int [] primera = new int[ELEMENTOS_PRIMERA];
        int [] segunda = new int[ELEMENTOS_SEGUNDA];

        Lib.arrayAlea(primera, MIN, MAX);
        Lib.arrayAlea(segunda, MIN, MAX);

        int [] suma = sumar(primera,segunda);
        int [] division = division(primera,segunda);
        System.out.println("Suma " + Arrays.toString(suma));
        System.out.println("Division " + Arrays.toString(division));
    }

    public static int[] sumar(int[] primera, int[] segunda) {
        int [] suma = new int [primera.length];

        for (int i = 0; suma.length > i; i++) {
            int resultado = primera[i] + segunda[i];
            suma[i] = resultado;
        }
        return suma;
    }
    public static int[] division(int[] primera, int[] segunda) {
        int [] division = new int [primera.length];

        for (int i = 0; division.length > i; i++) {
            int resultado = primera[i] / segunda[i];

            division[i] = resultado;
        }
        return division;
    }
}
