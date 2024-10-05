
package interfaces.ejercicioDos;

import java.util.Date;

public class Pasajero implements Frecuencia {
    private final int millasAcumuladas;
    private final Date ultimoViaje;

    // Constructor
    public Pasajero(int millasAcumuladas, Date ultimoViaje) {
        this.millasAcumuladas = millasAcumuladas;
        this.ultimoViaje = ultimoViaje;
    }

    @Override
    public int millas() {
        return millasAcumuladas;
    }

    @Override
    public Date ultimoViaje() {
        return ultimoViaje;
    }

    @Override
    public String toString() {
        return "Pasajero - Millas acumuladas: " + millasAcumuladas + ", Último viaje: " + ultimoViaje;
    }
}
