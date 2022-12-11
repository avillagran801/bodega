package bodega;

import Buttons.BotonesMenu;
import java.awt.*;
import javax.swing.*;

/**
 * Subclase de JPanel donde puede elegirse entre iniciar un nuevo pedido o ver
 * el historial
 */
public class MenuPrincipal extends JPanel{
    private Ventana window;
    
    /**
     * Constructor del menú principal
     * @param window_aux Ventana asociada al menú principal
     */
    public MenuPrincipal (Ventana window_aux) {
        window = window_aux;
        this.setLayout(null);
        this.setBackground(new Color(54, 73, 88));
        this.setBounds(0, 0, window.getWidth(), window.getHeight());
        
        BotonesMenu botones = new BotonesMenu(this);
    }
    
    /**
     * Devuelve la ventana asociada
     * @return Ventana asociada
     */
    public Ventana getWindow(){
        return window;
    }
}
