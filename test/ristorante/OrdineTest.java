/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Melone
 */
public class OrdineTest {
    
    public OrdineTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addPiatto method, of class Ordine.
     */
    @Test
    public void testAddPiatto() {
        System.out.println("addPiatto");
        Piatto x = new Piatto ("Pasta al ragu", "Primo");
        Ordine instance = new Ordine (1, "Luca");
        instance.addPiatto(x);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removePiatto method, of class Ordine.
     */
    @Test
    public void testRemovePiatto() {
        System.out.println("removePiatto");
        int x = 2;
        Ordine instance = new Ordine (1,"Lucia");
        instance.removePiatto(x);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getprezzo method, of class Ordine.
     */
    @Test
    public void testGetprezzo() {
        System.out.println("getprezzo");
        Ordine instance = new Ordine (1,"Luca");
        double expResult = 1;
        double result = instance.getprezzo();
        assertEquals(expResult, result, 1);

    }

    /**
     * Test of getSize method, of class Ordine.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Ordine instance = new Ordine (1,"Lucia");
        int expResult = 1;
        int result = instance.getSize();
        assertEquals(expResult, result);
 
    }
    
}
