package Buttons;

import bodega.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Botón asociado al historial de compras
 */
public class BotonesHistorial {
    private HistorialPedidos historial;
    
    /**
     * Constructor BotonesHistorial
     * @param historial_aux HistorialPedidos en que se insertan
     */
    public BotonesHistorial(HistorialPedidos historial_aux){
        historial = historial_aux;
        
        VolverAlMenu();
    }
    
    /**
     * Crea e inserta el botón para volver al menú principal
     */
    private void VolverAlMenu(){
        JButton volver = new JButton();
        volver.setBounds(20, 20, 40, 40);
        volver.setBorderPainted(false);
        volver.setContentAreaFilled(false);
        volver.setFocusPainted(false);
        
        try {
            // Obtiene imagen
            Image img = ImageIO.read(getClass().getResourceAsStream("/res/homeWhite.png"));
            
            // Escala la imagen
            Image newImg = img.getScaledInstance(volver.getWidth(), volver.getHeight(),Image.SCALE_DEFAULT);
            
            // Asigna la imagen como ícono al botón
            volver.setIcon(new ImageIcon(newImg));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historial.getWindow().setComponentZOrder(historial.getWindow().getMenu(), 0);
                historial.getWindow().setComponentZOrder(historial.getWindow().getBase(), 1);
                historial.getWindow().setComponentZOrder(historial.getWindow().getVista(), 2);
                historial.getWindow().setComponentZOrder(historial.getWindow().getHistorial(), 3);
                
                historial.getWindow().getMenu().setVisible(true);
                historial.getWindow().getBase().setVisible(false);
                historial.getWindow().getVista().setVisible(false);
                historial.getWindow().getHistorial().setVisible(false);
            }
        });
        
        historial.add(volver);
    }
}
