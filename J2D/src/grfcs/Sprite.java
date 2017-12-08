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
    public static final Sprite ARENA_1 = new Sprite(32, 0, 0, HojaSprites.desierto);
    public static final Sprite ARENA_2 = new Sprite(32, 1, 0, HojaSprites.desierto);
    public static final Sprite ARENA_3 = new Sprite(32, 2, 0, HojaSprites.desierto);
    public static final Sprite AGUA_1 = new Sprite(32, 5, 0, HojaSprites.desierto);
    public static final Sprite AGUA_2 = new Sprite(32, 6, 0, HojaSprites.desierto);
    public static final Sprite AGUA_3 = new Sprite(32, 7, 0, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_1 = new Sprite(32, 3, 0, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_2 = new Sprite(32, 4, 0, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_3 = new Sprite(32, 3, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_4 = new Sprite(32, 4, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_5 = new Sprite(32, 0, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_6 = new Sprite(32, 1, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_7 = new Sprite(32, 2, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_8 = new Sprite(32, 0, 2, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_9 = new Sprite(32, 1, 2, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_10 = new Sprite(32, 2, 2, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_11 = new Sprite(32, 0, 3, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_12 = new Sprite(32, 1, 3, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_13 = new Sprite(32, 2, 3, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_1 = new Sprite(32, 8, 0, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_2 = new Sprite(32, 9, 0, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_3 = new Sprite(32, 8, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_4 = new Sprite(32, 9, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_5 = new Sprite(32, 5, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_6 = new Sprite(32, 6, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_7 = new Sprite(32, 7, 1, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_8 = new Sprite(32, 5, 2, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_9 = new Sprite(32, 6, 2, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_10 = new Sprite(32, 7, 2, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_11 = new Sprite(32, 5, 3, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_12 = new Sprite(32, 6, 3, HojaSprites.desierto);
    public static final Sprite MONTICULO_ARENA_AGUA_13 = new Sprite(32, 7, 3, HojaSprites.desierto);
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
