package GUI;

import java.awt.Color;
import java.awt.*;

public class Carrito {
    
    private static int ancho = 80;
    private static int alto = 100;
    int pos_x = 100;
    int pos_y = 130;
    int vel_x = 0;
    int vel_y = 3;
    
    public Carrito(){
    }
    
    public void paint(Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(pos_x, pos_y, ancho, alto);
        g.setColor(Color.RED);
        g.fillRect(pos_x, pos_y, ancho, (alto/10));
    }
    
    public void update(){
        pos_x = pos_x + vel_x;
        pos_y = pos_y + vel_y;
    }
    
    public void reset(){
        pos_x = 100;
        pos_y = 130;
        vel_x = 0;
        vel_y = 3;
    }
    
}
