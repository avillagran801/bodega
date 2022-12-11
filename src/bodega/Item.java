package bodega;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import Graphics.*;

/**
 * Clase que guarda información sobre los ítems disponibles para comprar
 * @author ana
 */

public class Item extends JPanel{
	private int cantidad;
        private String nombre;
        private String descripcion;
        private String unidadDeMedida;
        private BufferedImage imagen;
        private PaintToolItem paint;
	
        /**
         * Constructor de Item
         * @param nombre_aux String con nombre del ítem
         * @param descripcion_aux String con descripción del ítem
         * @param unidad_aux String con la unidad de medida del ítem
         * @param ubicacion String con la ubicación de la imagen referencial
         * @throws IOException Excepción en caso de que no encuentre la imagen
         * referencial
         */
	public Item(String nombre_aux, String descripcion_aux, String unidad_aux, String ubicacion)
                throws IOException{
            cantidad = 0;
            nombre = nombre_aux;
            descripcion = descripcion_aux;
            imagen = ImageIO.read(getClass().getResourceAsStream(ubicacion));
            unidadDeMedida = unidad_aux;
            paint = new PaintToolItem(this);
	}
        
        /**
         * Método para pintar el ítem
         * @param g Graphics 
         * @param imagenY Posición en el eje Y de la imagen
         * @param textoY Posición en el eje Y del texto
         */
        public void paintComponent(Graphics g, int imagenY, int textoY) {
            super.paintComponent(g);
            paint.paintComponent(g, imagenY, textoY);
        }
	
        /**
         * Aumenta en 1 la cantidad que se solicita del ítem
         */
	public void sumarCantidad(){
            cantidad++;
	}
        
        /**
         * Entrega la cantidad que se solicita del ítem con su unidad de medida
         * @return String que incluye cantidad solicitada y su unidad de medida
         */
        public String getCantidadConUnidad(){
            return cantidad + " " + unidadDeMedida;
        }
	
        /**
         * Disminuye en 1 la cantidad que se solicita del ítem hasta llegar a 0
         */
	public void restarCantidad(){
            if(cantidad > 0){
                    cantidad--;
            }
	}
	
        /**
         * Entrega la cantidad del ítem
         * @return int con la cantidad solicitada del ítem
         */
	public int getCantidad(){
            return cantidad;
	}
        
        /**
         * Entrega el nombre del ítem
         * @return String con el nombre del ítem
         */
        public String getNombre(){
            return nombre;
        }
        
        /**
         * Entrega la descripción del ítem
         * @return String con la descripción del ítem
         */
        public String getDescripcion(){
            return descripcion;
        }
        
        /**
         * Entrega la imagen asociada al ítem
         * @return BufferedImage asociada al ítem
         */
        public BufferedImage getImagen(){
            return imagen;
        }
}