package bodega;
import java.awt.*;
import javax.swing.*;

/**
 * Subclase de JFrame que contiene al menú principal, historial de pedidos, base
 * para realizar pedidos y animación de las compras en la bodega
 * @author ana
 */
public class Ventana extends JFrame {
    private BasePedidos base;
    private MenuPrincipal menu;
    private VistaCompra vista;
    private HistorialPedidos historial;

    /**
     * Constructor de Ventana. En él se inicializan los distintos paneles
     */
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Pedido");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        menu = new MenuPrincipal(this);
        base = new BasePedidos(this);
        vista = new VistaCompra(this);
        historial = new HistorialPedidos(this);
        
        this.getContentPane().add(base);
        this.getContentPane().add(menu);
        this.getContentPane().add(vista);
        this.getContentPane().add(historial);
        
        base.setVisible(false);
        vista.setVisible(false);
        historial.setVisible(false);
                
        this.setComponentZOrder(menu, 0);
        this.setComponentZOrder(base, 1);
        this.setComponentZOrder(vista, 2);
        this.setComponentZOrder(historial, 3);
        
        repaint();
    }
    
    /**
     * Devuelve el menú principal
     * @return MenuPrincipal menu
     */
    public MenuPrincipal getMenu(){
        return menu;
    }
    
    /**
     * Devuelve la base de los pedidos
     * @return BasePedidos base
     */
    public BasePedidos getBase(){
        return base;
    }
    
    /**
     * Devuelve la vista de la compra en la bodega
     * @return VistaCompra vista
     */
    public VistaCompra getVista(){
        return vista;
    }
    
    /**
     * Devuelve el historial de pedidos
     * @return HistorialPedidos historial
     */
    public HistorialPedidos getHistorial(){
        return historial;
    }
}
