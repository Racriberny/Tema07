package com.cristobalbernal.Tema07.Ejercicio19;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio19 {
    public static void main(String[] args) {
        final int ELEMENTOSARRAY = 100;
        final int MIN = 0;
        final int MAX = 100;
        int [] numeros = new int[100];

        Lib.arrayAlea(numeros,MIN,MAX);

        System.out.println("Multiplos de cinco: ");
        multiploCinco(numeros);
        System.out.println("Multiplos de diez: ");
        multiploDiez(numeros);
        System.out.println("Multiplos de cero: ");
        ceros(numeros);
    }

    /**
     * Te saca los multiplos de cicno por pantalla
     * @param array el array con los numeros
     */
    public static void multiploCinco(int [] array){
        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * Saca los cero que tiene el array por pantalla
     * @param array el array con los numeros
     */
    public static void ceros(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                System.out.println(array[i]);
            }
        }
    }

    /**
     * Saca los multiplos de Diez por pantalla
     * @param array el array con los numeros
     */
    public static void multiploDiez(int [] array){
        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 10 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
