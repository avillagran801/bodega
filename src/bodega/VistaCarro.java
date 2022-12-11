package bodega;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class VistaCarro extends JPanel{
    private VistaAerea aerea;
    private BufferedImage estatica;
    
    public VistaCarro(int anchoVentana, int largoVentana, VistaAerea aerea_aux){
        this.setLayout(null);
        int edge = 30;
        int size = 150;
        this.setBounds(edge, largoVentana-edge-size, size*3/2, size);
        this.setOpaque(false);
        
        aerea = aerea_aux;
        try {
            estatica = ImageIO.read(getClass().getResourceAsStream("/res/static.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(VistaCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.darkGray);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());

        if(!aerea.pausa){
            g.drawImage(estatica, this.getX(), this.getY()+6, this.getWidth()-6, this.getHeight()-6, null);
            Font letraMediana = new Font("SansSerif.", 1, 12);
            Font letraPequena = new Font("SansSerif.", 1, 10);
            
            g.setColor(Color.RED);
            g.fillOval(this.getX()+5, this.getY()+10, 10, 10);
            g.setFont(letraMediana);
            g.drawString("REC", this.getX()+20, this.getY()+20);
            
            g.setFont(letraMediana);
            g.setColor(Color.WHITE);
            g.drawString("CÁMARA EN MOVIMIENTO", this.getX() + 25, this.getY() + 60);
        }
                
        else{
            // Color de fondo
            g.setColor(new Color(235, 212, 137));
            g.fillRect(this.getX(), this.getY()+6, this.getWidth()-6, this.getHeight()-6);
            
            if (1 <= aerea.carrito.getFlag() && aerea.carrito.getFlag() <= 7){
                // Fondo mesa
                g.setColor(new Color(102, 78, 21));
                g.fillRect(this.getX(), this.getY()+40, this.getWidth()-6, 50);
                
                // Selecciona colores de las frutas
                switch(aerea.carrito.getFlag()){
                    case 1:
                        g.setColor(Color.red);
                        break;
                    case 2:
                        g.setColor(Color.orange);
                        break;
                    case 3:
                        g.setColor(Color.yellow);
                        break;
                    case 4:
                        g.setColor(new Color(89, 186, 75));
                        break;
                    case 5:
                        g.setColor(new Color(243, 24, 24));
                        break;
                    case 6:
                        g.setColor(new Color(0, 153, 0));
                        break;
                }
                
                // Pinta frutas y verduras
                for(int k = 0; k < 3; k++){
                    for (int j = 0; j < 14; j++){
                        g.fillOval(this.getX()+5+(j*15), this.getY()+50+(k*15), 15, 15);
                    }
                }
                
                // Frente mesa
                g.setColor(new Color(166, 127, 34));
                g.fillRect(this.getX(), this.getY()+90, this.getWidth()-6, this.getHeight()-90);
                g.fillRect(this.getX(), this.getY()+60, 30, 30);
                g.fillRect(this.getWidth()-6, this.getY()+60, 30, 30);

                if(aerea.carrito.getFlag() == 1){
                    // Carro mirando hacia el frente
                    g.setColor(Color.lightGray);
                    g.fillRect(this.getX()+50, this.getY()+110, 120, 40);

                    g.setColor(Color.gray);
                    int[] xPoints = {this.getX()+15, this.getX()+50, this.getX()+50};
                    int[] yPoints = {this.getY()+150, this.getY()+150, this.getY()+110};
                    g.fillPolygon(xPoints, yPoints, 3);

                    int[] xPoints2 = {this.getX()+170, this.getX()+170, this.getX()+205};
                    int[] yPoints2 = {this.getY()+150, this.getY()+110, this.getY()+150};
                    g.fillPolygon(xPoints2, yPoints2, 3);
                }
                else{
                    // Carro de lado
                    g.setColor(Color.lightGray);
                    g.fillRect(this.getX(), this.getY()+110, this.getWidth()-6, 40);
                    g.setColor(Color.gray);
                    g.fillRect(this.getX(), this.getY()+110, this.getWidth()-6, 8);
                }

            }
            
            if(aerea.carrito.getFlag() == 9){
                // Frigorífico
                g.setColor(new Color(104,213,202));
                g.fillRect(this.getX(), this.getY()+60, this.getWidth()-6, 40);
                g.setColor(new Color(58,127,188));
                g.fillRect(this.getX(), this.getY()+90, this.getWidth()-6, 40);
                g.fillRect(this.getX(), this.getY()+60, this.getWidth()-6, 7);

                int[] xPoints = {this.getX()+130, this.getX()+137, this.getX()+160, this.getX()+150};
                int[] yPoints = {this.getY()+60, this.getY()+60, this.getY()+90, this.getY()+90};
                g.fillPolygon(xPoints, yPoints, 4);

                // Carro de lado
                g.setColor(Color.lightGray);
                g.fillRect(this.getX(), this.getY()+110, this.getWidth()-6, 40);
                g.setColor(Color.gray);
                g.fillRect(this.getX(), this.getY()+110, this.getWidth()-6, 8);
            }
        }
    } 
}
