package Graphics;

import java.awt.*;
import javax.swing.*;
import bodega.*;

/**
 * Subclase de JPanel encargada de pintar la base de los pedidos
 */
public class PaintToolBasePedidos extends JPanel{
    private BasePedidos base;
    private ListaPedido lista;
    
    /**
     * Recibe la base a usar junto a un Graphics
     * @param base_aux Base a usar
     * @param g 
     */
    public void paint(BasePedidos base_aux, Graphics g){
        base = base_aux;
        lista = base_aux.getListaPedido();
        this.paintComponent(g);
    }

    /**
     * Pinta la interfaz junto a la información asociada a cada ítem
     * @param g 
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Color base azul claro
        Color azulClaro = new Color(85, 130, 139);
        g.setColor(azulClaro);
        g.fillRect(150, 0, 800, base.getHeight());
        repaint();
        
        // Paneles azul oscuro en los costados
        Color azulOscuro = new Color(54, 73, 88);
        g.setColor(azulOscuro);
        g.fillRect(0, 0, 150, base.getHeight());
        g.fillRect(base.getWidth()-250, 0, 250, base.getHeight());
      
        // Ítems y su cantidad
        Font letraMediana = new Font("SansSerif.", 1, 16);        
        
        switch(base.getCategoria()){
            case 0:
                // Rectángulo que destaca categoría
                g.setColor(azulClaro);
                g.fillRect(0, 100, 150, 60);
                
                // Pinta imágenes de los ítems y la cantidad de cada uno                
                lista.getManzana().paintComponent(g, 100, 140);
                lista.getNaranja().paintComponent(g, 300, 340);
                lista.getPlatano().paintComponent(g, 500, 540);
                break;
            case 1:
                g.setColor(azulClaro);
                g.fillRect(0, 180, 150, 60);
                
                lista.getLechuga().paintComponent(g, 100, 140);
                lista.getTomate().paintComponent(g, 300, 340);
                lista.getPepino().paintComponent(g, 500, 540);
                break;
            case 2:
                g.setColor(azulClaro);
                g.fillRect(0, 260, 150, 60);
                
                lista.getPollo().paintComponent(g, 100, 140);
                lista.getHamburguesa().paintComponent(g, 300, 340);
                lista.getChurrasco().paintComponent(g, 500, 540);
                break;
        }
        
        g.setColor(Color.white);
        g.setFont(letraMediana);
        g.drawString("Resumen Pedido", 1000, 100);
        resumenPedido(g);

    }
    
    /**
     * Pinta un resumen del pedido que se está realizando
     * @param g 
     */
    private void resumenPedido(Graphics g){
        int posY = 110;
        int saltoLinea = 30;
        g.setColor(Color.white);
        Font letraMediana = new Font("SansSerif.", 1, 12);
        g.setFont(letraMediana);
        
        if(lista.getManzana().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Manzana: " + lista.getManzana().getCantidadConUnidad(), 980, posY);
        }
        if(lista.getNaranja().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Naranja: " + lista.getNaranja().getCantidadConUnidad(), 980, posY);
        }
        if(lista.getPlatano().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Platano: " + lista.getPlatano().getCantidadConUnidad(), 980, posY);
        }
        if(lista.getLechuga().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Lechuga: " + lista.getLechuga().getCantidadConUnidad(), 980, posY);
        }
        if(lista.getTomate().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Tomate: " + lista.getTomate().getCantidadConUnidad(), 980, posY);
        }
        if(lista.getPepino().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Pepino: " + lista.getPepino().getCantidadConUnidad(), 980, posY);
        }
        if (lista.getPollo().getCantidad() != 0) {
            posY = posY + saltoLinea;
            g.drawString("Pollo: " + lista.getPollo().getCantidadConUnidad(), 980, posY);
        }
        if (lista.getHamburguesa().getCantidad() != 0) {
            posY = posY + saltoLinea;
            g.drawString("Hamburguesa: " + lista.getHamburguesa().getCantidadConUnidad(), 980, posY);
        }
        if (lista.getChurrasco().getCantidad() != 0) {
            posY = posY + saltoLinea;
            g.drawString("Churrasco: " + lista.getChurrasco().getCantidadConUnidad(), 980, posY);
        }
    }
}