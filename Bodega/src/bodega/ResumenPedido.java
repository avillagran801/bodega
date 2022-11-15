package bodega;

import javax.swing.*;
import java.awt.*;

public class ResumenPedido extends JPanel{
    private Color azulOscuro = new Color(54, 73, 88);
    
    public ResumenPedido(int anchoVentana, int largoVentana) {
        this.setLayout(null);
        // this.setBounds(anchoVentana-250, 0, 250, largoVentana);
    }
    
    /*
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // No sé por qué no aparece :(
        g.setColor(Color.white);
        g.setFont(new Font("SansSerif.", 1, 16));
        g.drawString("Resumen Pedido", 0, 0);
    }
    */
}
