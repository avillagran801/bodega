package bodega;

import botones.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import GUI.PaintToolBasePedidos;

public class BasePedidos extends JPanel{
    private int categoria;
    private ListaPedido lista;
    private Ventana window;
    private PaintToolBasePedidos paint;
    
    public BasePedidos(int anchoVentana, int largoVentana) throws IOException{
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
        BotonesPedido botones = new BotonesPedido(this);
        paint = new PaintToolBasePedidos();
    }
    
    public void setWindow(Ventana window_aux) {
        window = window_aux;
    }
    
    public Ventana getWindow(){
        return window;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        paint.paint(this, g);
    }
    
    public void setCategoria(int sel){
        categoria = sel;
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public void nuevaListaPedido() throws IOException{
        lista = new ListaPedido();
    }
    
    public ListaPedido getListaPedido(){
        return lista;
    }
    
}