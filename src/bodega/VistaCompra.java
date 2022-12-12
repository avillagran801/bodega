package bodega;

import Graphics.VistaCarro;
import Graphics.VistaAerea;
import Buttons.BotonesVista;
import Graphics.PaintToolVistaCompra;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Subclase de JPanel en que aparece la animación de la compra
 */
public class VistaCompra extends JPanel{
    private Ventana window;
    private VistaAerea aerea;
    private VistaCarro carro;
    private ListaPedido listaActual;
    private PaintToolVistaCompra paint;
    
    /**
     * Constructor de VistaCompra
     * @param window_aux Ventana asociada a la vista de compra
     */
    public VistaCompra(Ventana window_aux){
        window = window_aux;
        this.setLayout(null);
        this.setBounds(0, 0, window.getWidth(), window.getHeight());
        
        aerea = new VistaAerea(window.getWidth(), window.getHeight(), this);
        carro = new VistaCarro(window.getWidth(), window.getHeight(), aerea);
        BotonesVista botones = new BotonesVista(this);
        paint = new PaintToolVistaCompra(this);
    }
    
    /**
     * Devuelve la ventana asociada a la vista de compra
     * @return Ventana asociada
     */
    public Ventana getWindow(){
        return window;
    }
    
    /**
     * Devuelve la vista aérea
     * @return VistaAerea
     */
    public VistaAerea getAerea(){
        return aerea;
    }
    
    /**
     * Devuelve la lista de pedidos actual
     * @return ListaPedido actual
     */
    public ListaPedido getListaActual(){
        return listaActual;
    }
    
    /**
     * Asigna la lista de pedidos actual
     * @param lista_aux ListaPedido a asignar como actual
     */
    public void setListaActual(ListaPedido lista_aux){
        listaActual = lista_aux;
    }
    
    /**
     * Método para pintar
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        aerea.paintComponent(g);
        carro.paintComponent(g);
        paint.paintComponent(g);
    }
}
