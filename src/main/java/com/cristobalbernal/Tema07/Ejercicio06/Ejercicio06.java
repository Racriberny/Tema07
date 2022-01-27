package com.cristobalbernal.Tema07.Ejercicio06;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio06 {
    public static void main(String[] args) {
        String frase = "";
        int vecesRepetida = 1;
        System.out.println("Escribe una frase: ");
        frase = Lib.leerLinea();
        do {
            System.out.println("Escribe las veces que quiereas que se repita ");
            vecesRepetida = Lib.leerInt();
        }while (vecesRepetida <=0);
        repetirFrase(frase,vecesRepetida);
    }
    public static void repetirFrase(String frase,int multiplicacion){
        for (int i = 0; i < multiplicacion ; i++) {
            System.out.println(frase);
        }
    }
}
