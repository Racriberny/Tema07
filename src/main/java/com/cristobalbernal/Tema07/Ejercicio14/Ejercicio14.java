package com.cristobalbernal.Tema07.Ejercicio14;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio14 {
    public static void main(String[] args) {
        char [] letras = new char[10];
        Lib.arrayChar(letras);

        for (char letra : letras) {
            if (letra % 2 == 0) {
                System.out.println("Pares " + letra);
            }
        }
        for (char letra : letras) {
            if (letra % 2 != 0) {
                System.out.println("Impares " + letra);
            }
        }
    }
}
