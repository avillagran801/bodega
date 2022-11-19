package bodega;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        JButton inicio = new JButton("Iniciar Nuevo Pedido");
        inicio.setBounds((this.getWidth()/2)-150, (this.getHeight()/2)-100, 300, 70);
        inicio.setBorderPainted(false);
        //inicio.setContentAreaFilled(false);
        inicio.setBackground(Color.white);
        inicio.setForeground(Color.black);        
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
                
                try {
                    window.getBase().nuevaListaPedido();
                } catch (IOException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                repaint();
            }
        });
        
        JButton historial = new JButton("Historial Pedidos");
        historial.setBounds((this.getWidth()/2)-100, (this.getHeight()/2), 200, 70);
        historial.setBorderPainted(false);
        historial.setBackground(Color.white);
        historial.setForeground(Color.black);        
        historial.setFont(new Font("SansSerif.", 1, 16));
        
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                window.getHistorial().imprimirPedidos();
            }
        });
        
        this.add(inicio);
        this.add(historial);
    }
}
