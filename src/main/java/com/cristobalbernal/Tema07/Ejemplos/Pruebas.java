package com.cristobalbernal.Tema07.Ejemplos;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {
        final int N_ELEMENTOS = 10;
        int[]array = {1,2,3,4};
        int[]arrayCopia = array.clone();

        Persona[] personas = new Persona[N_ELEMENTOS];


        for (int i = 0; i <personas.length ; i++) {
            Persona p = new Persona();
            p.nombre = "Persona " + i;
            p.edad = Lib.numeroAleatorio(0, 30);
            personas[i] = p;
        }
        Persona[] personasCopia = personas.clone();
        System.out.println(Arrays.toString(personas));
        System.out.println(Arrays.toString(array));
        System.out.println("Copias");
        System.out.println(Arrays.toString(personasCopia));
        System.out.println(Arrays.toString(arrayCopia));

        array[1] = 10;
        array[2] = 20;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayCopia));

        personas[1].nombre = "Minguet";
        personas[2].nombre = "Ferrer";
        System.out.println(Arrays.toString(personas));
        System.out.println(Arrays.toString(personasCopia));

    }
    public static class Persona{
        String nombre;
        int edad;

        @Override
        public String toString() {
            return "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }
}
