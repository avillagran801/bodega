package bodega;

import java.awt.*;
import javax.swing.*;

public class VistaCarro extends JPanel{
    
    public VistaCarro(int anchoVentana, int largoVentana){
        this.setLayout(null);
        int edge = 30;
        int size = 150;
        this.setBounds(edge, largoVentana-edge-size, size*3/2, size);
        this.setOpaque(false);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.black);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.white);
        Font letraMediana = new Font("SansSerif.", 1, 14);
        g.setFont(letraMediana);
        g.drawString("Cámara carro", this.getX() + 10, this.getY() + 50);
    }
}
