package bodega;

import Buttons.BotonesPedido;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import Graphics.PaintToolBasePedidos;

/**
 * Subclase de JPanel que maneja los pedido para las compras
 */
public class BasePedidos extends JPanel{
    private int categoria;
    private ListaPedido lista;
    private Ventana window;
    private PaintToolBasePedidos paint;
    
    /**
     * Constructor para la base del pedido a realizar
     * @param window_aux Ventana asociada a la base de pedidos
     */
    public BasePedidos(Ventana window_aux){
        window = window_aux;
        this.setLayout(null);
        this.setBounds(0, 0, window.getWidth(), window.getHeight());
        
        BotonesPedido botones = new BotonesPedido(this);
        paint = new PaintToolBasePedidos();
    }
    
    /**
     * Devuelve la ventana asociada
     * @return Ventana asociada
     */    
    public Ventana getWindow(){
        return window;
    }
    
    /**
     * Método para pintar la base de pedidos
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        paint.paint(this, g);
    }
    
    /**
     * Asigna un int asociado a la categoría a seleccionar
     * @param sel int de categoría a seleccionar
     */
    public void setCategoria(int sel){
        categoria = sel;
    }
    
    /**
     * Devuelve la categoría seleccionada
     * @return int de categoría. 0 = frutas, 1 = verduras, 2 = carnes
     */
    public int getCategoria(){
        return categoria;
    }
    
    /**
     * Genera una nueva lista de pedidos
     * @throws IOException Excepción asociada a las imágenes referenciales de
     * los ítems
     */
    public void nuevaListaPedido() throws IOException{
        lista = new ListaPedido();
    }
    
    /**
     * Devuelve la lista de pedidos con que se está trabajando
     * @return ListaPedido con que se trabaja
     */
    public ListaPedido getListaPedido(){
        return lista;
    }
    
}