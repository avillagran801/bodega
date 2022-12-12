package Graphics;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSpinner;
import javax.swing.Timer;

/**
 * Subclase de JPanel encargada de pintar y animar al carrito de compras
 */
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
    private Boolean manzana = false;
    private Boolean naranja = false;
    private Boolean platano = false;
    private Boolean lechuga = false;
    private Boolean tomate = false;
    private Boolean pepino = false;
    private Boolean carne = false;
    
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
    8 = Gira
    9 = Carrito baja hacia las carnes.
    10 = si pide cualquier tipo de carne, gira, las toma, y luego sigue.
    11 = Gira
    12 = carrito va hacia la izquierda para dejar las cosas.
    13 = Se detiene, dejas las cosas. 
    14 = Fin.
    */
    
    /**
     * Método para dibujar la bodega y el carrito
     * @param g_aux 
     */
 @Override
    public void paint(Graphics g_aux){
        Graphics2D g2d = (Graphics2D)g_aux.create();
        switch(flag){
            // Carrito vertical.
            case 0:
                g2d.translate(pos_x, pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                if(manzana){
                    g2d.setColor(Color.RED);
                    g2d.fillOval(0, (alto/10), 20, 20);
                }
                if(naranja){
                    g2d.setColor(Color.ORANGE);
                    g2d.fillOval(0, (alto/10)+30, 20, 20);
                }
                if(platano){
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(0, (alto/10)+60, 20, 20);
                }
                if(lechuga){
                    g2d.setColor(new Color(89, 186, 75));
                    g2d.fillOval(30, (alto/10), 20, 20);
                }
                if(tomate){
                    g2d.setColor(new Color(243, 24, 24));
                    g2d.fillOval(30, (alto/10)+30, 20, 20);
                }
                if(pepino){
                    g2d.setColor(new Color(0, 153, 0));
                    g2d.fillOval(30, (alto/10)+60, 20, 20);
                }
                if(carne){
                    g2d.setColor(new Color(226, 193, 232));
                    g2d.fillOval(60, (alto/10), 20, 20);
                }
                break;
            case 1:
                g2d.translate(pos_x, pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                break;
            case 10:
                g2d.translate(pos_x, pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                break;                
            case 11:
                g2d.translate(pos_x, pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                break;                
                
            // Carrito girando a la derecha para quedar horizontal.
            case 2:
                g2d.translate(pos_x, pos_y);
                g2d.rotate(Math.toRadians((double)giro));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                if(manzana){
                    g2d.setColor(Color.RED);
                    g2d.fillOval(0, (alto/10), 20, 20);
                }
                if(naranja){
                    g2d.setColor(Color.ORANGE);
                    g2d.fillOval(0, (alto/10)+30, 20, 20);
                }
                if(platano){
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(0, (alto/10)+60, 20, 20);
                }
                if(lechuga){
                    g2d.setColor(new Color(89, 186, 75));
                    g2d.fillOval(30, (alto/10), 20, 20);
                }
                if(tomate){
                    g2d.setColor(new Color(243, 24, 24));
                    g2d.fillOval(30, (alto/10)+30, 20, 20);
                }
                if(pepino){
                    g2d.setColor(new Color(0, 153, 0));
                    g2d.fillOval(30, (alto/10)+60, 20, 20);
                }
                if(carne){
                    g2d.setColor(new Color(226, 193, 232));
                    g2d.fillOval(60, (alto/10), 20, 20);
                }
                giro-=3;
                break;
            // Carrito en horizontal hacia la derecha.
            case 3:
                g2d.translate(pos_x, pos_y-ancho);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, (alto/10), ancho);
                if(manzana){
                    g2d.setColor(Color.RED);
                    g2d.fillOval((alto/10), ancho-20, 20, 20);
                }
                if(naranja){
                    g2d.setColor(Color.ORANGE);
                    g2d.fillOval((alto/10)+30, ancho-20, 20, 20);
                }
                if(platano){
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval((alto/10)+60, ancho-20, 20, 20);
                }
                if(lechuga){
                    g2d.setColor(new Color(89, 186, 75));
                    g2d.fillOval((alto/10), ancho-50, 20, 20);
                }
                if(tomate){
                    g2d.setColor(new Color(243, 24, 24));
                    g2d.fillOval((alto/10)+30, ancho-50, 20, 20);
                }
                if(pepino){
                    g2d.setColor(new Color(0, 153, 0));
                    g2d.fillOval((alto/10)+60, ancho-50, 20, 20);
                }
                if(carne){
                    g2d.setColor(new Color(226, 193, 232));
                    g2d.fillOval((alto/10), ancho-80, 20, 20);
                }
                break;
                
            case 4:
                g2d.translate(pos_x, pos_y-ancho);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, (alto/10), ancho);
                break;                
            case 5:
                g2d.translate(pos_x, pos_y-ancho);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, (alto/10), ancho);
                break;                
            case 6:
                g2d.translate(pos_x, pos_y-ancho);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, (alto/10), ancho);
                break;                
            case 7:
                g2d.translate(pos_x, pos_y-ancho);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, (alto/10), ancho);
                break;                
            case 8:
                g2d.translate(pos_x, pos_y-ancho);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, (alto/10), ancho);
                break;                
            // Carrito girando a la izquierda para quedar vertical.
            case 9:
                g2d.translate(pos_x, pos_y);
                g2d.rotate(Math.toRadians((double)giro));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                if(manzana){
                    g2d.setColor(Color.RED);
                    g2d.fillOval(0, (alto/10), 20, 20);
                }
                if(naranja){
                    g2d.setColor(Color.ORANGE);
                    g2d.fillOval(0, (alto/10)+30, 20, 20);
                }
                if(platano){
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(0, (alto/10)+60, 20, 20);
                }
                if(lechuga){
                    g2d.setColor(new Color(89, 186, 75));
                    g2d.fillOval(30, (alto/10), 20, 20);
                }
                if(tomate){
                    g2d.setColor(new Color(243, 24, 24));
                    g2d.fillOval(30, (alto/10)+30, 20, 20);
                }
                if(pepino){
                    g2d.setColor(new Color(0, 153, 0));
                    g2d.fillOval(30, (alto/10)+60, 20, 20);
                }
                if(carne){
                    g2d.setColor(new Color(226, 193, 232));
                    g2d.fillOval(60, (alto/10), 20, 20);
                }
                giro+=3;
                break;
            // Carrito girando a la izquierda para quedar horizontal.
            case 12:
                g2d.translate(pos_x, pos_y);
                g2d.rotate(Math.toRadians((double)giro));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, ancho, alto);
                g2d.setColor(Color.RED);
                g2d.fillRect(0, 0, ancho, (alto/10));
                if(manzana){
                    g2d.setColor(Color.RED);
                    g2d.fillOval(0, (alto/10), 20, 20);
                }
                if(naranja){
                    g2d.setColor(Color.ORANGE);
                    g2d.fillOval(0, (alto/10)+30, 20, 20);
                }
                if(platano){
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(0, (alto/10)+60, 20, 20);
                }
                if(lechuga){
                    g2d.setColor(new Color(89, 186, 75));
                    g2d.fillOval(30, (alto/10), 20, 20);
                }
                if(tomate){
                    g2d.setColor(new Color(243, 24, 24));
                    g2d.fillOval(30, (alto/10)+30, 20, 20);
                }
                if(pepino){
                    g2d.setColor(new Color(0, 153, 0));
                    g2d.fillOval(30, (alto/10)+60, 20, 20);
                }
                if(carne){
                    g2d.setColor(new Color(226, 193, 232));
                    g2d.fillOval(60, (alto/10), 20, 20);
                }
                giro+=3;
                break;
            // Carrito horizontal a la izquierda.
            case 13:
                g2d.translate((pos_x-alto), pos_y);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(0, 0, alto, ancho);
                g2d.setColor(Color.RED);
                g2d.fillRect(((alto*9)/10), 0, (alto/10), ancho);
                if(manzana){
                    g2d.setColor(Color.RED);
                    g2d.fillOval(((alto*9)/10-20), 0, 20, 20);
                }
                if(naranja){
                    g2d.setColor(Color.ORANGE);
                    g2d.fillOval((alto*9)/10-50, 0, 20, 20);
                }
                if(platano){
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval((alto*9)/10-80, 0, 20, 20);
                }
                if(lechuga){
                    g2d.setColor(new Color(89, 186, 75));
                    g2d.fillOval(((alto*9)/10-20), 30, 20, 20);
                }
                if(tomate){
                    g2d.setColor(new Color(243, 24, 24));
                    g2d.fillOval(((alto*9)/10-50), 30, 20, 20);
                }
                if(pepino){
                    g2d.setColor(new Color(0, 153, 0));
                    g2d.fillOval(((alto*9)/10-80), 30, 20, 20);
                }
                if(carne){
                    g2d.setColor(new Color(226, 193, 232));
                    g2d.fillOval(((alto*9)/10-20), 60, 20, 20);
                }
                break;
            case 14:
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
                    manzana = true;
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
                if(vista.getCompra().getListaActual().getNaranja().getCantidad() != 0
                        && pos_x > 260){  
                    Pausa(4);
                    naranja = true;
                } else {
                    if(pos_x > 260){
                        flag = 4;
                    }
                }
                break;
            case 4:
                if(vista.getCompra().getListaActual().getPlatano().getCantidad() != 0
                        && pos_x > 385){  
                    Pausa(5);
                    platano = true;
                } else {
                    if(pos_x > 385){
                        flag = 5;
                    }
                }
                break;
            case 5:
                if(vista.getCompra().getListaActual().getLechuga().getCantidad() != 0
                        && pos_x > 385){  
                    Pausa(6);
                    lechuga = true;
                } else {
                    if(pos_x > 385){
                        flag = 6;
                    }
                }
                break;
            case 6:
                if(vista.getCompra().getListaActual().getTomate().getCantidad() != 0
                        && pos_x > 530){  
                    Pausa(7);
                    tomate = true;
                } else {
                    if(pos_x > 530){
                        flag = 7;
                    }
                }
                break;
            case 7:
                if(vista.getCompra().getListaActual().getPepino().getCantidad() != 0
                        && pos_x > 625){  
                    Pausa(8);
                    pepino = true;
                } else {
                    if(pos_x > 625){
                        flag = 8;
                    }
                }
                break;
            case 8:
                if((pos_x+alto) > 735){
                    flag = 9;
                    vel_x = -2;
                }
                break;
            case 9:
                if(giro == 0){
                    flag = 10;
                    vel_x = 0;
                    vel_y = 5;
                }
                break;
            case 10:
                if((vista.getCompra().getListaActual().getHamburguesa().getCantidad() != 0 
                        || vista.getCompra().getListaActual().getPollo().getCantidad() != 0
                        || vista.getCompra().getListaActual().getChurrasco().getCantidad() != 0)
                        && pos_y > 450){  
                    carne = true;
                    Pausa(11);
                } else {
                    if(pos_y > 450){
                        flag = 11;
                    }
                }
                break;
            case 11:
                if((pos_y+alto) > 560){
                    flag = 12;
                    vel_y = 3;
                }
                break;
            case 12:
                if(giro == 90){
                    flag = 13;
                    vel_x = -3;
                    vel_y = 0;
                }
                break;
            case 13:
                if(pos_x < 450){
                    flag = 14;
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
        manzana = false;
        naranja = false;
        platano = false;
        lechuga = false;
        tomate = false;
        pepino = false;
        carne = false;
    }
    
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
