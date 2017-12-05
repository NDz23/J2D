package mp.cdro;

/**
 *
 * @author diazn
 */

import grfcs.Pantalla;
import grfcs.Sprite;

public abstract class Cuadro {

    public int x;
    public int y;

    public Sprite sprite;
    
    public static final int LADO = 32;

    //Inicio coleccion de cuadros
    //public static final Cuadro CUADRO = new CuadroNombreCuadro(Sprite.nombreSprite);
    public static final Cuadro VACIO = new CuadroVacio(Sprite.VACIO);
    public static final Cuadro ASFALTO = new CuadroAsfalto(Sprite.ASFALTO);
    //Fin coleccion de cuadros

    public Cuadro(Sprite sprite) {
        this.sprite = sprite;
    }

    public void mostrar(int x, int y, Pantalla pantalla) {
        pantalla.mostrarCuadro(x << 5, y << 5, this);
    }

    public boolean solido() {
        return false;
    }
}
