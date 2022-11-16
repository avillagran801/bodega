package bodega;

import javax.swing.*;
import java.awt.*;

public class BasePedidos extends JPanel{
    private int categoria;
    private ListaPedido lista;
    
    public BasePedidos(int anchoVentana, int largoVentana){
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
        BotonesPedido botones = new BotonesPedido(this);
        lista = new ListaPedido();
        
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
        Font letraPequena = new Font("SansSerif.", 1, 12);
        
        
        switch(categoria){
            case 0:
                // Rectángulo que destaca categoría
                g.setColor(azulClaro);
                g.fillRect(0, 100, 150, 60);
                
                // Ítems y cantidad de cada uno
                g.setColor(Color.white);
                
                g.setFont(letraMediana);
                g.drawString("Manzana", 250, 118);
                g.drawString("Naranja", 250, 218);
                g.drawString("Plátano",250, 318);
                
                g.setFont(letraPequena);
                g.drawString(""+ lista.getManzana().getCantidad(), 810, 118);
                g.drawString(""+ lista.getNaranja().getCantidad(), 810, 218);
                g.drawString(""+ lista.getPlatano().getCantidad(), 810, 318);
                break;
            case 1:
                g.setColor(azulClaro);
                g.fillRect(0, 180, 150, 60);
                
                g.setColor(Color.white);
                
                g.setFont(letraMediana);
                g.drawString("Lechuga", 250, 118);
                g.drawString("Tomate", 250, 218);
                g.drawString("Pepino", 250, 318);
                
                g.setFont(letraPequena);
                g.drawString(""+ lista.getLechuga().getCantidad(), 810, 118);
                g.drawString(""+ lista.getTomate().getCantidad(), 810, 218);
                g.drawString(""+ lista.getPepino().getCantidad(), 810, 318);
                break;
            case 2:
                g.setColor(azulClaro);
                g.fillRect(0, 260, 150, 60);
                
                g.setColor(Color.white);
                
                g.setFont(letraMediana);
                g.drawString("Pollo", 250, 118);
                g.drawString("Hamburguesa", 250, 218);
                g.drawString("Churrasco", 250, 318);
                
                g.setFont(letraPequena);
                g.drawString("" + lista.getPollo().getCantidad(), 810, 118);
                g.drawString("" + lista.getHamburguesa().getCantidad(), 810, 218);
                g.drawString("" + lista.getChurrasco().getCantidad(), 810, 318);
                break;
        }
        
        g.setColor(Color.white);
        g.setFont(letraMediana);
        g.drawString("Resumen Pedido", 1000, 50);
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