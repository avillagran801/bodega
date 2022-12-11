package bodega;

import java.util.Calendar;

/**
 * Clase para la lista de pedidos. Contiene 9 ítems de distinto tipo y la fecha
 * asociada al pedido
 */
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
    private Calendar fecha;
    
    /**
     * Constructor para generar una nueva lista de pedidos
     */
    public ListaPedido(){
        manzana = new Item("Manzana", "(1 kilo)", "kilo(s)" ,"/res/manzana.png");
        naranja = new Item("Naranja", "(1 kilo)", "kilo(s)", "/res/naranja.png");
        platano = new Item("Plátano", "(1 kilo)", "kilo(s)", "/res/platano.png");
        lechuga = new Item("Lechuga", "(1 unidad)","unidad(es)", "/res/lechuga.png");
        tomate = new Item("Tomate", "(1 kilo)", "kilo(s)", "/res/tomate.png");
        pepino = new Item("Pepino", "(1 unidad)", "unidad(es)", "/res/pepino.png");
        pollo = new Item("Pollo", "(1 kilo)", "kilo(s)", "/res/pollo.png");
        hamburguesa = new Item("Hamburguesa", "(1 unidad)", "unidad(es)", "/res/hamburguesa.png");
        churrasco = new Item("Churrasco", "(1 unidad)", "unidad(es)","/res/churrasco.png");
        fecha = Calendar.getInstance();
    }
    
    /**
     * Devuelve la fecha y hora en que se generó el pedido
     * @return Calendar asociado al pedido
     */
    public Calendar getFecha(){
        return fecha;
    }
    
    /**
     * Devuelve el ítem manzana
     * @return Item manzana
     */
    public Item getManzana(){
    	return manzana;
    }
    
    /**
     * Devuelve el ítem naranja
     * @return Item naranja
     */
    public Item getNaranja(){
    	return naranja;
    }
    
    /**
     * Devuelve el ítem plátano
     * @return Item platano
     */
    public Item getPlatano(){
    	return platano;
    }
    
    /**
     * Devuelve el ítem lechuga
     * @return Item lechuga
     */
    public Item getLechuga(){
    	return lechuga;
    }
    
    /**
     * Devuelve el ítem tomate
     * @return Item tomate
     */
    public Item getTomate(){
    	return tomate;
    }
    
    /**
     * Devuelve el ítem pepino
     * @return Item pepino
     */
    public Item getPepino(){
    	return pepino;
    }
    
    /**
     * Devuelve el ítem pollo
     * @return Item pollo
     */
    public Item getPollo(){
    	return pollo;
    }
    
    /**
     * Devuelve el ítem hamburguesa
     * @return Item hamburguesa
     */
    public Item getHamburguesa(){
    	return hamburguesa;
    }
    
    /**
     * Devuelve el ítem churrasco
     * @return Item churrasco
     */
    public Item getChurrasco(){
    	return churrasco;
    }
}