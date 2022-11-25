package bodega;

import java.awt.*;
import javax.swing.*;
import botones.*;
import GUI.*;

public class VistaCompra extends JPanel{
    private Ventana window;
    private VistaAerea aerea;
    private VistaCarro carro;
    private ListaPedido listaActual;
    private PaintToolVistaCompra paint;
    
    public VistaCompra(int anchoVentana, int largoVentana){
        this.setLayout(null);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
        aerea = new VistaAerea(anchoVentana, largoVentana);
        carro = new VistaCarro(anchoVentana, largoVentana);
        BotonesVista botones = new BotonesVista(this);
        paint = new PaintToolVistaCompra(this);
        
    }
    
    public void setWindow (Ventana window_aux){
        window = window_aux;
    }
    
    public Ventana getWindow(){
        return window;
    }
    
    public ListaPedido getListaActual(){
        return listaActual;
    }
    
    public void setListaActual(ListaPedido lista_aux){
        listaActual = lista_aux;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        aerea.paintComponent(g);
        carro.paintComponent(g);
        paint.paintComponent(g);
    }
}
