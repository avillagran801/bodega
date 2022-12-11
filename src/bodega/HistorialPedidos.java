package bodega;

import Buttons.BotonesHistorial;
import Graphics.PaintToolHistorialPedidos;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Subclase de JPanel en que se guarda el historial de pedidos
 */
public class HistorialPedidos extends JPanel {
    private ArrayList<ListaPedido> pedidos;
    private Ventana window;
    private PaintToolHistorialPedidos paint;
    private JScrollPane deslizador;
    
    /**
     * Constructor del historial de pedidos
     * @param window_aux Ventana asociada al historial
     */
    public HistorialPedidos(Ventana window_aux){
        window = window_aux;
        this.setLayout(null);
        this.setBackground(new Color(54, 73, 88));
        this.setBounds(0, 0, window.getWidth(), window.getHeight());
        this.setPreferredSize(new Dimension(window.getWidth(), window.getHeight()));
        
        pedidos = new ArrayList<ListaPedido>(); 
        paint = new PaintToolHistorialPedidos(this);
        
        BotonesHistorial botones = new BotonesHistorial(this);

        deslizador = new JScrollPane(paint);
        deslizador.setBounds(0,100, this.getWidth()-12, this.getHeight()-120);
        deslizador.getVerticalScrollBar().setUnitIncrement(16);
        deslizador.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        this.add(deslizador);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        deslizador.revalidate();
    }
    
    /**
     * Agrega una nueva lista de pedidos al historial
     * @param nuevaLista ListaPedido a agregar
     */
    public void agregarLista(ListaPedido nuevaLista){
        pedidos.add(nuevaLista);
    }
    
    /**
     * Devuelve la ventana que se le asocia
     * @return 
     */
    public Ventana getWindow(){
        return window;
    }
    
    /**
     * Devuelve el arreglo en que se almacenan los pedidos
     * @return ArrayList de ListaPedido
     */
    public ArrayList getPedidos(){
        return pedidos;
    }    
}