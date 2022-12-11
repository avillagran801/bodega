package Graphics;

import java.awt.*;
import javax.swing.*;
import bodega.*;

public class PaintToolItem extends JPanel{
    private Item item;
    
    public PaintToolItem(Item item_aux){
        item = item_aux;
    }
    
    public void paintComponent(Graphics g, int imagenY, int textoY){
        g.drawImage(item.getImagen(), 200, imagenY, 120, 120, 
                null);

        g.setColor(Color.white);
        Font letraMediana = new Font("SansSerif.", 1, 18);
        Font letraPequena = new Font("SansSerif.", 3, 12);
        Font letraDescripcion = new Font("SansSerif.", 3, 14);

        g.setFont(letraMediana);
        g.drawString(item.getNombre(), 360, textoY);

        g.setFont(letraPequena);
        g.drawString(""+ item.getCantidad(), 810, textoY+18);

        g.setFont(letraDescripcion);
        g.drawString(item.getDescripcion(), 360, textoY+20);
    }
}
