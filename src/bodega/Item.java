package bodega;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Item extends JPanel{
	private int cantidad;
        private String nombre;
        private String descripcion;
        private BufferedImage imagen;
	
	public Item(String nombre_aux, String descripcion_aux, String ubicacion) throws IOException{
            cantidad = 0;
            nombre = nombre_aux;
            descripcion = descripcion_aux;
            imagen = ImageIO.read(getClass().getResourceAsStream(ubicacion));
	}
        
        public void paintComponent(Graphics g, int imagenY, int textoY) {
            super.paintComponent(g);
            g.drawImage(imagen, 200, imagenY, 120, 120, null);
            
            g.setColor(Color.white);
            Font letraMediana = new Font("SansSerif.", 1, 18);
            Font letraPequena = new Font("SansSerif.", 3, 12);
            Font letraDescripcion = new Font("SansSerif.", 3, 14);

            g.setFont(letraMediana);
            g.drawString(nombre, 360, textoY);

            g.setFont(letraPequena);
            g.drawString(""+ cantidad, 810, textoY+18);
            
            g.setFont(letraDescripcion);
            g.drawString(descripcion, 360, textoY+20);
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