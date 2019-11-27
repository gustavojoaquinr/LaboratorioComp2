package InterfaceGrafica.IG01;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {

        setSize(600, 350);  // indica el tamano de la ventana

         //setBounds(40, 30, 600, 350); //serBounds se coloca tanto el tamano como la posición de la imagen

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // indica que pasará cuando apretemos el boton X

        setTitle("Mi primer Ventana"); //coloca el título a la venta

        // POSICIÓN DE LA VENTANA
        //setLocation(100, 100); //colocamos la ventana donde queramos
        setLocationRelativeTo(null); //si tiene null nos coloca la ventana justo en el centro

        //setResizable(false); //Impide la maximización o la redimensión

        //COLOCAR UN ÍCONO PERSONALIZADO A MI VENTANA
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Image icono = sistema.getImage("gatito.png");
        setIconImage(icono);



        // hace visible el Frame. Siempre colocarlo en último lugar
        setVisible(true);

        PrimerPanel lamina= new PrimerPanel();
        add(lamina);

    }

}