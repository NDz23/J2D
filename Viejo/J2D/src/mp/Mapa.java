package mp;

/**
 *
 * @author diazn
 */
import grfcs.Pantalla;
import mp.cdro.Cuadro;

public abstract class Mapa {

    protected int ancho;
    protected int alto;

    protected int[] cuadros;

    public Mapa(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;

        cuadros = new int[ancho * alto];

        generarMapa();
    }

    public Mapa(String ruta) {
        cargarMapa(ruta);
    }

    protected void generarMapa() {
    }

    private void cargarMapa(String ruta) {

    }

    public void actualizar() {

    }

    public void mostrar(int compensacionX, int compensacionY, Pantalla pantalla) {
        pantalla.setDiferenciaXY(compensacionX, compensacionY);
        
        int oeste = compensacionX >> 5; // x>>5 equilade a x/32
        int este = (compensacionX + pantalla.getAncho() + Cuadro.LADO) >> 5;
        int norte = compensacionY >> 5;
        int sur = (compensacionY + pantalla.getAlto() + Cuadro.LADO) >> 5;

        for (int y = norte; y < sur; y++) {
            for (int x = oeste; x < este; x++) {
                getCuadro(x, y).mostrar(x, y, pantalla);
            }
        }
    }
    
    public Cuadro getCuadro(final int x, final int y){
        if (x < 0 || y < 0 || x >= ancho || y >= alto) {
            return Cuadro.VACIO;
        }
        switch(cuadros[x + y * ancho]){
            case 0:
                return Cuadro.ARENA_1;
            case 1:
                return Cuadro.ARENA_2;
            case 2:
                return Cuadro.ARENA_3;
            case 3:
                return Cuadro.AGUA_1;
            case 4:
                return Cuadro.AGUA_2;   
            case 5:
                return Cuadro.AGUA_3;
            case 6:
                return Cuadro.MONTICULO_ARENA_1;
            case 7:
                return Cuadro.MONTICULO_ARENA_2;
            case 8:
                return Cuadro.MONTICULO_ARENA_3;
            case 9:
                return Cuadro.MONTICULO_ARENA_4;
            case 10:
                return Cuadro.MONTICULO_ARENA_5;
            case 11:
                return Cuadro.MONTICULO_ARENA_6;
            case 12:
                return Cuadro.MONTICULO_ARENA_7;
            case 13:
                return Cuadro.MONTICULO_ARENA_8;
            case 14:
                return Cuadro.MONTICULO_ARENA_9;
            case 15:
                return Cuadro.MONTICULO_ARENA_10;
            case 16:
                return Cuadro.MONTICULO_ARENA_11;
            case 17:
                return Cuadro.MONTICULO_ARENA_12;
            case 18:
                return Cuadro.MONTICULO_ARENA_13;
            case 19:
                return Cuadro.MONTICULO_ARENA_AGUA_1;
            case 20:
                return Cuadro.MONTICULO_ARENA_AGUA_2;
            case 21:
                return Cuadro.MONTICULO_ARENA_AGUA_3;
            case 22:
                return Cuadro.MONTICULO_ARENA_AGUA_4;
            case 23:
                return Cuadro.MONTICULO_ARENA_AGUA_5;
            case 24:
                return Cuadro.MONTICULO_ARENA_AGUA_6;
            case 25:
                return Cuadro.MONTICULO_ARENA_AGUA_7;
            case 26:
                return Cuadro.MONTICULO_ARENA_AGUA_8;
            case 27:
                return Cuadro.MONTICULO_ARENA_AGUA_9;
            case 28:
                return Cuadro.MONTICULO_ARENA_AGUA_10;
            case 29:
                return Cuadro.MONTICULO_ARENA_AGUA_11;
            case 30:
                return Cuadro.MONTICULO_ARENA_AGUA_12;
            case 31:
                return Cuadro.MONTICULO_ARENA_AGUA_13;
            default:
                return Cuadro.VACIO;
        }
    }
    
}
