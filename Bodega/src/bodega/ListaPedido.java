package bodega;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListaPedido{
    private Item manzana;
    private Item naranja;
    private Item platano;
    private Item lechuga;
    private Item tomate;
    private Item pepino;
    private Item pollo;
    private Item hamburguesa;
    private Item churrasco;
    
    public ListaPedido() {
        manzana = new Item();
        naranja = new Item();
        platano = new Item();
        lechuga = new Item();
        tomate = new Item();
        pepino = new Item();
        pollo = new Item();
        hamburguesa = new Item();
        churrasco = new Item();
    }
    
    public Item getManzana(){
    	return manzana;
    }
    
    public Item getNaranja(){
    	return naranja;
    }
    
    public Item getPlatano(){
    	return platano;
    }
    
    public Item getLechuga(){
    	return lechuga;
    }
    
    public Item getTomate(){
    	return tomate;
    }
    
    public Item getPepino(){
    	return pepino;
    }
    
    public Item getPollo(){
    	return pollo;
    }
    
    public Item getHamburguesa(){
    	return hamburguesa;
    }
    
    public Item getChurrasco(){
    	return churrasco;
    }
}