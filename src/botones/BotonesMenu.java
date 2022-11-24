package botones;

import java.awt.*;
import javax.swing.*;
import bodega.*;
import java.io.IOException;

public class BotonesMenu {
    public BotonesMenu(MenuPrincipal menu){
        JButton inicio = new JButton("Iniciar Nuevo Pedido");
        inicio.setBounds((menu.getWidth()/2)-150, (menu.getHeight()/2)-100, 300, 70);
        inicio.setBorderPainted(false);
        //inicio.setContentAreaFilled(false);
        inicio.setBackground(Color.white);
        inicio.setForeground(Color.black);        
        inicio.setFont(new Font("SansSerif.", 1, 16));
        
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.getWindow().setComponentZOrder(menu, 1);
                menu.getWindow().setComponentZOrder(menu.getWindow().getBase(), 0);
                menu.getWindow().setComponentZOrder(menu.getWindow().getVista(), 2);
                menu.getWindow().setComponentZOrder(menu.getWindow().getHistorial(), 3);
                
                menu.getWindow().getMenu().setVisible(false);
                menu.getWindow().getBase().setVisible(true);
                menu.getWindow().getVista().setVisible(false);
                menu.getWindow().getHistorial().setVisible(false);
                                
                try {
                    menu.getWindow().getBase().nuevaListaPedido();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(BotonesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
                menu.repaint();
            }
        });
        
        JButton historial = new JButton("Historial Pedidos");
        historial.setBounds((menu.getWidth()/2)-100, (menu.getHeight()/2), 200, 70);
        historial.setBorderPainted(false);
        historial.setBackground(Color.white);
        historial.setForeground(Color.black);        
        historial.setFont(new Font("SansSerif.", 1, 16));
        
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.getWindow().setComponentZOrder(menu.getWindow().getMenu(), 3);
                menu.getWindow().setComponentZOrder(menu.getWindow().getBase(), 2);
                menu.getWindow().setComponentZOrder(menu.getWindow().getVista(), 1);
                menu.getWindow().setComponentZOrder(menu.getWindow().getHistorial(), 0);
                
                menu.getWindow().getMenu().setVisible(false);
                menu.getWindow().getBase().setVisible(false);
                menu.getWindow().getVista().setVisible(false);
                menu.getWindow().getHistorial().setVisible(true);
            }
        });
        
        menu.add(inicio);
        menu.add(historial);
    }
}
