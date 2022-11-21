package bodega;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;


public class HistorialPedidos extends JPanel {
    private ArrayList<ListaPedido> pedidos;
    private Ventana window;
    
    public HistorialPedidos(int anchoVentana, int largoVentana){     
        this.setLayout(null);
        this.setBackground(Color.darkGray);
        this.setBounds(0, 0, anchoVentana, largoVentana);
        
        pedidos = new ArrayList<ListaPedido>();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    public void agregarLista(ListaPedido nuevaLista){
        pedidos.add(nuevaLista);
    }
    
    public void setWindow (Ventana window_aux){
        window = window_aux;
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