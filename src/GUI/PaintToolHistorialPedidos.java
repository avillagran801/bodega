package GUI;

import java.awt.*;
import javax.swing.*;
import bodega.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class PaintToolHistorialPedidos extends JPanel{
    private HistorialPedidos historial;
    private BufferedImage imagen;

    public PaintToolHistorialPedidos(HistorialPedidos hist_aux){
        historial = hist_aux;
        this.setBackground(new Color(54, 73, 88));
        this.setPreferredSize(new Dimension(historial.getWidth(), 
                historial.getHeight()-120));
        try {
            imagen = ImageIO.read(getClass().getResourceAsStream("/res/timeWhite.png"));
        } catch (IOException ex) {
            Logger.getLogger(PaintToolHistorialPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.white);
        Font letraGrande = new Font("SansSerif.", 1, 20);
        Font letraMediana = new Font("SansSerif.", 1, 14);
        Font letraPequena = new Font("SansSerif.", 1, 12);
        int posY = 60;
        int saltoLinea = 30;
        
        if(!historial.getPedidos().isEmpty()){

            for(int i=0; i<historial.getPedidos().size(); ++i){
                ListaPedido lista = (ListaPedido)historial.getPedidos().get(i);
                
                g.setFont(letraGrande);    
                g.drawString("Pedido Número " + (i+1), 60, posY);
                posY += 23;
                
                g.setFont(letraPequena);
                g.drawImage(imagen, 60, posY-15, 20, 20, null);
                g.drawString("" + lista.getFecha().getTime(), 90, posY);
                posY += 40;
                
                g.setFont(letraMediana);

                if(lista.getManzana().getCantidad() != 0){
                    g.drawString("• Manzana: " + 
                            lista.getManzana().getCantidadConUnidad(), 75, posY);
                    posY += saltoLinea;
                }
                if(lista.getNaranja().getCantidad() != 0){                    
                    g.drawString("• Naranja: " + 
                            lista.getNaranja().getCantidadConUnidad(), 75, posY);
                    posY += saltoLinea;
                }
                if(lista.getPlatano().getCantidad() != 0){
                    g.drawString("• Platano: " + 
                            lista.getPlatano().getCantidadConUnidad(), 75, posY);
                    posY += saltoLinea;
                }
                if(lista.getLechuga().getCantidad() != 0){
                    g.drawString("• Lechuga: " + 
                            lista.getLechuga().getCantidadConUnidad(), 75, posY);
                    posY += saltoLinea;
                }
                if(lista.getTomate().getCantidad() != 0){
                    g.drawString("• Tomate: " + 
                            lista.getTomate().getCantidadConUnidad(), 75, posY);
                    posY += saltoLinea;
                }
                if(lista.getPepino().getCantidad() != 0){
                    g.drawString("• Pepino: " + 
                            lista.getPepino().getCantidadConUnidad(), 75, posY);
                    posY += saltoLinea;
                }
                if (lista.getPollo().getCantidad() != 0) {  
                    g.drawString("• Pollo: " + 
                            lista.getPollo().getCantidadConUnidad(), 75, posY);
                    posY += saltoLinea;
                }
                if (lista.getHamburguesa().getCantidad() != 0) {
                    g.drawString("• Hamburguesa: " + 
                            lista.getHamburguesa().getCantidadConUnidad(), 75, 
                            posY);
                    posY += saltoLinea;
                }
                if (lista.getChurrasco().getCantidad() != 0) {
                    g.drawString("• Churrasco: " + 
                            lista.getChurrasco().getCantidadConUnidad(), 75, posY);
                    posY += saltoLinea;
                }
                
                posY += 40;
            }
            if (posY > historial.getHeight()){
                this.setPreferredSize(new Dimension(historial.getWidth(), posY));
            }
        }

    }
}