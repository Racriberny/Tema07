package com.cristobalbernal.Tema07.Ejercicio13;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio13 {
    public static void main(String[] args) {
        int elementos = 10;
        int[] numero = new int[elementos];
        int suma = 0;
        int media = 0;
        for (int i = 0; i < numero.length ; i++) {
            System.out.println("Escrie el numero " + i);
            numero[i] = Lib.leerInt();
            suma += numero[i];
        }
        media = suma/numero.length;
        System.out.println("La media es: " + media);
    }
}
