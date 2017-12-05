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
    private HojaSprites hoja;

    //Inicio coleccion de sprites
    //public static Sprite SPRITE = new Sprite(tamañoSprite, columna, fila, HojaSprites.nombreHoja); para texturas
    //public static final Sprite SPRITE = new Sprite(tamañoSprite, numColor);
    public static final Sprite VACIO = new Sprite(32, 0);
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
    public Sprite(final int lado, final int color){
        this.lado = lado;
        pixeles = new int[lado * lado];
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = color;
        }
    }

    public int getLado() {
        return lado;
    }

}
