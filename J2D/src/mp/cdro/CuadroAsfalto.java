package mp.cdro;

/**
 *
 * @author diazn
 */

import grfcs.Pantalla;
import grfcs.Sprite;

public class CuadroAsfalto extends Cuadro {
    
    public CuadroAsfalto(Sprite sprite) {
        super(sprite);
    }
    
    public void mostrar(int x, int y, Pantalla pantalla){
        pantalla.mostrarCuadro(x, y, this);
    }
    
}
