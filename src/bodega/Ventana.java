package bodega;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;


public class Ventana extends JFrame {
    private BasePedidos base;
    private MenuPrincipal principal;
    private VistaBodega vista;

    public Ventana() throws IOException {
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Pedido");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        principal = new MenuPrincipal(this.getWidth(), this.getHeight());
        base = new BasePedidos(this.getWidth(), this.getHeight());
        vista = new VistaBodega(this.getWidth(), this.getHeight());
        
        setWindowInComponents();
        
        this.getContentPane().add(base);
        this.getContentPane().add(principal);
        this.getContentPane().add(vista);
        
        base.setVisible(false);
        vista.setVisible(false);
                
        this.setComponentZOrder(principal, 0);
        this.setComponentZOrder(base, 1);
        this.setComponentZOrder(vista, 2);
        
        repaint();
    }
    
    private void setWindowInComponents(){
        principal.setWindow(this);
        base.setWindow(this);
        vista.setWindow(this);
    }
    
    public MenuPrincipal getMenu(){
        return principal;
    }
    
    public BasePedidos getBase(){
        return base;
    }
    
    public VistaBodega getVista(){
        return vista;
    }
}
