package bodega;
import java.awt.*;
import javax.swing.*;


public class VentanaPedido extends JFrame {
    private ResumenPedido res;
    private BasePedidos base;
    private MenuPrincipal principal;

    public VentanaPedido() {
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Pedido");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        res = new ResumenPedido(this.getWidth(), this.getHeight());
        base = new BasePedidos(this.getWidth(), this.getHeight());
        principal = new MenuPrincipal(this.getWidth(), this.getHeight());
        
        setWindowInComponents();
        
        this.getContentPane().add(res);
        this.getContentPane().add(base);
        this.getContentPane().add(principal);
        
        this.principal.setVisible(true);
        this.base.setVisible(false);
        this.res.setVisible(false);
        
        this.setComponentZOrder(principal, 0);
        this.setComponentZOrder(res, 2);
        this.setComponentZOrder(base, 3);
    }
    
    private void setWindowInComponents(){
        principal.setWindow(this);
    }
    
    public MenuPrincipal getMenu(){
        return principal;
    }
    
    public ResumenPedido getResumen(){
        return res;
    }
    
    public BasePedidos getBase(){
        return base;
    }
}
