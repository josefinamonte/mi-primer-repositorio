/*
Ejercicio 3: Colecciones. Escribir un programa que simule las lecturas 
del scanner del supermercado y almacene productos que ingresará un usuario. 
Al finalizar, se debe obtener el precio total que debe pagar el cliente.
 
Ejercicio 3
Está perfecto. Otra solución, y por ahí más acertada sería crear una 
Clase Producto que tenga 2 atributos: nombre y precio, 
y almacenar esos productos en una colección.

*/
package colecciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio_tres {
    public static void main(String[] args) {
        // Crear una lista para almacenar los productos
        List<Productos> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nombreProducto;
        double precioProducto, total = 0.0;
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
                nombreProducto = scanner.nextLine();

                // Ingresar el precio del producto
                System.out.print("Ingresa el precio del producto: ");
                precioProducto = scanner.nextDouble();
                total += precioProducto;

                // Crear el objeto Producto y almacenarlo en la lista
                Productos nuevoProducto = new Productos(nombreProducto, precioProducto);
                productos.add(nuevoProducto);

                System.out.println(nuevoProducto.getNombre() + " agregado con un precio de $" + nuevoProducto.getPrecio());
            }

        } while (opcion != 2);

        // Imprimir el total
        System.out.println("El total de la compra es: $" + total);
    }
}

