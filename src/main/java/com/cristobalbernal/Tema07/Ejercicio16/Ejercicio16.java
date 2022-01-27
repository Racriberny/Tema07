package com.cristobalbernal.Tema07.Ejercicio16;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio16 {
    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = 10;
        double suma = 0;
        double sumaMasCinco = 0;
        double media = 0;
        int contador = 0;
        double mediaCinco = 0;
        double [] notas = new double[30];
        for (int i = 0; i <notas.length ; i++) {
            notas[i] = Lib.numeroAleatorioDouble(MIN,MAX);
            suma += notas[i];
            if (notas[i] >= 5){
                sumaMasCinco += notas[i];
                contador++;
            }
        }
        media = suma/notas.length;
        mediaCinco = sumaMasCinco/contador;
        System.out.println("Media " + media);
        System.out.println("Media de cinco " + mediaCinco);
    }
}
