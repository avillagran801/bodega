package bodega;

import javax.swing.*;
import java.awt.*;

public class ResumenPedido extends JPanel{
    private Color azulOscuro = new Color(54, 73, 88);
    
    public ResumenPedido(int anchoVentana, int largoVentana) {
        
        this.setLayout(null);
        this.setBounds(anchoVentana-250, 0, 250, largoVentana);
        
        botones();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
       
        g.setColor(azulOscuro);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        
        // No sé por qué no aparece :(
        g.setColor(Color.white);
        g.setFont(new Font("SansSerif.", 1, 16));
        g.drawString("Resumen Pedido", 0, 0);
    }
    
    private void botones(){
        
        JButton finPedido = new JButton("Finalizar Pedido");
        finPedido.setBounds(25, 680, 200, 40);
        finPedido.setBorderPainted(false);
        finPedido.setBackground(azulOscuro);
        finPedido.setForeground(Color.white);
        finPedido.setFont(new Font("SansSerif.", 1, 16));

        this.add(finPedido);
    }

}
