package bodega;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Item extends JPanel{
	private int cantidad;
        private String nombre;
        private BufferedImage imagen;
	
	public Item(String nombre_aux) throws IOException{
            cantidad = 0;
            nombre = nombre_aux;
            //imagen = ImageIO.read(getClass().getResource("manzana.jpg"));
            imagen = ImageIO.read(getClass().getResourceAsStream("/res/manzana.png"));
	}
        
        public void paintComponent(Graphics g, int imagenX, int imagenY, int posY) {
            super.paintComponent(g);
            g.drawImage(imagen, imagenX, imagenY, 100, 100, null);
            
            g.setColor(Color.white);
            Font letraMediana = new Font("SansSerif.", 1, 16);
            g.setFont(letraMediana);
            g.drawString(nombre, 250, posY);
            
            Font letraPequena = new Font("SansSerif.", 1, 12);
            g.setFont(letraPequena);
            g.drawString(""+ cantidad, 810, posY);
        }
	
	public void sumarCantidad(){
            cantidad++;
	}
	
	public void restarCantidad(){
            if(cantidad > 0){
                    cantidad--;
            }
	}
	
	public int getCantidad(){
            return cantidad;
	}
}