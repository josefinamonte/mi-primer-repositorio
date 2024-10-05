
package interfaces.ejercicioDos;

import java.util.Date;

public class Vehiculo implements Frecuencia {
    private final int millasRecorridas;
    private final Date ultimoViaje;

    // Constructor
    public Vehiculo(int millasRecorridas, Date ultimoViaje) {
        this.millasRecorridas = millasRecorridas;
        this.ultimoViaje = ultimoViaje;
    }

    @Override
    public int millas() {
        return millasRecorridas;
    }

    @Override
    public Date ultimoViaje() {
        return ultimoViaje;
    }

    @Override
    public String toString() {
        return "Vehículo - Millas recorridas: " + millasRecorridas + ", Último viaje: " + ultimoViaje;
    }
}
