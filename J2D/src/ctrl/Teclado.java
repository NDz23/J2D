package ctrl;

/**
 *
 * @author diazn
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener {

    private final static int numeroTeclas = 200;
    private final boolean[] teclas = new boolean[numeroTeclas];
    //WASD
    public boolean arriba;
    public boolean abajo;
    public boolean izquierda;
    public boolean derecha;
    //FLECHAS
    public boolean flechaArriba;
    public boolean flechaAbajo;
    public boolean flechaIzquierda;
    public boolean flechaDerecha;
    //Otras
    public boolean espacio;
    public boolean letraE;
    public boolean letraQ;
    public boolean letraX;
    public boolean letraZ;
    public boolean letraC;
    
    public void actualizar() {
        //WASD
        arriba = teclas[KeyEvent.VK_W];
        abajo = teclas[KeyEvent.VK_S];
        izquierda = teclas[KeyEvent.VK_A];
        derecha = teclas[KeyEvent.VK_D];
        //FLECHAS
        flechaArriba = teclas[KeyEvent.VK_UP];
        flechaAbajo = teclas[KeyEvent.VK_DOWN];
        flechaIzquierda = teclas[KeyEvent.VK_LEFT];
        flechaDerecha = teclas[KeyEvent.VK_RIGHT];
        //Otras
        espacio = teclas[KeyEvent.VK_SPACE];
        letraE = teclas[KeyEvent.VK_E];
        letraQ = teclas[KeyEvent.VK_Q];
        letraX = teclas[KeyEvent.VK_X];
        letraZ = teclas[KeyEvent.VK_Z];
        letraC = teclas[KeyEvent.VK_C];
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        teclas[e.getKeyCode()] = false;
    }

}
