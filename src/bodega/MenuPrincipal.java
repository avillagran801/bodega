package bodega;

import java.awt.*;
import javax.swing.*;
import botones.*;

public class MenuPrincipal extends JPanel{
    private Ventana window;
    
    public MenuPrincipal (int anchoVentana, int largoVentana) {
        this.setLayout(null);
        this.setBackground(new Color(54, 73, 88));
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
        BotonesMenu botones = new BotonesMenu(this);
    }
    
    public void setWindow (Ventana window_aux){
        window = window_aux;
    }
    
    public Ventana getWindow(){
        return window;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
