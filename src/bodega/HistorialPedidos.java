package bodega;

import GUI.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import botones.*;


public class HistorialPedidos extends JPanel {
    private ArrayList<ListaPedido> pedidos;
    private Ventana window;
    private PaintToolHistorialPedidos paint;
    private JScrollPane deslizador;
    
    public HistorialPedidos(int anchoVentana, int largoVentana){     
        this.setLayout(null);
        this.setBackground(new Color(54, 73, 88));
        this.setBounds(0, 0, anchoVentana, largoVentana);
        this.setPreferredSize(new Dimension(anchoVentana, largoVentana));
        
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
    
    public void agregarLista(ListaPedido nuevaLista){
        pedidos.add(nuevaLista);
    }
    
    public void setWindow (Ventana window_aux){
        window = window_aux;
    }
    
    public Ventana getWindow(){
        return window;
    }
    
    public ArrayList getPedidos(){
        return pedidos;
    }
    
    // Método solamente para probar en la consola
    public void imprimirPedidos(){
        if(pedidos != null){
            for(int i=0; i<pedidos.size(); ++i){
                System.out.println("*** PEDIDO NÚMERO " + i + "***");
                
                System.out.println("Manzana: " + pedidos.get(i).getManzana().getCantidadConUnidad());
                System.out.println("Naranja: " + pedidos.get(i).getNaranja().getCantidadConUnidad());
                System.out.println("Plátano: " + pedidos.get(i).getPlatano().getCantidadConUnidad());
                System.out.println("Lechuga: " + pedidos.get(i).getLechuga().getCantidadConUnidad());
                System.out.println("Tomate: " + pedidos.get(i).getTomate().getCantidadConUnidad());
                System.out.println("Pepino: " + pedidos.get(i).getPepino().getCantidadConUnidad());
                System.out.println("Pollo: " + pedidos.get(i).getPollo().getCantidadConUnidad());
                System.out.println("Hamburguesa: " + pedidos.get(i).getHamburguesa().getCantidadConUnidad());
                System.out.println("Churrasco: " + pedidos.get(i).getChurrasco().getCantidadConUnidad());
                
                System.out.println("\n");
            }
        }
    }
    
}