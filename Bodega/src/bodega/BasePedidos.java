package bodega;

import javax.swing.*;
import java.awt.*;

public class BasePedidos extends JPanel{
    private int categoria;
    
    public BasePedidos(int anchoVentana, int largoVentana){
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
        BotonesPedido botones = new BotonesPedido(this);
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Color azulClaro = new Color(85, 130, 139);
        g.setColor(azulClaro);
        g.fillRect(150, 0, 800, this.getHeight());
        
        Color azulOscuro = new Color(54, 73, 88);
        g.setColor(azulOscuro);
        g.fillRect(0, 0, 150, this.getHeight());
        g.fillRect(this.getWidth()-250, 0, 250, this.getHeight());
        
        g.setColor(azulClaro);
        switch(categoria){
            case 0:
                g.setColor(azulClaro);
                g.fillRect(0, 100, 150, 60);
                break;
            case 1:
                g.setColor(azulClaro);
                g.fillRect(0, 180, 150, 60);
                break;
            case 2:
                g.setColor(azulClaro);
                g.fillRect(0, 260, 150, 60);
                break;
        }
    }
    
    public void seleccionarCategoria(int sel){
        categoria = sel;
    }
}