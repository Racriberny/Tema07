package com.cristobalbernal.Tema07.Ejercicio03;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio03 {
    public static void main(String[] args) {
        String frase = "";
        System.out.println("Escribe un frase para contar el numero de palabras que tiene la frase");
        frase = Lib.leerLinea();
        System.out.println("Numero de palabras " + nPalabras(frase));
    }
    public static int nPalabras(String frase){
        int contador = 1;
        if (frase.isEmpty()){
            return 0;
        }else {
            for (int i = 0; i <frase.length() ; i++) {
                if (frase.charAt(i) == ' '){
                    contador++;
                }
            }
            return contador;
        }
    }
}
