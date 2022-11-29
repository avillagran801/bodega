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
        
        g.setColor(new Color(235, 212, 137));
        g.fillRect(30, 110, 830, this.getHeight()-140);
        g.setColor(new Color(193, 169, 89));
        for(int i = 1; i<=5; i++){
            g.fillRect(30+(i*160), 110, 6, this.getHeight()-140);
            g.fillRect(30, 110+(126*i), 830, 6);
        }
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(70, 130, 80, 100);
        g.setColor(Color.RED);
        g.fillRect(70, 130, 80, 10);
        
        for(int i = 0; i<3; i++){
            g.setColor(new Color(166, 127, 34));
            g.fillRect(80+(i*150), 380, 150, 100);
            g.setColor(new Color (127, 97, 28));
            g.fillRect(90+(i*150), 380, 130, 90);
        }
        
        for(int i = 0; i<3; i++){
            g.setColor(new Color(166, 127, 34));
            g.fillRect(370+(i*150), 115, 150, 100);
            g.setColor(new Color (127, 97, 28));
            g.fillRect(380+(i*150), 125, 130, 90);
        }
        g.setColor(new Color(166, 127, 34));
        g.fillRect(670, 115, 150, 100);
        g.setColor(new Color (127, 97, 28));
        g.fillRect(680, 125, 130, 90);
        
        g.setColor(new Color(58,127,188));
        g.fillRect(700, 400, 120, 300);
        g.setColor(new Color(104,213,202));
        g.fillRect(710, 410, 100, 135);
        g.fillRect(710, 550, 100, 135);
        g.setColor(new Color(90,105,104));
        g.fillRect(740, 415, 40, 10);
        g.fillRect(740, 670, 40, 10);
        
        g.setColor(new Color(208,60,85));
        g.fillRect(300, 650, 300, 100);
        
        
        /*g.setColor(Color.white);
        Font letraMediana = new Font("SansSerif.", 1, 18);
        g.setFont(letraMediana);
        g.drawString("Aquí va la vista aérea", this.getX()+40, this.getY()+300);*/
        
    }
}
