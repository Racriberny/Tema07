package com.cristobalbernal.Tema07.Ejercicio21;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio21 {
    private static final int MIN = 0;
    private static final int MAX = 50;

    public void execute() {
        final int ELEMENTOS = 10;
        int opcion = 0;
        int [] array = new int[ELEMENTOS];
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                   crearArray(array);
                    System.out.println("Has rellenado el array!!!!!");
                   break;
                case 2:
                    visualitzarArray(array);
                    break;
                case 3:
                    visualitzarParell(array);
                    break;
                case 4:
                    visualitzarMultiple3(array);
                    break;
            }
        }while (opcion !=0);
        System.out.println("Hasta luego guarro");
    }

    /**
     * Rellenamos el array con numero aleatorios.
     * @param vector le pasas el array.
     */
    public static void crearArray(int [] vector) {
        System.out.println("Creando array!!!!");
        Lib.arrayAlea(vector,MIN,MAX);
    }

    /**
     * Visualizamos el array.
     * @param vector le pasas el array donde tiene los numero.
     */
    public static void visualitzarArray(int[] vector){
        System.out.println("Visualizando array!!!!");
        System.out.println(Arrays.toString(vector));
    }

    /**
     * Visualiza el los multiplos de 2.
     * @param vector le pasas el array donde tiene los numero.
     */
    public static void visualitzarParell(int[] vector){
        System.out.println("Numeros pares!!!");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] % 2 == 0){
                System.out.println(vector[i]);
            }
        }
    }

    /**
     * Visualiza el los multiplos de 3.
     * @param vector le pasas el array donde tiene los numero.
     */
    public static void visualitzarMultiple3(int[] vector){
        System.out.println("Numero multiplos de 3!!!!!");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] % 3 == 0){
                System.out.println(vector[i]);
            }
        }
    }

    /**
     * Esto es el menu principal del ejercicio.
     * @return devuelve la opcion que ha introducido el menu.
     */
    public static int menuPrincipal() {
        int opcion;
        System.out.println("MENU PRINCIPAL");
        System.out.println("--------------");
        System.out.println("1 - Rellenar Array");
        System.out.println("2 - Visualizar contenido del array");
        System.out.println("3 - Visualizar contenido par");
        System.out.println("4 - Visualizar contenido multiplo de 3");
        System.out.println("0. Salir");
        System.out.print("\nElige una opción: ");
        opcion = Lib.leerInt();
        return opcion;
    }
}
