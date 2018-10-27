package mp.cdro;

/**
 *
 * @author diazn
 */

import grfcs.Pantalla;
import grfcs.Sprite;

public class Cuadro {

    public int x;
    public int y;

    public Sprite sprite;
    
    public static final int LADO = 32;

    //Inicio coleccion de cuadros
    //public static final Cuadro CUADRO = new CuadroNombreCuadro(Sprite.nombreSprite);
    public static final Cuadro VACIO = new Cuadro(Sprite.VACIO);
    public static final Cuadro ARENA_1 = new Cuadro(Sprite.ARENA_1);
    public static final Cuadro ARENA_2 = new Cuadro(Sprite.ARENA_2);
    public static final Cuadro ARENA_3 = new Cuadro(Sprite.ARENA_3);
    public static final Cuadro AGUA_1 = new Cuadro(Sprite.AGUA_1);
    public static final Cuadro AGUA_2 = new Cuadro(Sprite.AGUA_2);
    public static final Cuadro AGUA_3 = new Cuadro(Sprite.AGUA_3);
    public static final Cuadro MONTICULO_ARENA_1 = new Cuadro(Sprite.MONTICULO_ARENA_1);
    public static final Cuadro MONTICULO_ARENA_2 = new Cuadro(Sprite.MONTICULO_ARENA_2);
    public static final Cuadro MONTICULO_ARENA_3 = new Cuadro(Sprite.MONTICULO_ARENA_3);
    public static final Cuadro MONTICULO_ARENA_4 = new Cuadro(Sprite.MONTICULO_ARENA_4);
    public static final Cuadro MONTICULO_ARENA_5 = new Cuadro(Sprite.MONTICULO_ARENA_5);
    public static final Cuadro MONTICULO_ARENA_6 = new Cuadro(Sprite.MONTICULO_ARENA_6);
    public static final Cuadro MONTICULO_ARENA_7 = new Cuadro(Sprite.MONTICULO_ARENA_7);
    public static final Cuadro MONTICULO_ARENA_8 = new Cuadro(Sprite.MONTICULO_ARENA_8);
    public static final Cuadro MONTICULO_ARENA_9 = new Cuadro(Sprite.MONTICULO_ARENA_9);
    public static final Cuadro MONTICULO_ARENA_10 = new Cuadro(Sprite.MONTICULO_ARENA_10);
    public static final Cuadro MONTICULO_ARENA_11 = new Cuadro(Sprite.MONTICULO_ARENA_11);
    public static final Cuadro MONTICULO_ARENA_12 = new Cuadro(Sprite.MONTICULO_ARENA_12);
    public static final Cuadro MONTICULO_ARENA_13 = new Cuadro(Sprite.MONTICULO_ARENA_13);
    public static final Cuadro MONTICULO_ARENA_AGUA_1 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_1);
    public static final Cuadro MONTICULO_ARENA_AGUA_2 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_2);
    public static final Cuadro MONTICULO_ARENA_AGUA_3 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_3);
    public static final Cuadro MONTICULO_ARENA_AGUA_4 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_4);
    public static final Cuadro MONTICULO_ARENA_AGUA_5 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_5);
    public static final Cuadro MONTICULO_ARENA_AGUA_6 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_6);
    public static final Cuadro MONTICULO_ARENA_AGUA_7 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_7);
    public static final Cuadro MONTICULO_ARENA_AGUA_8 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_8);
    public static final Cuadro MONTICULO_ARENA_AGUA_9 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_9);
    public static final Cuadro MONTICULO_ARENA_AGUA_10 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_10);
    public static final Cuadro MONTICULO_ARENA_AGUA_11 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_11);
    public static final Cuadro MONTICULO_ARENA_AGUA_12 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_12);
    public static final Cuadro MONTICULO_ARENA_AGUA_13 = new Cuadro(Sprite.MONTICULO_ARENA_AGUA_13);
    
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
