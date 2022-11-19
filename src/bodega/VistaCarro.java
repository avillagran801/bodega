package bodega;

import java.awt.*;
import javax.swing.*;

public class VistaCarro extends JPanel{
    
    public VistaCarro(int anchoVentana, int largoVentana){
        this.setLayout(null);
        this.setBounds(anchoVentana/2, 0, anchoVentana/2, largoVentana);
        this.setOpaque(false);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.blue);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.white);
        Font letraMediana = new Font("SansSerif.", 1, 18);
        g.setFont(letraMediana);
        g.drawString("Aquí va la vista del carro", this.getX() + 40, this.getY() + 300);
    }
}
