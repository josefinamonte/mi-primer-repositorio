/*Ejercicio 2: Interfaces. 
Escribir una clase “Pasajero” y hacer que implemente la interface 
“Frecuencia” en la cual están definidos los siguientes métodos: 
public int millas(); /* Retorna las millas acumuladas de ese pasajero. 
public Date ultimoViaje(); /*Retorna la fecha del último viaje realizado.
Ahora, crear una clase “Vehículo” que implemente la misma interface “Frecuencia”.*/

/*Ejercicio 3
Está perfecto, pero en la clase donde se hacen las pruebas, para que 
quede en evidencia el uso de interfaces se deberían haber invocado 
los métodos millas() y ultimoViaje() a ambos objetos.

*/

package interfaces.ejercicioDos;
import java.util.Date;

public class EjercicioDos {

    public static void main(String[] args) {

        // Crear una instancia de Pasajero
        Pasajero pasajero = new Pasajero(15000, new Date());
        System.out.println(pasajero);
        
        // Invocar los métodos millas() y ultimoViaje() en el objeto pasajero
        System.out.println("Millas acumuladas por el pasajero: " + pasajero.millas());
        System.out.println("Último viaje del pasajero: " + pasajero.ultimoViaje());

        // Crear una instancia de Vehiculo
        Vehiculo vehiculo = new Vehiculo(50000, new Date());
        System.out.println(vehiculo);

         // Invocar los métodos millas() y ultimoViaje() en el objeto vehiculo
         System.out.println("Millas recorridas por el vehículo: " + vehiculo.millas());
         System.out.println("Último viaje del vehículo: " + vehiculo.ultimoViaje());
    }
}