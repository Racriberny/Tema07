package com.cristobalbernal.Tema07.Ejemplos;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.util.Arrays;

public class Ejemplos {
    public static void main(String[] args) {
        final int N_ELEMNTOS = 20;
        int array[] = new int[N_ELEMNTOS];
        int resultado[] = new int[N_ELEMNTOS];
        resultado = rellenaCeroPares(array);
        Lib.visualizarArraysInt(resultado);
        String [] arraysString = {"Hola","Buenas","Tardes"};
        int [] arrayNumero = {1,5,2,6,7,8,4};

        if (busqueda(arraysString,"Hola")){
            System.out.println("Contiene!!!");
        }else {
            System.out.println("No contiene");
        }

        if (busquedaDos(arrayNumero,4) == 0){
            System.out.println("No contiene el numero");
        }else {
            System.out.println("Contiene el numero");
        }


    }
    public static int[] rellenaCeroPares(int[] vector){
        for (int i = 0; i <vector.length ; i+=2) {
            vector[i] = 0;
        }
        return vector;
    }
    public static boolean busqueda(String[] vector, String busqueda){
        return Arrays.asList(vector).contains(busqueda);
    }
    public static int busquedaDos(int [] vector, int busqueda){
        int contador = 0;
        int numero = vector.length;
        while (numero>0){
            numero--;
            if (vector[numero] == busqueda){
                contador++;
            }
        }
        return contador;
    }

    public static int busquedaBinaria(int[]array,int numero){
        int centro;
        int inicio = 0;
        int fin = array.length -1;
        while (inicio >= fin){
            centro = array.length / 2;
            if (array[centro] > numero){
                fin = centro -1;
            }else if (array[centro] < numero){
                inicio = centro + 1;
            }else {
                return centro;
            }
        }
        return -1;
    }
}
