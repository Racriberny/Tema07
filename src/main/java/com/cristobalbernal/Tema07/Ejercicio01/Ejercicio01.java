package com.cristobalbernal.Tema07.Ejercicio01;

import com.cristobalbernal.Tema07.Lib.Lib;

public class Ejercicio01 {
    public static void main(String[] args) {
        String palabra = "";
        System.out.println("Escribe un palabra: ");
        palabra = Lib.leerLinea();
        System.out.println(mayuscula(palabra));
    }
    public static String mayuscula(String palabra){
        if (palabra !=null && palabra.isEmpty()){
            return null;
        }
        return Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
    }
}