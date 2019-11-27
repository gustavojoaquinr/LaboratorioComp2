package EventoVentana;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MarcoEventoVentana miMarco = new MarcoEventoVentana();

        /*
         * en este caso utilizamos DISPOSE_ON_CLOSE para poder dar
         * tiempo a que aparezcan los eventos de proceso de cierre
         * y de cierre
         */
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //pone en escucha al marco
        miMarco.addWindowListener(new EventosDeVentana());

    }

}