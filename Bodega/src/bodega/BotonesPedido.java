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
                base.seleccionarCategoria(0);
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
                base.seleccionarCategoria(1);
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
                base.seleccionarCategoria(2);
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
        JButton mas = new JButton();
        mas.setBounds(850, 100, 25, 25);
        mas.setBorderPainted(true);
        mas.setBackground(Color.black);
        
        JButton menos = new JButton();
        menos.setBounds(750, 100, 25, 25);
        menos.setBorderPainted(true);
        menos.setBackground(Color.red);

        base.add(mas);
        base.add(menos);
    }
}
