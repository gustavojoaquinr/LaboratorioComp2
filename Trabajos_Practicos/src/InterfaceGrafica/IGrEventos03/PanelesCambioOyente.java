package InterfaceGrafica.IGrEventos03;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelesCambioOyente extends JPanel { //Es el ollente

    JButton botonNegro = new JButton("NEGRO");
    JButton botonRojo = new JButton("ROJO");
    JButton botonVerde = new JButton("VERDE");

    public PanelesCambioOyente () {

        add(botonNegro);
        add(botonRojo);
        add(botonVerde);

        ColorDeFondo Negro = new ColorDeFondo(Color.BLACK);
        botonNegro.addActionListener(Negro);

        ColorDeFondo rojo = new ColorDeFondo(Color.RED);
        botonRojo.addActionListener(rojo);

        ColorDeFondo verde = new ColorDeFondo(Color.GREEN);
        botonVerde.addActionListener(verde);

    }

    //CLASE INTERNA
    private class ColorDeFondo  implements ActionListener{

        private Color colorDeFondo;

        public ColorDeFondo(Color c) {
            // TODO Auto-generated constructor stub
            this.colorDeFondo = c;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            //ESTE EVENTO ES QUIEN EJECUTA LAS ACCIONES
            setBackground(colorDeFondo);
        }

    }

}