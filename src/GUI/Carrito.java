package GUI;

import java.awt.Color;
import java.awt.*;
import javax.swing.JSpinner;

public class Carrito extends JSpinner{
    
    private static int ancho = 80;
    private static int alto = 100;
    int pos_x = 100;
    int pos_y = 130;
    int vel_x = 0;
    int vel_y = 5;
    int giro = 0;
    int flag = 0;
    
    public Carrito(){
    }
    
    @Override
    public void paint(Graphics g_aux){
        Graphics2D g2d = (Graphics2D)g_aux.create();
        switch(flag){
            case 0:
                g2d.translate(pos_x, pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                break;
            case 1:
                g2d.translate(pos_x, pos_y);
                g2d.rotate(Math.toRadians((double)giro));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                giro-=3;
                break;
            case 2:
                g2d.translate(pos_x, pos_y-ancho);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, (alto/10), ancho);
                break;
        }
    }
    
    public void update(){
        pos_x = pos_x + vel_x;
        pos_y = pos_y + vel_y;
        switch(flag){
            case 0:
                if((pos_y+alto) > 355){
                    flag = 1;
                    vel_y = 3;
                }
                break;
                
            case 1:
                if(giro == -90){
                    flag = 2;
                    vel_x = 6;
                    vel_y = 0;
                }
                break;
        }
    }
    
    public void reset(){
        pos_x = 100;
        pos_y = 130;
        vel_x = 0;
        vel_y = 3;
        flag = 0;
    }
    
    public float getGiro(){
        return giro;
    }
}
