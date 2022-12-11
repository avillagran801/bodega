package Graphics;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSpinner;
import javax.swing.Timer;

public class Carrito extends JSpinner{    
    VistaAerea vista;
    private static final int ancho = 80;
    private static final int alto = 100;
    private int pos_x = 100;
    private int pos_y = 130;
    private int vel_x = 0;
    private int vel_y = 5;
    private int giro = 0;
    private int flag = 0;
    
    /**
     * Constructor del carrito de compras
     * @param vista_aux VistaAerea asociada al carrito
     */
    public Carrito(VistaAerea vista_aux){
        vista = vista_aux;
    }
    
    /* FLAGS
    0 = Inicio. Carrito baja hacia manzanas.
    1 = Si pide manzanas, se detiene.
    2 = Giro hacia demás frutas y a las verduras.
    3 = Si pide naranjas, gira, las toma, y luego sigue.
    4 = Si pide bananas, gira, las toma y luego sigue.
    5 = si pide lechuga, gira, las toma y luego sigue.
    6 = si pide tomates, gira, las toma y luego sigue.
    7 = si pide pepinos, gira, las toma y luego sigue.
    8 = Gira, carrito baja hacia las carnes.
    9 = si pide cualquier tipo de carne, gira, las toma, y luego sigue.
    10 = Gira, carrito va hacia la izquierda para dejar las cosas.
    11 = Se detiene, dejas las cosas. Fin.
    */
    
    /**
     * Método para dibujar la bodega y el carrito
     * @param g_aux 
     */
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
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                break;
            case 2:
                g2d.translate(pos_x, pos_y);
                g2d.rotate(Math.toRadians((double)giro));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                giro-=3;
                break;
            case 3:
                g2d.translate(pos_x, pos_y-ancho);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, (alto/10), ancho);
                break;
            case 4:
                g2d.translate(pos_x, pos_y);
                g2d.rotate(Math.toRadians((double)giro));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                giro+=3;
                break;
            case 5:
                g2d.translate(pos_x, pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                break;
            case 6:
                g2d.translate(pos_x, pos_y);
                g2d.rotate(Math.toRadians((double)giro));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                giro+=3;
                break;
            case 7:
                g2d.translate((pos_x-alto), pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(((alto*9)/10), 0, (alto/10), ancho);
                break;
            case 8:
                g2d.translate((pos_x-alto), pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(((alto*9)/10), 0, (alto/10), ancho);
                break;
        }
    }
    /**
     * Actualiza los estados del carrito en función de su posición y los ítems
     * del pedido actual
     * @throws InterruptedException 
     */
    public void update() throws InterruptedException{
        pos_x = pos_x + vel_x;
        pos_y = pos_y + vel_y;
        switch(flag){
            case 0:
                if((pos_y+alto) > 335){
                    flag = 1;
                    vel_y = 3;
                }
                break;
            case 1:
                if(vista.getCompra().getListaActual().getManzana().getCantidad() != 0){
                    Pausa(2);
                }
                else {
                    flag = 2;
                }
                break;
            case 2:
                if(giro == -90){
                    flag = 3;
                    vel_x = 6;
                    vel_y = 0;
                }
                break;
            case 3:
                if(vista.getCompra().getListaActual().getNaranja().getCantidad() != 0 && pos_x == 262){  
                    Pausa(3);
                }
                if((pos_x+alto) > 735){
                    flag = 4;
                    vel_x= -2;
                }
                break;
            case 4:
                if(giro == 0){
                    flag = 5;
                    vel_x = 0;
                    vel_y = 5;
                }
                break;
            case 5:
                if((pos_y+alto) > 560){
                    flag = 6;
                    vel_y = 3;
                }
                break;
            case 6:
                if(giro == 90){
                    flag = 7;
                    vel_x = -3;
                    vel_y = 0;
                }
                break;
            case 7:
                if(pos_x <450){
                    flag = 8;
                    vel_x = 0;
                }
                break;
        }
    }
    
    /**
     * Reinicia los parámetros asociados al carrito
     */
    public void reset(){
        pos_x = 100;
        pos_y = 130;
        vel_x = 0;
        vel_y = 5;
        giro = 0;
        flag = 0;
    }
    
    /*
    Por lo visto no se usa
    public float getGiro(){
        return giro;
    }
    */
    
    /**
     * Permite detener el movimiento del carrito por 5000 milisegundos
     * @param flag_aux 
     */
    private void Pausa(int flag_aux){
        vista.pausa = true;
        ActionListener taskPerformer = new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent evt) {
                vista.pausa = false;
                flag = flag_aux;
            }
        };
                    
        Timer timer = new Timer(5000, taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }
    
    /**
     * Devuelve la flag del estado del carrito
     * @return Flag del estado del carrito
     */
    public int getFlag(){
        return flag;
    }
}
