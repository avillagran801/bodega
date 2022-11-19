package bodega;

import java.awt.*;
import javax.swing.*;

public class BotonesPedido{
    private BasePedidos base;
    
    public BotonesPedido(BasePedidos b_aux){
        base = b_aux;
        selectorCategoria();
        finPedido();
        cantidadProducto();
    }
    
    private void selectorCategoria(){       
        JButton frutas = new JButton("Frutas");
        frutas.setBounds(20, 100, 130, 60);
        frutas.setBorderPainted(false);
        frutas.setContentAreaFilled(false);
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
    
    private void finPedido(){
        JButton finPedido = new JButton("Finalizar Pedido");
        finPedido.setBounds(980, 680, 190, 40);
        finPedido.setBorderPainted(false);
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
                
                base.repaint();
            }
        });

        base.add(finPedido);
    }
    
    private void cantidadProducto(){
        Color rojoOscuro = new Color(158, 42, 43);
        Color verde = new Color(52, 78, 65);
        
        JButton mas0 = new JButton();
        mas0.setBounds(850, 140, 25, 25);
        mas0.setBorderPainted(false);
        mas0.setBackground(verde);
        
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
        menos0.setBackground(rojoOscuro);
        
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
        mas1.setBackground(verde);
        
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
        menos1.setBackground(rojoOscuro);
        
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
        mas2.setBackground(verde);
        
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
        menos2.setBackground(rojoOscuro);
        
        menos2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restarProducto(2);
                base.repaint();
            }
        });

        base.add(mas0);
        base.add(menos0);
        base.add(mas1);
        base.add(menos1);
        base.add(mas2);
        base.add(menos2);
    }
    
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