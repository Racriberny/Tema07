package com.cristobalbernal.Tema07.Ejercicio07;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio07 {
    public static void main(String[] args) {
        String frase="";
        String[] palabras;
        System.out.println("Escribe una frase y te mostrare en una linea cada palabra");
        frase = Lib.leerLinea();
        palabras= frase.split(" ");

        // Otra forma for(int i = 0; i < palabras.length; i++) {
        //System.out.println(palabras[i]);
        //}

        for(String palabra : palabras){
            System.out.println(palabra);
        }

    }

    //Metodo public static void muestraPalabras(String frase) {
    //String[] palabras= frase.split(" ");

    //for(int i = 0; i < palabras.length; i++) {
    //System.out.println(palabras[i]);
    //}
    //}
}
