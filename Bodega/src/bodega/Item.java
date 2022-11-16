package bodega;

public class Item{
	private int cantidad;
	
	public Item(){
		cantidad = 0;
	}
	
	public void sumarCantidad(){
		cantidad++;
	}
	
	public void restarCantidad(){
		if(cantidad > 0){
			cantidad--;
		}
	}
	
	public int getCantidad(){
		return cantidad;
	}
}