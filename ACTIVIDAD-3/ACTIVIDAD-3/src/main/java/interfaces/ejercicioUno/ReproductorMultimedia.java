
package interfaces.ejercicioUno;

public class ReproductorMultimedia implements VideoClip {

    private boolean reproducir;  // Variable "reproducir"
    private boolean video;       // Variable "video"
    
    // Constructor de la clase
    public ReproductorMultimedia() {
        this.reproducir = false;
        this.video = false;
    }

    @Override
    public void play() {
        if (!reproducir) {
            reproducir = true;
            System.out.println("El video ha comenzado a reproducirse.");
        } else {
            System.out.println("El video ya está en reproducción.");
        }
    }

    @Override
    public void bucle() {
        if (!video) {
            video = true;
            System.out.println("El video está reproduciéndose en bucle infinito.");
        } else {
            System.out.println("El video ya está en bucle.");
        }
    }

    @Override
    public void stop() {
        // Ahora ambas condiciones deben ser verdaderas para detener el video
        if (reproducir && video) {
            reproducir = false;
            video = false;
            System.out.println("El video ha sido detenido.");
        } else {
            System.out.println("El video no puede detenerse porque no está en reproducción y en bucle al mismo tiempo.");
        }
    }
}
  
