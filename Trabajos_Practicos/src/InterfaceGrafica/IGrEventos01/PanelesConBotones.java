package InterfaceGrafica.IGrEventos01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelesConBotones extends JPanel implements ActionListener{ //implementar

    JButton botonAzul = new JButton("AZUL");

    public PanelesConBotones () {

        add(botonAzul);

        botonAzul.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) { //metodo de la interface ActionListener

        setBackground(Color.BLUE);
    }

}
