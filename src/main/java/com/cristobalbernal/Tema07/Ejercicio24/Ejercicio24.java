package com.cristobalbernal.Tema07.Ejercicio24;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.util.Arrays;

public class Ejercicio24 {
    public static void main(String[] args) {
        int [] array = new int[50];
        Lib.arrayAlea(array,1,20);
        System.out.println("Array sin sumar!!");
        Lib.visualizarArraysInt(array);
        System.out.println("Array sumada!!!");
        System.out.println(Arrays.toString(sumaArray(array)));
    }

    public static int[] sumaArray(int[] arrayDos){
        int[] arrayUno = new int[arrayDos.length];
        arrayUno[0] = arrayDos[0];
        for(int i = 1; i < arrayDos.length; i++){
            arrayUno[i] = arrayUno[i-1] + arrayDos[i];
        }
        return arrayUno;
    }
}
