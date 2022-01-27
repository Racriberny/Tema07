package com.cristobalbernal.Tema07.Ejercicio04;

import com.cristobalbernal.Tema07.Ejercicio02.Ejercicio02;
import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio04 {
    public static void main(String[] args) {
        String frase = "";
        String vocales = "AEIOUaeiou";
        String consonantes = "BCDFGHJKLMNÑPQRSTVXZWYbcdfghjklmnpqrstvxzwy";
        int contadorPalabras = 1;
        int contadorCosonantes = 0;
        int contadorVocales = 0;
        System.out.println("Escribe un frase ");
        frase = Lib.leerLinea();
        for (int i = 0; i <frase.length() ; i++) {
            if (frase.charAt(i) == ' '){
                System.out.println("La palabra " + contadorPalabras + " tiene " + contadorVocales + " vocales");
                System.out.println("La palabra " + contadorPalabras + " tiene " + contadorCosonantes + " consonantes");
                contadorPalabras++;
                contadorCosonantes = 0;
                contadorVocales = 0;
            }else {
                for (int j = 0; j < consonantes.length() ; j++) {
                    if (frase.charAt(i) == consonantes.charAt(j)){
                        contadorCosonantes++;
                    }
                }
                for (int j = 0; j <vocales.length() ; j++) {
                    if (frase.charAt(i) == vocales.charAt(j)){
                        contadorVocales++;
                    }
                }
            }
        }
        System.out.println("La palabra " + contadorPalabras + " tiene " + contadorVocales + " vocales");
        System.out.println("La palabra " + contadorPalabras + " tiene " + contadorCosonantes + " consonantes");
    }
}
