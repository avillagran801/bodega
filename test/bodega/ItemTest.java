/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bodega;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
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
public class ItemTest {
    private Item manzana;
    
    public ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        manzana = new Item("Manzana", "(1 kilo)", "kilo(s)" ,"/res/manzana.png");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumarCantidad method, of class Item.
     */
    @Test
    public void testSumarCantidad() {
        System.out.println("sumarCantidad");
        Item instance = manzana;
        instance.sumarCantidad();
        instance.sumarCantidad();
        instance.sumarCantidad();
        int expResult = 3;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Error al sumar la cantidad");
    }

    /**
     * Test of restarCantidad method, of class Item.
     */
    @Test
    public void testRestarCantidad() {
        System.out.println("restarCantidad");
        Item instance = manzana;
        instance.restarCantidad();
        instance.restarCantidad();
        instance.restarCantidad();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Error al restar la cantidad");
    }

    /**
     * Test of getCantidad method, of class Item.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Item instance = manzana;
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Error al obtener la cantidad");
    }

    /**
     * Test of getNombre method, of class Item.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Item instance = manzana;
        String expResult = "Manzana";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Error al obtener el nombre");
    }

    /**
     * Test of getDescripcion method, of class Item.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Item instance = manzana;
        String expResult = "(1 kilo)";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Error al obtener la descripción");
    }
    
}
