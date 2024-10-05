/*Ejercicio 1: Colecciones. Escribir un programa que sea capaz de crear
un array de 1.000 elementos de números aleatorios y retorne la posición 
y valor del número más alto y más bajo.

Colecciones: En Java, una colección es un objeto que puede contener 
un número variable de elementos. 
Las colecciones proporcionan una forma flexible de almacenar y manipular
grupos de objetos. Hay diferentes tipos de colecciones en Java, 
como Listas, Conjuntos y Mapas.*/

package colecciones;

import java.util.Random;

public class Ejercicio_uno {
    public static void main(String[] args) {
       
        int[] numeros = new int[1000];
        
        // Llenar el array con números aleatorios
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(2000); // Números aleatorios del 0 al 1999
        }
        
        // Encontrar el número más alto y su posición
        int maxNumero = 0;
        int maxPosicion = 0;
        
       for (int i = 1; i < numeros.length; i++) {
           if (numeros[i] > maxNumero) {
               maxNumero = numeros[i];
               maxPosicion = i;
           }
       }

       // Encontrar el número más bajo y su posición
       int minNumero= 3000;
       int minPosicion=0;
       
      for(int j=1;j<numeros.length;j++){
          if(numeros[j]<minNumero){
              minNumero=numeros[j];
              minPosicion=j;
          }
      }

      System.out.println("El número más alto es " + maxNumero + " en la posición " + maxPosicion);
      System.out.println("El número más bajo es " + minNumero+ " en la posición "+minPosicion);

    }
}   

