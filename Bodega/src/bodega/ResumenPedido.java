package bodega;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ResumenPedido{
    private int frutas[];
    private int verduras[];
    private int carnes[];
    
    public ResumenPedido() {
        frutas = new int[]{0,0,0};
        verduras = new int[]{0,0,0};
        carnes = new int[]{0,0,0};
    }
    
    public int[] getFrutas(){
        return frutas;
    }
    
    public int[] getVerduras(){
        return verduras;
    }
    
    public int[] getCarnes(){
        return carnes;
    }
    
    public void sumarFrutas(int index){
        frutas[index]++;
    }
    
    public void sumarVerduras(int index){
        verduras[index]++;
    }
    
    public void sumarCarnes(int index){
        carnes[index]++;
    }
    
    public void restarFrutas(int index){
        if(frutas[index] > 0){
            frutas[index]--;           
        }
    }
    
    public void restarVerduras(int index){
        if(verduras[index] > 0){
           verduras[index]--; 
        }
    }
    
    public void restarCarnes(int index){
        if(carnes[index] > 0){
            carnes[index]--;
        } 
    }
}
