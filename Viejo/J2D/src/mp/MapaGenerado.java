package mp;

import java.util.Random;

/**
 *
 * @author diazn
 */
public class MapaGenerado extends Mapa {

    private static final Random ALEATORIO = new Random();

    public MapaGenerado(int ancho, int alto) {
        super(ancho, alto);
    }

    @Override
    protected void generarMapa() {
        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                cuadros[x + y * ancho] = ALEATORIO.nextInt(32);
            }
        }
    }
}
