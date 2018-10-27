package grfcs;

/**
 *
 * @author diazn
 */

import mp.cdro.Cuadro;

public final class Pantalla {

    private final int ancho;
    private final int alto;
    
    private int diferenciaX;
    private int diferenciaY;

    public final int[] pixeles;



    public Pantalla(final int ancho, final int alto) {
        this.alto = alto;
        this.ancho = ancho;

        pixeles = new int[ancho * alto];
    }

    public void limpiar() {
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = 0;
        }
    }



    public void mostrarCuadro(int compensacionX, int compensacionY, Cuadro cuadro) {
        compensacionX -= diferenciaX;
        compensacionY -= diferenciaY;
        
        for (int y = 0; y < cuadro.sprite.getLado(); y++) {
            int posicionY = y + compensacionY;
            for (int x = 0; x < cuadro.sprite.getLado(); x++) {
                int posicionX = x + compensacionY;
                if (posicionX < -cuadro.sprite.getLado() || posicionX >= ancho || posicionY < 0 || posicionY >= alto) {
                    break;
                }
                if (posicionX < 0) {
                    posicionX = 0;
                }
                pixeles[posicionX + posicionY * ancho] = cuadro.sprite.pixeles[x + y * cuadro.sprite.getLado()];
            }
        }
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setDiferenciaXY(final int diferenciaX,final int diferenciaY) {
        this.diferenciaX = diferenciaX;
        this.diferenciaY = diferenciaY;
    }
    
}
