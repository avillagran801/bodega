package Buttons;

import bodega.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Botones asociados a la base de pedidos
 */
public class BotonesPedido{
    private BasePedidos base;
    
    /**
     * Método constructor para BotonesPedido
     * @param b_aux Base en que aparecerán los botones
     */
    public BotonesPedido(BasePedidos b_aux){
        base = b_aux;
        selectorCategoria();
        finPedido();
        cantidadProducto();
    }

    /**
     * Permite cambiar entre las categorías de fruta, verduras y carnes
     */
    private void selectorCategoria(){       
        JButton frutas = new JButton("Frutas");
        frutas.setBounds(20, 100, 130, 60);
        frutas.setBorderPainted(false);
        frutas.setContentAreaFilled(false);
        frutas.setFocusPainted(false);
        frutas.setForeground(Color.white);
        frutas.setFont(new Font("SansSerif.", 1, 16));
        
        frutas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base.setCategoria(0);
                base.repaint();
            }
        });
        
        JButton verduras = new JButton("Verduras");
        verduras.setBounds(20, 180, 130, 60);
        verduras.setBorderPainted(false);
        verduras.setContentAreaFilled(false);
        verduras.setFocusPainted(false);
        verduras.setForeground(Color.white);        
        verduras.setFont(new Font("SansSerif.", 1, 16));

        verduras.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base.setCategoria(1);
                base.repaint();
            }
        });
        
        JButton carnes = new JButton("Carnes");
        carnes.setBounds(20, 260, 130, 60);
        carnes.setBorderPainted(false);
        carnes.setContentAreaFilled(false);
        carnes.setFocusPainted(false);
        carnes.setForeground(Color.white);
        carnes.setFont(new Font("SansSerif.", 1, 16));        
        
        carnes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base.setCategoria(2);
                base.repaint();
            }
        });
        
        base.add(verduras);
        base.add(frutas);
        base.add(carnes);
    }
    
    /**
     * Finaliza el pedido y entrega esta lista al historial y a la vista de
     * compra
     */
    private void finPedido(){
        JButton finPedido = new JButton("Finalizar Pedido");
        finPedido.setBounds(980, 680, 190, 40);
        finPedido.setBorderPainted(false);
        finPedido.setFocusPainted(false);
        finPedido.setBackground(Color.white);
        finPedido.setForeground(Color.black);
        finPedido.setFont(new Font("SansSerif.", 1, 16));
        
        finPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base.getWindow().setComponentZOrder(base.getWindow().getMenu(), 1);
                base.getWindow().setComponentZOrder(base, 2);
                base.getWindow().setComponentZOrder(base.getWindow().getVista(), 0);
                
                base.getWindow().getMenu().setVisible(false);
                base.setVisible(false);
                base.getWindow().getVista().setVisible(true);
                
                base.getWindow().getHistorial().agregarLista(base.getListaPedido());
                base.getWindow().getVista().setListaActual(base.getListaPedido());
                base.setCategoria(0);
                
                base.repaint();
                base.getWindow().getVista().getAerea().temporizador.start();
            }
        });

        base.add(finPedido);
    }    
   
    /**
     * Botones para sumar o restar la cantidad que se quiere comprar de un ítem
     */
    private void cantidadProducto(){        
        JButton mas0 = new JButton();
        mas0.setBounds(850, 140, 25, 25);
        mas0.setBorderPainted(false);
        mas0.setContentAreaFilled(false);
        mas0.setFocusPainted(false);

        mas0.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumarProducto(0);
                base.repaint();
            }
        });
        
        JButton menos0 = new JButton();
        menos0.setBounds(750, 140, 25, 25);
        menos0.setBorderPainted(false);
        menos0.setContentAreaFilled(false);
        menos0.setFocusPainted(false);
        
        menos0.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restarProducto(0);
                base.repaint();
            }
        });
        
        JButton mas1 = new JButton();
        mas1.setBounds(850, 340, 25, 25);
        mas1.setBorderPainted(false);
        mas1.setContentAreaFilled(false);
        mas1.setFocusPainted(false);
        
        mas1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumarProducto(1);
                base.repaint();
            }
        });
        
        JButton menos1 = new JButton();
        menos1.setBounds(750, 340, 25, 25);
        menos1.setBorderPainted(false);
        menos1.setContentAreaFilled(false);
        menos1.setFocusPainted(false);
        
        menos1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restarProducto(1);
                base.repaint();
            }
        });
        
        JButton mas2 = new JButton();
        mas2.setBounds(850, 540, 25, 25);
        mas2.setBorderPainted(false);
        mas2.setContentAreaFilled(false);
        mas2.setFocusPainted(false);
        
        mas2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumarProducto(2);
                base.repaint();
            }
        });

        JButton menos2 = new JButton();
        menos2.setBounds(750, 540, 25, 25);
        menos2.setBorderPainted(false);
        menos2.setContentAreaFilled(false);
        menos2.setFocusPainted(false);
        
        menos2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restarProducto(2);
                base.repaint();
            }
        });
        
        try {
            // Obtiene imagen
            Image img = ImageIO.read(getClass().getResourceAsStream("/res/plusWhite.png"));
            
            // Escala la imagen
            Image newImg = img.getScaledInstance(mas0.getWidth(), mas0.getHeight(),Image.SCALE_DEFAULT);
            
            // Asigna la imagen como ícono al botón
           mas0.setIcon(new ImageIcon(newImg));
           mas1.setIcon(new ImageIcon(newImg));
           mas2.setIcon(new ImageIcon(newImg));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        try {
            // Obtiene imagen
            Image img = ImageIO.read(getClass().getResourceAsStream("/res/minusWhite.png"));

            // Escala la imagen
            Image newImg = img.getScaledInstance(mas0.getWidth(), mas0.getHeight(), Image.SCALE_DEFAULT);

            // Asigna la imagen como ícono al botón
            menos0.setIcon(new ImageIcon(newImg));
            menos1.setIcon(new ImageIcon(newImg));
            menos2.setIcon(new ImageIcon(newImg));
        } catch (Exception ex) {
            System.out.println(ex);
        }

        base.add(mas0);
        base.add(menos0);
        base.add(mas1);
        base.add(menos1);
        base.add(mas2);
        base.add(menos2);
    }
    
    /**
     * Función que interactúa con el ítem para aumentar en 1 su cantidad
     * @param numBoton Botón presionado
     */
    private void sumarProducto(int numBoton){
        switch(base.getCategoria()){
            case 0:      
            	switch(numBoton){
            		case 0:
            			base.getListaPedido().getManzana().sumarCantidad();
            			break;
            			
            		case 1:
            			base.getListaPedido().getNaranja().sumarCantidad();
            			break;
            			
            		case 2:
            			base.getListaPedido().getPlatano().sumarCantidad();
            			break;
            	}
                break;
            	
            case 1:
            	switch(numBoton){
            	 	case 0:
            	 	  base.getListaPedido().getLechuga().sumarCantidad();
            	 	  break;
            	 	  
            	 	 case 1:
            	 	 	base.getListaPedido().getTomate().sumarCantidad();
            	 	 	break;
            	 	 	
            	 	 case 2:
            	 	 	base.getListaPedido().getPepino().sumarCantidad();
            	 	 	break;
            	}
                break;
                
            case 2:
                switch(numBoton){
                	case 0:
                		base.getListaPedido().getPollo().sumarCantidad();
                		break;
                		
                	case 1:
                		base.getListaPedido().getHamburguesa().sumarCantidad();
                		break;
                		
                	case 2:
                		base.getListaPedido().getChurrasco().sumarCantidad();
                		break;
                }
                break;
        }     
    }
    
    /**
    * Función que interactúa con el ítem para disminuir en 1 su cantidad
    * @param numBoton Botón presionado
    */
    private void restarProducto(int numBoton){
        switch(base.getCategoria()){
            case 0:      
            	switch(numBoton){
            		case 0:
            			base.getListaPedido().getManzana().restarCantidad();
            			break;
            			
            		case 1:
            			base.getListaPedido().getNaranja().restarCantidad();
            			break;
            			
            		case 2:
            			base.getListaPedido().getPlatano().restarCantidad();
            			break;
            	}
                break;
            	
            case 1:
            	switch(numBoton){
            	 	case 0:
            	 	  base.getListaPedido().getLechuga().restarCantidad();
            	 	  break;
            	 	  
            	 	 case 1:
            	 	 	base.getListaPedido().getTomate().restarCantidad();
            	 	 	break;
            	 	 	
            	 	 case 2:
            	 	 	base.getListaPedido().getPepino().restarCantidad();
            	 	 	break;
            	}
                break;
                
            case 2:
                switch(numBoton){
                	case 0:
                		base.getListaPedido().getPollo().restarCantidad();
                		break;
                		
                	case 1:
                		base.getListaPedido().getHamburguesa().restarCantidad();
                		break;
                		
                	case 2:
                		base.getListaPedido().getChurrasco().restarCantidad();
                		break;
                }
                break;
        }     
    }
}   