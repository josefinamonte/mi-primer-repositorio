
package interfaces.ejercicioTres;

public class TalkAdmin {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();
        CuCu reloj = new CuCu();

        hacerHablar(gato);   
        hacerHablar(perro);  
        hacerHablar(reloj);  
    }

    public static void hacerHablar(Hablador vaHablar) {
        vaHablar.hablar();
    }
}
