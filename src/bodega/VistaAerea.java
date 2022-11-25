package bodega;

import java.awt.*;
import javax.swing.*;

public class VistaAerea extends JPanel{
    
    public VistaAerea(int anchoVentana, int largoVentana){
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        this.setOpaque(false);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.darkGray);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.white);
        Font letraMediana = new Font("SansSerif.", 1, 18);
        g.setFont(letraMediana);
        g.drawString("Aquí va la vista aérea", this.getX()+40, this.getY()+300);
        
    }
}
