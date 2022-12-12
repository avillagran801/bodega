package Graphics;

import java.awt.*;
import javax.swing.*;
import bodega.VistaCompra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Subclase de JPanel encargada de dibujar la vista aérea de la bodega
 */
public class VistaAerea extends JPanel implements ActionListener{   
    public Timer temporizador;
    public Carrito carrito;
    public Boolean pausa;
    private VistaCompra vista;
    
    /**
     * Constructor de la vista aérea
     * @param anchoVentana Ancho de la ventana en que se genera
     * @param largoVentana Largo de la ventana en que se genera
     * @param compra_aux VistaCompra asociada
     */
    public VistaAerea(int anchoVentana, int largoVentana, VistaCompra compra_aux){
        vista = compra_aux;
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        this.setOpaque(false);
        this.setFocusable(true);
        temporizador = new Timer(100, this);
        carrito = new Carrito(this);
        pausa = false;
    }
    
    /**
     * Devuelve la VistaCompra asociada
     * @return VistaCompra asociada
     */
    public VistaCompra getCompra(){
        return vista;
    }
    
    /**
     * Método que permite repintar la vista de acuerdo a los cambios de estado
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e){
        vista.repaint();
        try {
            if(!pausa){
                this.update();               
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaAerea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Método para pintar la vista aérea
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        g.setColor(Color.darkGray);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        //Piso
        g.setColor(new Color(235, 212, 137));
        g.fillRect(30, 110, 830, this.getHeight()-140);
        g.setColor(new Color(193, 169, 89));
        for(int i = 1; i<=5; i++){
            g.fillRect(30+(i*160), 110, 6, this.getHeight()-140);
            g.fillRect(30, 110+(126*i), 830, 6);
        }
        
        //Frutas
        for(int i = 0; i<3; i++){
            g.setColor(new Color(166, 127, 34));
            g.fillRect(80+(i*150), 380, 150, 100);
            g.setColor(new Color (127, 97, 28));
            g.fillRect(90+(i*150), 380, 130, 90);
            switch(i){
                case 0:
                    for(int k = 0; k < 9; k++){
                        for (int j = 0; j < 13; j++){
                            g.setColor(Color.red);
                            g.fillOval(90+(j*10), 380+(k*10), 10, 10);
                        }
                    }
                    break;
                case 1:
                    for(int k = 0; k < 9; k++){
                        for (int j = 0; j < 13; j++){
                            g.setColor(Color.ORANGE);
                            g.fillOval(240+(j*10), 380+(k*10), 10, 10);
                        }
                    }
                    break;
                case 2:
                    for(int k = 0; k < 9; k++){
                        for (int j = 0; j < 13; j++){
                            g.setColor(Color.YELLOW);
                            g.fillOval(390+(j*10), 380+(k*10), 10, 10);
                        }
                    }
                    break;
            }
        }
        
        //Verduras
        for(int i = 0; i<3; i++){
            g.setColor(new Color(166, 127, 34));
            g.fillRect(370+(i*150), 115, 150, 100);
            g.setColor(new Color (127, 97, 28));
            g.fillRect(380+(i*150), 125, 130, 90);
            switch(i){
                case 0:
                    for(int k = 0; k < 9; k++){
                        for (int j = 0; j < 13; j++){
                            g.setColor(new Color(89, 186, 75));
                            g.fillOval(380+(j*10), 125+(k*10), 10, 10);
                        }
                    }
                    break;
                case 1:
                    for(int k = 0; k < 9; k++){
                        for (int j = 0; j < 13; j++){
                            g.setColor(new Color(243, 24, 24));
                            g.fillOval(530+(j*10), 125+(k*10), 10, 10);
                        }
                    }
                    break;
                case 2:
                    for(int k = 0; k < 9; k++){
                        for (int j = 0; j < 13; j++){
                            g.setColor(new Color(0, 153, 0));
                            g.fillOval(680+(j*10), 125+(k*10), 10, 10);
                        }
                    }
                    break;
            }
        }
        
        //Carnes
        g.setColor(new Color(58,127,188));
        g.fillRect(700, 400, 120, 300);
        g.setColor(new Color(104,213,202));
        g.fillRect(710, 410, 100, 135);
        g.fillRect(710, 550, 100, 135);
        g.setColor(new Color(90,105,104));
        g.fillRect(740, 415, 40, 10);
        g.fillRect(740, 670, 40, 10);
        
        //Cajero
        g.setColor(new Color(208,60,85));
        g.fillRect(300, 650, 300, 100);
        if(14 == carrito.getFlag()){
            g.setColor(Color.white);
            g.fillRect(350, 690, 50, 45);
            g.fillRect(350, 670, 10, 20);
            g.fillRect(390, 670, 10, 20);
            g.setColor(Color.black);
            g.setFont(new Font("SansSerif.", 1, 10));
            g.drawString("Bodega", 353, 710);
        }

        //Carrito
        carrito.paint(g);
    }
    
    /**
     * Método que actualiza el estado del carrito
     * @throws InterruptedException 
     */
    public void update() throws InterruptedException{
        carrito.update();
    }
}
