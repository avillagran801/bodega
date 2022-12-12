/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bodega;

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ana
 */
public class BasePedidosTest {
    private Ventana vent;
    
    public BasePedidosTest() {
    }
    
    @Before
    public void setUp() {
        vent = new Ventana();
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of setCategoria method, of class BasePedidos.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        int sel = 0;
        BasePedidos instance = vent.getBase();
        instance.setCategoria(sel);
    }

    /**
     * Test of getCategoria method, of class BasePedidos.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        BasePedidos instance = vent.getBase();
        int expResult = 0;
        int result = instance.getCategoria();
        assertSame(expResult, result);
    }

    /**
     * Test of nuevaListaPedido method, of class BasePedidos.
     */
    @Test
    public void testNuevaListaPedido() throws Exception {
        System.out.println("nuevaListaPedido");
        BasePedidos instance = vent.getBase();
        instance.nuevaListaPedido();
    }
    
}
