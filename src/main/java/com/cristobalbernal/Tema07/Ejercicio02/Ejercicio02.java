package com.cristobalbernal.Tema07.Ejercicio02;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio02 {
    public static void main(String[] args) {
        String frase = "";
        System.out.println("Escribe una frase ");
        frase = Lib.leerLinea();
        System.out.println("Numero de vocales de la frase " + nVocales(frase));
        System.out.println("Numero de consonantes de la frase " + nConsonantes(frase));
    }
    public static int nVocales(String frase){
        int contador = 0;
        //Flatan las letras con acento
        String vocales = "AEIOUaeiou";
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j <vocales.length() ; j++) {
                if (frase.charAt(i) == vocales.charAt(j)){
                    contador++;
                }
            }
        }
        return contador;
    }
    public static int nConsonantes(String frase){
        int contador = 0;
        //Falta la Ñ
        String consonantes = "BCDFGHJKLMNÑPQRSTVXZWYbcdfghjklmnpqrstvxzwy";
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j <consonantes.length() ; j++) {
                if (frase.charAt(i) == consonantes.charAt(j)){
                    contador++;
                }
            }
        }
        return contador;
    }
}
