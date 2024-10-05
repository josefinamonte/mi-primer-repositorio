
package interfaces.ejercicioUno;
public class Reproductor {

    public static void main(String[] args) {
        
        ReproductorMultimedia reproductor = new ReproductorMultimedia();
        
        reproductor.play();   // Comienza la reproducción
        reproductor.bucle();  // Activa el bucle infinito
        reproductor.stop();   // Detiene la reproducción (solo si ambas condiciones son verdaderas)
    }
}