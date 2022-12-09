package botones;

import bodega.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class BotonesVista {
    private VistaCompra vista;
    
    public BotonesVista(VistaCompra vista_aux){
        vista = vista_aux;
        
        botonVolver();
    }
    
    private void botonVolver(){
        JButton volver = new JButton();
        volver.setBounds(20, 60, 40, 40);
        volver.setBorderPainted(false);
        volver.setContentAreaFilled(false);
        volver.setFocusPainted(false);
        
        try {
            // Obtiene imagen
            Image img = ImageIO.read(getClass().getResourceAsStream("/res/homeWhite.png"));
            
            // Escala la imagen
            Image newImg = img.getScaledInstance(volver.getWidth(), 
                    volver.getHeight(),Image.SCALE_DEFAULT);
            
            // Asigna la imagen como ícono al botón
            volver.setIcon(new ImageIcon(newImg));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.getWindow().setComponentZOrder(vista.getWindow().getMenu(), 0);
                vista.getWindow().setComponentZOrder(vista.getWindow().getBase(), 1);
                vista.getWindow().setComponentZOrder(vista.getWindow().getVista(), 2);
                vista.getWindow().setComponentZOrder(vista.getWindow().getHistorial(), 3);
                
                vista.getWindow().getMenu().setVisible(true);
                vista.getWindow().getBase().setVisible(false);
                vista.getWindow().getVista().setVisible(false);
                vista.getWindow().getHistorial().setVisible(false);
                vista.getAerea().carrito.reset();
                vista.getAerea().temporizador.stop();
            }
        });
        
        vista.add(volver);
    }
    
}
