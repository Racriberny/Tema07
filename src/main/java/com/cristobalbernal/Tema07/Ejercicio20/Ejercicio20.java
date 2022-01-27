package com.cristobalbernal.Tema07.Ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {
        int [] numeros = {20,4,2,87,23,1,45,23};

        if (validacionNumero(numeros,10)){
            System.out.println("Tiene el numero");
        }else {
            System.out.println("No tiene el numero");
        }
    }

    /**
     * Saber si un numero esta en el array que le pasamos
     * @param array el array con los numeros
     * @param numero el numero que queremos saber si esta en el array
     * @return true o false depende si el numero esta en el array o no.
     */
    public static boolean validacionNumero(int [] array , int numero){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero){
                return true;
            }
        }
        return false;
    }
}
