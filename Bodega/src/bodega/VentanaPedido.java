package bodega;
import java.awt.*;
import javax.swing.*;


public class VentanaPedido extends JFrame {
    private SelectorCategorias selCat;
    private ResumenPedido res;
    private BasePedidos base;

    public VentanaPedido() {
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Pedido");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        selCat = new SelectorCategorias(this.getWidth(), this.getHeight());
        res = new ResumenPedido(this.getWidth(), this.getHeight());
        base = new BasePedidos(this.getWidth(), this.getHeight());
        
        this.getContentPane().add(selCat);
        this.getContentPane().add(res);
        this.getContentPane().add(base);
        
        this.setComponentZOrder(selCat, 0);
        this.setComponentZOrder(res, 1);
        this.setComponentZOrder(base, 2);
    }
}
