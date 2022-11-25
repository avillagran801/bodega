package bodega;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;


public class Ventana extends JFrame {
    private BasePedidos base;
    private MenuPrincipal menu;
    private VistaCompra vista;
    private HistorialPedidos historial;

    public Ventana() throws IOException {
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Pedido");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        menu = new MenuPrincipal(this.getWidth(), this.getHeight());
        base = new BasePedidos(this.getWidth(), this.getHeight());
        vista = new VistaCompra(this.getWidth(), this.getHeight());
        historial = new HistorialPedidos(this.getWidth(), this.getHeight());
        
        setWindowInComponents();
        
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
    
    private void setWindowInComponents(){
        menu.setWindow(this);
        base.setWindow(this);
        vista.setWindow(this);
        historial.setWindow(this);
    }
    
    public MenuPrincipal getMenu(){
        return menu;
    }
    
    public BasePedidos getBase(){
        return base;
    }
    
    public VistaCompra getVista(){
        return vista;
    }
    
    public HistorialPedidos getHistorial(){
        return historial;
    }
}
