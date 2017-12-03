package grfcs;

/**
 *
 * @author diazn
 */

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class HojaSprites {

    private final int ancho;
    private final int alto;
    public final int[] pixeles;
    //Inicio coleccion de hojas de sprites
    //public static HojaSprites nombreHoja = new HojaSprites("/texturas/Sprite.png", anchoSprite, altoSprite);
    public static HojaSprites desierto = new HojaSprites("/texturas/desierto.png", 320, 320);
    //Fin coleccion de hojas de sprites
    public HojaSprites(final String ruta, final int ancho, final int alto) {
        this.ancho = ancho;
        this.alto = alto;
        pixeles = new int[ancho * alto];

        BufferedImage imagen;
        try {
            imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
            imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
        } catch (IOException ex) {
            Logger.getLogger(HojaSprites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

}
