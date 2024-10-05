
package colecciones;

public class Cronometro {
 private long inicio; // Variable para almacenar el tiempo de inicio
 private long fin; // Variable para almacenar el tiempo de finalización

 public void empezar() {
  inicio = System.currentTimeMillis(); // Obtiene el tiempo actual en milisegundos y lo asigna a la variable inicio
 }

 public void finalizar() {
  fin = System.currentTimeMillis(); // Obtiene el tiempo actual en milisegundos y lo asigna a la variable fin
 }

 public void reset() {
  inicio = 0; // Resetea la variable inicio
  fin = 0; // Resetea la variable fin
 }

 public long obtenerTiempoTranscurrido() {
  return fin - inicio; // Retorna la diferencia entre los tiempos de finalización e inicio, que representa el tiempo transcurrido
 }
}