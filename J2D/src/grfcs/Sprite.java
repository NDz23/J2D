package grfcs;

/**
 *
 * @author diazn
 */

public final class Sprite {

    private final int lado;
    private int x;
    private int y;
    public int[] pixeles;
    private final HojaSprites hoja;
    
    //Inicio coleccion de sprites
    //public static Sprite asfalto = new Sprite(tamañoSprite, columna, fila, HojaSprites.nombreHoja);
    public static final Sprite ASFALTO = new Sprite(32, 0, 0, HojaSprites.desierto);
    //Fin coleccion de sprites

    public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja) {
        this.lado = lado;
        pixeles = new int[lado * lado];
        this.x = columna * lado;
        this.y = fila * lado;
        this.hoja = hoja;

        for (int i = 0; i < lado; i++) {//maneja el eje y
            for (int j = 0; j < lado; j++) {//maneja el eje x
                pixeles[i + j * lado] = hoja.pixeles[(j + this.x) + (i + this.y) * hoja.getAncho()];
            }
        }
    }

    public int getLado() {
        return lado;
    }
    
}
