package mp;

import java.util.Random;

/**
 *
 * @author diazn
 */
public class MapaGenerado extends Mapa {
    
    private final Random aleatorio = new Random();
    public MapaGenerado(int ancho, int alto) {
        super(ancho, alto);
    }
    
    @Override
    protected void generarMapa(){
        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                cuadros[x + y * ancho] = aleatorio.nextInt(3);
            }
        }
    }
}
