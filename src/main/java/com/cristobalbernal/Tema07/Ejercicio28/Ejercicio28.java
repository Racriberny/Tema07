package com.cristobalbernal.Tema07.Ejercicio28;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio28 {
    public static void main(String[] args) {
        final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int N_LETRAS = 500;
        char[] arrayLetras =  new char[N_LETRAS];
        int contador = 0;

        Lib.rellenarArrayLetrasMayus(arrayLetras, LETRAS);
        Lib.visualizarArraysChar(arrayLetras);

        for(int i = 0; i < LETRAS.length(); i++) {
            System.out.println(LETRAS.charAt(i) + " -> " + repeticionLetra(arrayLetras, LETRAS.charAt(i)));
            contador += repeticionLetra(arrayLetras, LETRAS.charAt(i));
        }
        System.out.println("Total: " + contador);
    }
    public static int repeticionLetra(char[] array, char letra) {
        int cont = 0;

        for(int i = 0; i < array.length; i++) {
            if(letra == array[i]) {
                cont++;
            }
        }
        return cont;
    }
}

