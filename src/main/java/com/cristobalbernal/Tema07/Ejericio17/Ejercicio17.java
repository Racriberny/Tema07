package com.cristobalbernal.Tema07.Ejericio17;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio17 {
    public static void main(String[] args) {
        int nuemroIntroducido = 0;
        double media;
        double suma = 0;
        int contador = 0;
        double [] personas;
        System.out.println("Escribe el numero de alturas que quieres introducir ");
        nuemroIntroducido = Lib.leerInt();
        personas = new double[nuemroIntroducido];
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Escribe las alturas: ");
            personas[i] = Lib.leerDouble();
            suma += personas[i];
        }
        media = suma/personas.length;

        for (double persona : personas) {
            if (persona > media) {
                contador++;
            }
        }
        System.out.println("Media " + media);
        System.out.println("Mas alto que la media " + contador);
    }
}
