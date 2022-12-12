package Graphics;

import java.awt.*;
import javax.swing.*;
import bodega.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * Subclase de JPanel encargada de pintar la lista de pedido en la vista de
 * compra
 */
public class PaintToolVistaCompra extends JPanel{
    private VistaCompra vista;
    private BufferedImage imagen;
    
    /**
     * Constructor de PaintToolVistaCompra
     * @param vista_aux Vista asociada
     */
    public PaintToolVistaCompra(VistaCompra vista_aux){
        vista = vista_aux;
        try {
            imagen = ImageIO.read(getClass().getResourceAsStream("/res/checkWhite.png"));
        } catch (IOException ex) {
            Logger.getLogger(PaintToolVistaCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Método para pintar
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.white);
        g.fillRect(870, 60, 300, 380);
        
        g.setColor(Color.black);
        Font letraGrande = new Font("SansSerif.", 1, 16);
        g.setFont(letraGrande);
        g.drawString("Pedido Actual", 960, 100);
        
        Font letraMediana = new Font("SansSerif.", 1, 12);
        g.setFont(letraMediana);
        int posY = 140;
        int saltoLinea = 30;

        if(vista.getListaActual() != null){
            if(vista.getListaActual().getManzana().getCantidad() != 0){
                if(vista.getAerea().carrito.getFlag() > 1){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Manzana: " + 
                        vista.getListaActual().getManzana().getCantidadConUnidad(),
                        900, posY);

                posY += saltoLinea;
            }
            if(vista.getListaActual().getNaranja().getCantidad() != 0){   
                if(vista.getAerea().carrito.getFlag() > 3){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Naranja: " + 
                        vista.getListaActual().getNaranja().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getPlatano().getCantidad() != 0){
                if(vista.getAerea().carrito.getFlag() > 4){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Platano: " + 
                        vista.getListaActual().getPlatano().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getLechuga().getCantidad() != 0){
                if(vista.getAerea().carrito.getFlag() > 5){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Lechuga: " + 
                        vista.getListaActual().getLechuga().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getTomate().getCantidad() != 0){
                if(vista.getAerea().carrito.getFlag() > 6){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Tomate: " + 
                        vista.getListaActual().getTomate().getCantidadConUnidad(), 
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getPepino().getCantidad() != 0){
                if(vista.getAerea().carrito.getFlag() > 7){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Pepino: " + 
                        vista.getListaActual().getPepino().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if (vista.getListaActual().getPollo().getCantidad() != 0) {
                if(vista.getAerea().carrito.getFlag() > 10){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Pollo: " + 
                        vista.getListaActual().getPollo().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if (vista.getListaActual().getHamburguesa().getCantidad() != 0) {
                if(vista.getAerea().carrito.getFlag() > 10){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Hamburguesa: " + 
                        vista.getListaActual().getHamburguesa().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if (vista.getListaActual().getChurrasco().getCantidad() != 0) {
                if(vista.getAerea().carrito.getFlag() > 10){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.drawString("Churrasco: " + 
                        vista.getListaActual().getChurrasco().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
        }
    }     
}
