package bodega;

import java.io.IOException;

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
        manzana = new Item("Manzana", "(1 kilo)", "kilo(s)" ,"/res/manzana.png");
        naranja = new Item("Naranja", "(1 kilo)", "kilo(s)", "/res/naranja.png");
        platano = new Item("Plátano", "(1 kilo)", "kilo(s)", "/res/platano.png");
        lechuga = new Item("Lechuga", "(1 unidad)","unidad(es)", "/res/lechuga.png");
        tomate = new Item("Tomate", "(1 kilo)", "kilo(s)", "/res/tomate.png");
        pepino = new Item("Pepino", "(1 unidad)", "unidad(es)", "/res/pepino.png");
        pollo = new Item("Pollo", "(1 kilo)", "kilo(s)", "/res/pollo.png");
        hamburguesa = new Item("Hamburguesa", "(1 unidad)", "unidad(es)", "/res/hamburguesa.png");
        churrasco = new Item("Churrasco", "(1 unidad)", "unidad(es)","/res/churrasco.png");
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