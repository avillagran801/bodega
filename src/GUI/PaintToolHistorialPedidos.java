package GUI;

import java.awt.*;
import javax.swing.*;
import bodega.*;
import java.util.ArrayList;

public class PaintToolHistorialPedidos extends JPanel{
    private HistorialPedidos historial;

    public PaintToolHistorialPedidos(HistorialPedidos hist_aux){
        historial = hist_aux;
        this.setBackground(new Color(54, 73, 88));
        this.setPreferredSize(new Dimension(historial.getWidth(), 
                historial.getHeight()-120));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.white);
        Font letraGrande = new Font("SansSerif.", 1, 16);
        int posY = 100;
        int saltoLinea = 30;
        
        if(!historial.getPedidos().isEmpty()){

            for(int i=0; i<historial.getPedidos().size(); ++i){
                ListaPedido lista = (ListaPedido)historial.getPedidos().get(i);
                
                g.setFont(letraGrande);    
                g.drawString("Pedido número: " + (i+1), 100, posY);
                posY += 40;

                if(lista.getManzana().getCantidad() != 0){
                    g.drawString("Manzana: " + 
                            lista.getManzana().getCantidadConUnidad(), 130, posY);
                    posY += saltoLinea;
                }
                if(lista.getNaranja().getCantidad() != 0){                    
                    g.drawString("Naranja: " + 
                            lista.getNaranja().getCantidadConUnidad(), 130, posY);
                    posY += saltoLinea;
                }
                if(lista.getPlatano().getCantidad() != 0){
                    g.drawString("Platano: " + 
                            lista.getPlatano().getCantidadConUnidad(), 130, posY);
                    posY += saltoLinea;
                }
                if(lista.getLechuga().getCantidad() != 0){
                    g.drawString("Lechuga: " + 
                            lista.getLechuga().getCantidadConUnidad(), 130, posY);
                    posY += saltoLinea;
                }
                if(lista.getTomate().getCantidad() != 0){
                    g.drawString("Tomate: " + 
                            lista.getTomate().getCantidadConUnidad(), 130, posY);
                    posY += saltoLinea;
                }
                if(lista.getPepino().getCantidad() != 0){
                    g.drawString("Pepino: " + 
                            lista.getPepino().getCantidadConUnidad(), 130, posY);
                    posY += saltoLinea;
                }
                if (lista.getPollo().getCantidad() != 0) {  
                    g.drawString("Pollo: " + 
                            lista.getPollo().getCantidadConUnidad(), 130, posY);
                    posY += saltoLinea;
                }
                if (lista.getHamburguesa().getCantidad() != 0) {
                    g.drawString("Hamburguesa: " + 
                            lista.getHamburguesa().getCantidadConUnidad(), 130, 
                            posY);
                    posY += saltoLinea;
                }
                if (lista.getChurrasco().getCantidad() != 0) {
                    g.drawString("Churrasco: " + 
                            lista.getChurrasco().getCantidadConUnidad(), 130, posY);
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