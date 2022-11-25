package GUI;

import java.awt.*;
import javax.swing.*;
import bodega.*;

public class PaintToolVistaCompra extends JPanel{
    private VistaCompra vista;
    
    public PaintToolVistaCompra(VistaCompra vista_aux){
        vista = vista_aux;
    }
    
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
                g.drawString("Manzana: " + 
                        vista.getListaActual().getManzana().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getNaranja().getCantidad() != 0){                    
                g.drawString("Naranja: " + 
                        vista.getListaActual().getNaranja().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getPlatano().getCantidad() != 0){
                g.drawString("Platano: " + 
                        vista.getListaActual().getPlatano().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getLechuga().getCantidad() != 0){
                g.drawString("Lechuga: " + 
                        vista.getListaActual().getLechuga().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getTomate().getCantidad() != 0){
                g.drawString("Tomate: " + 
                        vista.getListaActual().getTomate().getCantidadConUnidad(), 
                        900, posY);
                posY += saltoLinea;
            }
            if(vista.getListaActual().getPepino().getCantidad() != 0){
                g.drawString("Pepino: " + 
                        vista.getListaActual().getPepino().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if (vista.getListaActual().getPollo().getCantidad() != 0) {  
                g.drawString("Pollo: " + 
                        vista.getListaActual().getPollo().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if (vista.getListaActual().getHamburguesa().getCantidad() != 0) {
                g.drawString("Hamburguesa: " + 
                        vista.getListaActual().getHamburguesa().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
            if (vista.getListaActual().getChurrasco().getCantidad() != 0) {
                g.drawString("Churrasco: " + 
                        vista.getListaActual().getChurrasco().getCantidadConUnidad(),
                        900, posY);
                posY += saltoLinea;
            }
        }
    }     
}
