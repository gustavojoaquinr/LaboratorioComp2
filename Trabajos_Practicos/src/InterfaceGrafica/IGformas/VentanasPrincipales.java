package InterfaceGrafica.IGformas;

import javax.swing.JFrame;

class VentanasPrincipales extends JFrame{

    public VentanasPrincipales() {

        setBounds(5,50,800,600);

        add(new Paneles());

        setVisible(true);
    }

}