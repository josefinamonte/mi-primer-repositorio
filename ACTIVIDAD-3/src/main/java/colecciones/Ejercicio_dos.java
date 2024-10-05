/*Ejercicio 2: Colecciones. Crear una clase “Cronometro” que tenga 
los métodos empezar(), finalizar() y reset(). Luego, crear un array 
de 100 números aleatorios y calcular cuánto demora la función sort() 
en ordenarlo. Probar con 1.000, 10.000 y 100.000 elementos.

1. `List<Integer> lista_uno = new ArrayList<>();` 
- Aquí se está creando una colección de tipo lista llamada 
`lista_uno`. 
La interfaz `List` define una colección ordenada y la clase concreta 
`ArrayList` es una implementación de esta interfaz. 
En este caso, se está utilizando `ArrayList`, que es una estructura 
de datos que almacena elementos en forma de lista.

2. `Collections.sort(lista_uno);` 
- La clase `Collections` es una utilidad proporcionada por Java para 
operaciones comunes en colecciones, como clasificar (en este caso) y 
buscar elementos en listas, conjuntos, etc.

Por lo tanto, la colección es la estructura que almacena los números 
aleatorios (en este caso un ArrayList), y la interfaz es el contrato o 
especificación del comportamiento de esa colección (en este caso List). 
Mientras tanto, Collections es solo un conjunto de métodos utilitarios 
para trabajar con las colecciones.*/

package colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio_dos {
    public static void main(String[] args) {
        List<Integer> lista_uno = new ArrayList<>(100); // Se crea un ArrayList para almacenar los números aleatorios
        List<Integer> lista_dos = new ArrayList<>(1000);
        List<Integer> lista_tres = new ArrayList<>(10000);
        
        Random rand = new Random(); 
        
        //lista uno
        for (int i = 0; i < 100; i++) { 
           lista_uno.add(rand.nextInt(100)); 
        } 
        //lista dos
        for (int i = 0; i < 1000; i++) { 
           lista_dos.add(rand.nextInt(1000)); 
        } 
        //lista tres
        for (int i = 0; i < 10000; i++) { 
           lista_tres.add(rand.nextInt(1000)); 
        } 
        
        //lista uno
        Cronometro cronometro = new Cronometro();
        cronometro.empezar(); 
        Collections.sort(lista_uno);
        cronometro.finalizar();
        System.out.println("Tiempo transcurrido en ordenar la lista uno de 100 numeros es: " + cronometro.obtenerTiempoTranscurrido() + " milisegundos");
        
        // lista dos
        cronometro.reset();
        cronometro.empezar(); 
        Collections.sort(lista_dos);
        cronometro.finalizar();
        System.out.println("Tiempo transcurrido en ordenar la lista dos de 1000 numeros es: " + cronometro.obtenerTiempoTranscurrido() + " milisegundos"); 
        
        // lista tres
        cronometro.reset();
        cronometro.empezar(); 
        Collections.sort(lista_tres);
        cronometro.finalizar();
        System.out.println("Tiempo transcurrido en ordenar la lista tres de 10000 numeros es: " + cronometro.obtenerTiempoTranscurrido() + " milisegundos"); 
        
    }
}

