package bodega;

import javax.swing.*;
import java.awt.*;

public class BasePedidos extends JPanel{
    public BasePedidos(int anchoVentana, int largoVentana){
        this.setLayout(null);
        
        Color c_base = new Color(85, 130, 139);        
        this.setBackground(c_base);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}