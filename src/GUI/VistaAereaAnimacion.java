package GUI;

import bodega.VistaAerea;
import java.awt.*;
import javax.swing.*;

public class VistaAereaAnimacion extends JPanel{
    
    Graphics g;
    private Thread animationThread;
    
    public Thread getThread(){
        return animationThread;
    }
    
    public VistaAereaAnimacion(VistaAerea va, Graphics g_aux){
        g = g_aux;
        
        if(va.isVisible()){
            animationThread = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 100; i <400; i++){
                    g.setColor(Color.LIGHT_GRAY);
                    g.fillRect(i, 130, 80, 100);
                    g.setColor(Color.RED);
                    g.fillRect(i, 130, 80, 10);
                    try {
                            Thread.sleep(100);
                            va.repaint();
                            Thread.sleep(5);
                    } catch (Exception e){
                            System.err.println(""+e.getMessage());
                        }
                    }
                }
            });
        animationThread.start();
        }
    }
}
