package bodega;
import java.awt.*;
import javax.swing.*;

public class MenuPrincipal extends JPanel{
    
    private Ventana window;
    
    public MenuPrincipal (int anchoVentana, int largoVentana) {
        this.setLayout(null);
        this.setBackground(Color.BLUE);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        botones();
    }
    
    public void setWindow (Ventana window_aux){
        window = window_aux;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    private void botones() {
        JButton inicio = new JButton("Iniciar Pedido");
        inicio.setBounds((this.getWidth()/2)-100, (this.getHeight()/2)-100, 200, 200);
        inicio.setBorderPainted(false);
        inicio.setContentAreaFilled(false);
        inicio.setForeground(Color.white);        
        inicio.setFont(new Font("SansSerif.", 1, 16));
        
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                window.setComponentZOrder(window.getMenu(), 2);
                window.setComponentZOrder(window.getBase(), 0);
                window.setComponentZOrder(window.getVista(), 1);
                
                window.getMenu().setVisible(false);
                window.getBase().setVisible(true);
                window.getVista().setVisible(false);
                
                repaint();
            }
        });
        
        this.add(inicio);
    }
}
