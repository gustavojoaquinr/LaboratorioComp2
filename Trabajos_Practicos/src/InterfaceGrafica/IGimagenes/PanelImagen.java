package InterfaceGrafica.IGimagenes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class PanelImagen extends JPanel{

    private Image imagen;

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        File archivo = new File("src/InterfaceGrafica/IGimagenes/goku.png");

        try {

            imagen = ImageIO.read(archivo);


        } catch (IOException e) {
            e.printStackTrace();
        }

        /*int ancho = imagen.getWidth(this); //Para el gif
        int alto=imagen.getHeight(this);

        g.drawImage(imagen, 20, 20, null);

        for(int i=0; i<500; i++) {
            for(int j=0; j<=400; j++) {
                g.copyArea(0, 0, ancho, alto, ancho*i, alto*j);
            }
        }
         */

        Graphics2D g2 = (Graphics2D)g;

        g2.drawImage(imagen, 20, 20, null);


    }

}