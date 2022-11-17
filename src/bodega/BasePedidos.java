package bodega;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class BasePedidos extends JPanel{
    private int categoria;
    private ListaPedido lista;
    private Ventana window;
    
    public BasePedidos(int anchoVentana, int largoVentana) throws IOException{
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
        BotonesPedido botones = new BotonesPedido(this);
        lista = new ListaPedido(); 
    }
    
    public void setWindow(Ventana window_aux) {
        window = window_aux;
    }
    
    public Ventana getWindow(){
        return window;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Color base azul claro
        Color azulClaro = new Color(85, 130, 139);
        g.setColor(azulClaro);
        g.fillRect(150, 0, 800, this.getHeight());
        
        // Paneles azul oscuro en los costados
        Color azulOscuro = new Color(54, 73, 88);
        g.setColor(azulOscuro);
        g.fillRect(0, 0, 150, this.getHeight());
        g.fillRect(this.getWidth()-250, 0, 250, this.getHeight());
      
        // Ítems y su cantidad
        Font letraMediana = new Font("SansSerif.", 1, 16);        
        
        switch(categoria){
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
    
    public void setCategoria(int sel){
        categoria = sel;
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public ListaPedido getListaPedido(){
        return lista;
    }
    
    private void resumenPedido(Graphics g){
        int posY = 100;
        int saltoLinea = 30;
        g.setColor(Color.white);
        Font letraMediana = new Font("SansSerif.", 1, 14);
        g.setFont(letraMediana);
        
        if(lista.getManzana().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Manzana: " + lista.getManzana().getCantidad(), 980, posY);
        }
        if(lista.getNaranja().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Naranja: " + lista.getNaranja().getCantidad(), 980, posY);
        }
        if(lista.getPlatano().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Platano: " + lista.getPlatano().getCantidad(), 980, posY);
        }
        if(lista.getLechuga().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Lechuga: " + lista.getLechuga().getCantidad(), 980, posY);
        }
        if(lista.getTomate().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Tomate: " + lista.getTomate().getCantidad(), 980, posY);
        }
        if(lista.getPepino().getCantidad() != 0){
            posY = posY + saltoLinea;
            g.drawString("Pepino: " + lista.getPepino().getCantidad(), 980, posY);
        }
        if (lista.getPollo().getCantidad() != 0) {
            posY = posY + saltoLinea;
            g.drawString("Pollo: " + lista.getPollo().getCantidad(), 980, posY);
        }
        if (lista.getHamburguesa().getCantidad() != 0) {
            posY = posY + saltoLinea;
            g.drawString("Hamburguesa: " + lista.getHamburguesa().getCantidad(), 980, posY);
        }
        if (lista.getChurrasco().getCantidad() != 0) {
            posY = posY + saltoLinea;
            g.drawString("Churrasco: " + lista.getChurrasco().getCantidad(), 980, posY);
        }
    }
}