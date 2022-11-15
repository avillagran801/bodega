package bodega;

import java.awt.*;
import javax.swing.*;

public class BotonesPedido{
    private BasePedidos base;
    
    public BotonesPedido(BasePedidos b_aux){
        base = b_aux;
        selectorCategoria();
        finPedido();
        cantidadProducto();
    }
    
    private void selectorCategoria(){       
        JButton verduras = new JButton("Verduras");
        verduras.setBounds(20, 100, 130, 60);
        verduras.setBorderPainted(false);
        verduras.setContentAreaFilled(false);
        verduras.setForeground(Color.white);        
        verduras.setFont(new Font("SansSerif.", 1, 16));

        verduras.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base.setCategoria(0);
                base.repaint();
            }
        });
        
        JButton frutas = new JButton("Frutas");
        frutas.setBounds(20, 180, 130, 60);
        frutas.setBorderPainted(false);
        frutas.setContentAreaFilled(false);
        frutas.setForeground(Color.white);
        frutas.setFont(new Font("SansSerif.", 1, 16));
        
        frutas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base.setCategoria(1);
                base.repaint();
            }
        });
        
        JButton carnes = new JButton("Carnes");
        carnes.setBounds(20, 260, 130, 60);
        carnes.setBorderPainted(false);
        carnes.setContentAreaFilled(false);
        carnes.setForeground(Color.white);
        carnes.setFont(new Font("SansSerif.", 1, 16));        
        
        carnes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base.setCategoria(2);
                base.repaint();
            }
        });
        
        base.add(verduras);
        base.add(frutas);
        base.add(carnes);
    }
    
    private void finPedido(){
        JButton finPedido = new JButton("Finalizar Pedido");
        finPedido.setBounds(975, 700, 200, 40);
        finPedido.setBorderPainted(true);
        // Agregar un color que destaque
        finPedido.setContentAreaFilled(false);
        finPedido.setForeground(Color.white);
        finPedido.setFont(new Font("SansSerif.", 1, 16));
        
        finPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Pedido finalizado");
            }
        });

        base.add(finPedido);
    }
    
    private void cantidadProducto(){
        JButton mas0 = new JButton();
        mas0.setBounds(850, 100, 25, 25);
        mas0.setBorderPainted(true);
        mas0.setBackground(Color.black);
        
        mas0.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumarProducto(0);
                base.repaint();
            }
        });
        
        JButton menos0 = new JButton();
        menos0.setBounds(750, 100, 25, 25);
        menos0.setBorderPainted(true);
        menos0.setBackground(Color.red);
        
        menos0.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restarProducto(0);
                base.repaint();
            }
        });
        
        JButton mas1 = new JButton();
        mas1.setBounds(850, 200, 25, 25);
        mas1.setBorderPainted(true);
        mas1.setBackground(Color.black);
        
        mas1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumarProducto(1);
                base.repaint();
            }
        });
        
        JButton menos1 = new JButton();
        menos1.setBounds(750, 200, 25, 25);
        menos1.setBorderPainted(true);
        menos1.setBackground(Color.red);
        
        menos1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restarProducto(1);
                base.repaint();
            }
        });
        
        JButton mas2 = new JButton();
        mas2.setBounds(850, 300, 25, 25);
        mas2.setBorderPainted(true);
        mas2.setBackground(Color.black);
        
        mas2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumarProducto(2);
                base.repaint();
            }
        });

        JButton menos2 = new JButton();
        menos2.setBounds(750, 300, 25, 25);
        menos2.setBorderPainted(true);
        menos2.setBackground(Color.red);
        
        menos2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restarProducto(2);
                base.repaint();
            }
        });

        base.add(mas0);
        base.add(menos0);
        base.add(mas1);
        base.add(menos1);
        base.add(mas2);
        base.add(menos2);
    }
    
    private void sumarProducto(int numBoton){
        switch(base.getCategoria()){
            case 0:
                base.getResumenPedido().sumarFrutas(numBoton);
                break;
            case 1:
                base.getResumenPedido().sumarVerduras(numBoton);
                break;
            case 2:
                base.getResumenPedido().sumarCarnes(numBoton);
                break;
        }     
    }
    
    private void restarProducto(int numBoton) {
        switch (base.getCategoria()) {
            case 0:
                base.getResumenPedido().restarFrutas(numBoton);
                break;
            case 1:
                base.getResumenPedido().restarVerduras(numBoton);
                break;
            case 2:
                base.getResumenPedido().restarCarnes(numBoton);
                break;
        }
    }
}
