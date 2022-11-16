package bodega;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
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
    
    public ListaPedido() throws IOException {
        manzana = new Item("Manzana");
        naranja = new Item("Naranja");
        platano = new Item("Plátano");
        lechuga = new Item("Lechuga");
        tomate = new Item("Tomate");
        pepino = new Item("Pepino");
        pollo = new Item("Pollo");
        hamburguesa = new Item("Hamburguesa");
        churrasco = new Item("Churrasco");
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