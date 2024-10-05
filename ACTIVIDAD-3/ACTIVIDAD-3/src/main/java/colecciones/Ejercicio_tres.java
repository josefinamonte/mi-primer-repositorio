/*
Ejercicio 3: Colecciones. Escribir un programa que simule las lecturas 
del scanner del supermercado y almacene productos que ingresará un usuario. 
Al finalizar, se debe obtener el precio total que debe pagar el cliente.
 */
package colecciones;


import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio_tres {
 public static void main(String[] args) {
   
        // Crear un mapa para almacenar los productos y sus precios
        Map<String, Double> productos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String producto;
        double precio, total = 0.0;
        int opcion;

        // Simular la lectura de productos
        do {
            System.out.println("Supermercado ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Finalizar y obtener total a pagar");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            if (opcion == 1) {
                // Ingresar el nombre del producto
                System.out.print("Ingresa el nombre del producto: ");
                producto = scanner.nextLine();

                // Ingresar el precio del producto
                System.out.print("Ingresa el precio del producto: ");
                precio = scanner.nextDouble();
                total=total+precio;

                // Almacenar el producto en el HashMap
                productos.put(producto, precio);

                System.out.println(producto + " agregado con un precio de $" + precio);
            }

        } while (opcion != 2);
        
            System.out.println(" El total de la compra es: $" + total);    
    }
}


