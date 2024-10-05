/*Ejercicio 1: Colecciones. Escribir un programa que sea capaz de crear
un array de 1.000 elementos de números aleatorios y retorne la posición 
y valor del número más alto y más bajo.

Colecciones: En Java, una colección es un objeto que puede contener 
un número variable de elementos. 
Las colecciones proporcionan una forma flexible de almacenar y manipular
grupos de objetos. Hay diferentes tipos de colecciones en Java, 
como Listas, Conjuntos y Mapas.*/

package colecciones;

import java.util.ArrayList;

public class Ejercicio_uno {
    public static void main(String[] args) {
       
        // Crear un ArrayList de Integer
        ArrayList<Integer> numeros = new ArrayList<>();

        // Llenar el ArrayList con 1,000 números aleatorios entre 0 y 1999
        for (int i = 0; i < 1000; i++) {
            int numeroAleatorio = (int) (Math.random() * 2000); // Números aleatorios entre 0 y 1999
            numeros.add(numeroAleatorio);
        }

        // Inicializar el número más alto y más bajo
        int maxNumero = Integer.MIN_VALUE; // Valor mínimo posible para un entero
        int minNumero = Integer.MAX_VALUE; // Valor máximo posible para un entero
        int maxPosicion = 0;
        int minPosicion = 0;

        // Recorrer la lista para encontrar el máximo y el mínimo
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maxNumero) {
                maxNumero = numeros.get(i); // Actualizar máximo
                maxPosicion = i; // Actualizar posición del máximo
            }
            if (numeros.get(i) < minNumero) {
                minNumero = numeros.get(i); // Actualizar mínimo
                minPosicion = i; // Actualizar posición del mínimo
            }
        }

        // Imprimir los resultados
        System.out.println("El número más alto es " + maxNumero + " en la posición " + maxPosicion);
        System.out.println("El número más bajo es " + minNumero + " en la posición " + minPosicion);
    }
}


