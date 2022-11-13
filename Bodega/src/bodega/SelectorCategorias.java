package bodega;

import javax.swing.*;
import java.awt.*;

public class SelectorCategorias extends JPanel{
    private int borde = 20;
    private Color azulOscuro = new Color(54, 73, 88);
    private Color azulClaro = new Color(85, 130, 139);
    private int categoria;
    
    
    public SelectorCategorias(int anchoVentana, int largoVentana){
        this.setLayout(null);               
        // this.setBackground(azulOscuro);
        this.setBounds(0, 0, 150, largoVentana);
        
        categoria = 0;
        
        botones();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(azulOscuro);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        switch(categoria){
            case 0:
                g.setColor(azulClaro);
                g.fillRect(0, 100, this.getWidth(), 60);
                break;
            case 1:
                g.setColor(azulClaro);
                g.fillRect(0, 180, this.getWidth(), 60);
                break;
            case 2:
                g.setColor(azulClaro);
                g.fillRect(0, 260, this.getWidth(), 60);
                break;
        }
    }
    
    private void botones(){
        JButton verduras = new JButton("Verduras");
        verduras.setBounds(this.getX()+borde, 100, this.getWidth()-borde, 60);
        verduras.setBorderPainted(false);
        verduras.setContentAreaFilled(false);
        verduras.setForeground(Color.white);        
        verduras.setFont(new Font("SansSerif.", 1, 16));

        verduras.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoria = 0;
                repaint();
            }
        });
        
        JButton frutas = new JButton("Frutas");
        frutas.setBounds(this.getX()+borde, 180, this.getWidth()-borde, 60);
        frutas.setBorderPainted(false);
        frutas.setContentAreaFilled(false);
        frutas.setForeground(Color.white);
        frutas.setFont(new Font("SansSerif.", 1, 16));
        
        frutas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoria = 1;
                repaint();
            }
        });
        
        JButton carnes = new JButton("Carnes");
        carnes.setBounds(this.getX() + borde, 260, this.getWidth() - borde, 60);
        carnes.setBorderPainted(false);
        carnes.setContentAreaFilled(false);
        carnes.setForeground(Color.white);
        carnes.setFont(new Font("SansSerif.", 1, 16));        
        
        carnes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoria = 2;
                repaint();
            }
        });
        
        this.add(verduras);
        this.add(frutas);
        this.add(carnes);
    }

}
