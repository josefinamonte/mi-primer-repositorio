/*Ejercicio 2: Interfaces. 
Escribir una clase “Pasajero” y hacer que implemente la interface 
“Frecuencia” en la cual están definidos los siguientes métodos: 
public int millas(); /* Retorna las millas acumuladas de ese pasajero. 
public Date ultimoViaje(); /*Retorna la fecha del último viaje realizado.
Ahora, crear una clase “Vehículo” que implemente la misma interface “Frecuencia”.*/

package interfaces.ejercicioDos;
import java.util.Date;

public class EjercicioDos {
    
    public static void main(String[] args) {
        
        // Crear una instancia de Pasajero
        Pasajero pasajero = new Pasajero(15000, new Date());
        System.out.println(pasajero);

        // Crear una instancia de Vehiculo
        Vehiculo vehiculo = new Vehiculo(50000, new Date());
        System.out.println(vehiculo);
    }
}