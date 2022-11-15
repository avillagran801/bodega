package bodega;
import java.awt.*;
import javax.swing.*;

public class MenuPrincipal extends JPanel{
    
    private VentanaPedido window;
    
    public MenuPrincipal (int anchoVentana, int largoVentana) {
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        this.setBackground(Color.BLUE);
        botones();
    }
    
    public void setWindow (VentanaPedido window_aux){
        window = window_aux;
    }
    
    private void botones() {
        JButton inicio = new JButton("Iniciar Pedido");
        inicio.setBounds((this.getWidth()/2)-200, (this.getHeight()/2)-200, 200, 200);
        //inicio.setBounds(this.getWidth()-((this.getWidth()/2)-200), 
                //this.getHeight()-((this.getHeight()/2)-300), 200, 300);
        inicio.setBorderPainted(false);
        inicio.setContentAreaFilled(false);
        inicio.setForeground(Color.white);        
        inicio.setFont(new Font("SansSerif.", 1, 16));
        
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                window.setComponentZOrder(window.getMenu(), 3);
                window.setComponentZOrder(window.getSelector(), 0);
                window.setComponentZOrder(window.getResumen(), 1);
                window.setComponentZOrder(window.getBase(), 2);
                
                window.getMenu().setVisible(false);
                
                window.getSelector().setVisible(true);
                window.getResumen().setVisible(true);
                window.getBase().setVisible(true);
                
                repaint();
            }
        });
        
        this.add(inicio);
    }
}
