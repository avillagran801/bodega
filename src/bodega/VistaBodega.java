package bodega;
import java.awt.*;
import javax.swing.*;

public class VistaBodega extends JPanel{
    
    private Ventana window;
    
    VistaBodega(int anchoVentana, int largoVentana){
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        this.setBackground(Color.RED);
    }
    
    public void setWindow (Ventana window_aux){
        window = window_aux;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //g.setColor(Color.RED);
        //g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        Font letraMediana = new Font("SansSerif.", 1, 20);
        g.setFont(letraMediana);
        g.drawString("Aquí va la vista de la bodega", 200, 600);
    }
}
