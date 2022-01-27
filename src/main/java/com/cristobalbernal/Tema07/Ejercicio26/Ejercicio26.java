package com.cristobalbernal.Tema07.Ejercicio26;

import com.cristobalbernal.Tema07.Lib.Lib;
import com.sun.jdi.Value;

import java.util.Arrays;


public class Ejercicio26 {
    public static final int FILAS = 4;
    public static final int COLUMNAS = 8;
    public static final int MIN = 1;
    public static final int MAX = 25;
    public static void main(String[] args) {

        int[] [] matriz = new int[FILAS] [COLUMNAS];
        int [] [] transpuesta = new int[matriz[0].length][matriz.length];
        Lib.rellenarMatrix(matriz,MIN,MAX);
        System.out.println("Apartado A: ");
        Lib.visulizarMatrix(matriz);
        System.out.println();
        System.out.println("Apartado B: ");
        System.out.println();
        transpuesta(matriz,transpuesta);
        System.out.println();
        System.out.println("Apartado C: ");
        System.out.println();
        sumaFila(matriz);
        System.out.println("Min y max: ");
        minMaxMatrix(matriz);
        System.out.println("Media: ");
        System.out.println(mediaMatrix(matriz));
        System.out.println("Indicada por el usuario: ");
        indicadaPorUsuario(matriz);
        System.out.println("Fila: ");
        int fila = Lib.leerInt();
        System.out.println(Arrays.toString(preguntarFila(matriz, fila)));
        System.out.println("Columna: ");
        int columna = Lib.leerInt();
        System.out.println(Arrays.toString(preguntarColumna(matriz, columna)));
        System.out.println("Apartado I: ");
        columnaOcho(matriz);


    }
    public static void transpuesta(int[][]array, int [][] matrizTranspuesta){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                matrizTranspuesta[j][i] = array[i][j];
            }
        }
        for (int x = 0; x <matrizTranspuesta.length ; x++) {
            for (int y = 0; y <matrizTranspuesta[x].length ; y++) {
                System.out.print(matrizTranspuesta[x][y] + "\t");
            }
            System.out.println();
        }
    }
    public static void sumaFila(int[][] array){
        int suma = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                suma += array[i][j];
            }
            System.out.println("Suma: " + suma);
            suma = 0;
        }
    }
    //cambiar
    public static void minMaxMatrix(int[][]array){
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                }
                if (array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
    }
    public static int mediaMatrix(int[][]array){
        int suma = 0;
        int media = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                suma += array[i][j];
            }
        }
        media = suma/array.length;
        return media;
    }
    public static void indicadaPorUsuario(int[][]array){
        int fila = 0;
        int columna = 0;

        System.out.println("Escribe la fila: ");
        fila = Lib.leerInt();
        System.out.println("Escribe la columna: ");
        columna = Lib.leerInt();

        System.out.println(array[fila][columna]);

    }
    public static int[] preguntarColumna(int[][] matriz, int columna) {
        int[] columnas = new int[matriz.length];
        for (int i = 0; matriz.length > i; i++) {
            int[] fila = matriz[i];

            columnas[i] = fila[columna];
        }

        return columnas;
    }
    public static int[] preguntarFila(int[][] matriz,int fila) {
        return matriz[fila];
    }
    public static void columnaOcho(int[][] array){
        int suma = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                suma += array[i][7];
            }
            System.out.println("Suma: " + suma);
            suma = 0;
        }
    }
}
