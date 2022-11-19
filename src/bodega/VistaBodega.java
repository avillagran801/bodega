package bodega;

import java.awt.*;
import javax.swing.*;

public class VistaBodega extends JPanel{
    private Ventana window;
    private VistaAerea aerea;
    private VistaCarro carro;
    
    public VistaBodega(int anchoVentana, int largoVentana){
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
        aerea = new VistaAerea(anchoVentana, largoVentana);
        carro = new VistaCarro(anchoVentana, largoVentana);
        
        botonVolver();
    }
    
    public void setWindow (Ventana window_aux){
        window = window_aux;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        aerea.paintComponent(g);
        carro.paintComponent(g);
    }
    
    private void botonVolver(){
        JButton volver = new JButton("Volver a inicio");
        volver.setBounds(30, 30, 150, 40);
        volver.setBorderPainted(false);
        volver.setBackground(Color.white);
        volver.setForeground(Color.black);        
        volver.setFont(new Font("SansSerif.", 1, 12));
        
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                window.setComponentZOrder(window.getMenu(), 0);
                window.setComponentZOrder(window.getBase(), 1);
                window.setComponentZOrder(window.getVista(), 2);
                
                window.getMenu().setVisible(true);
                window.getBase().setVisible(false);
                window.getVista().setVisible(false);                
                repaint();
            }
        });
        
        this.add(volver);
    }
}
