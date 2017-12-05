package jg;

/**
 *
 * @author diazn
 */
import ctrl.Teclado;
import grfcs.Pantalla;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.awt.image.DataBufferInt;
import javax.swing.ImageIcon;
import mp.Mapa;
import mp.MapaGenerado;

public class Juego extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;
    private static JFrame ventana;
    private static final int ANCHO = 800;
    private static final int ALTO = 450;
    private static final String NOMBRE = "Juego";
    private static String CONTADOR_FPS = "";
    private static String CONTADOR_APS = "";
    private static int aps = 0;
    private static int fps = 0;
    private static int x = 0;
    private static int y = 0;
    private static volatile boolean funcionando = false;
    private static Thread hilo;
    private static Teclado teclado;
    private static Pantalla pantalla;
    private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);
    private static int[] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
    private static final ImageIcon icono = new ImageIcon(Juego.class.getResource("/iconos/j2d-icono.png"));
    private static Mapa mapa;

    private Juego() {
        setPreferredSize(new Dimension(ANCHO, ALTO));

        pantalla = new Pantalla(ANCHO, ALTO);

        mapa = new MapaGenerado(128, 128);

        teclado = new Teclado();
        addKeyListener(teclado);

        ventana = new JFrame(NOMBRE);
        ventana.setIconImage(icono.getImage());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.setUndecorated(true);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciar();
    }

    private synchronized void iniciar() {
        funcionando = true;

        hilo = new Thread(this, "Graficos");
        hilo.start();
    }

    private synchronized void detener() {
        funcionando = false;

        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void actualizar() {
        teclado.actualizar();
        //Inicio controles de movimiento
        if (teclado.arriba || teclado.flechaArriba) {
            y--;
        }
        if (teclado.abajo || teclado.flechaAbajo) {
            y++;
        }
        if (teclado.izquierda || teclado.flechaIzquierda) {
            x--;
        }
        if (teclado.derecha || teclado.flechaDerecha) {
            x++;
        }
        if (teclado.salir && teclado.mayus) {
            System.exit(0);
        }
        //Fin controles de movimiento
        //Inicio otros controles
        if (teclado.espacio) {

        }
        if (teclado.letraQ) {

        }
        if (teclado.letraE) {

        }
        if (teclado.letraZ) {

        }
        if (teclado.letraX) {

        }
        if (teclado.letraC) {

        }
        //Fin otros controles
        aps++;
    }

    private void mostrar() {
        BufferStrategy estrategia = getBufferStrategy();
        if (estrategia == null) {
            createBufferStrategy(3);
            return;
        }
        pantalla.limpiar();
        mapa.mostrar(x, y, pantalla);

        System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);

        Graphics g = estrategia.getDrawGraphics();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
        g.setColor(Color.WHITE);
        g.fillRect((ANCHO / 2) - 16, (ALTO / 2) - 16, 32, 32);
        g.drawString(CONTADOR_APS, 10, 20);
        g.drawString(CONTADOR_FPS, 10, 35);
        g.dispose();

        estrategia.show();

        fps++;
    }

    @Override
    public void run() {
        final int NS_POR_SEGUNDO = 1000000000;
        final byte APS_OBJETIVO = 60;
        final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;

        long referenciaActualizacion = System.nanoTime();
        long referenciaContador = System.nanoTime();

        double tiempoTranscurrido;
        double delta = 0;

        requestFocus();

        while (funcionando) {
            final long inicioBucle = System.nanoTime();
            tiempoTranscurrido = inicioBucle - referenciaActualizacion;
            referenciaActualizacion = inicioBucle;

            delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;

            while (delta >= 1) {
                actualizar();
                delta--;
            }

            mostrar();

            if ((System.nanoTime() - referenciaContador) > NS_POR_SEGUNDO) {
                CONTADOR_APS = "APS: " + aps;
                CONTADOR_FPS = "FPS: " + fps;
                aps = 0;
                fps = 0;
                referenciaContador = System.nanoTime();
            }

        }
    }

}
