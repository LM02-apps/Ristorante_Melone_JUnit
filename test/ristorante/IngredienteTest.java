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
public class IngredienteTest {
    
    public IngredienteTest() {
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
     * Test of getPrezzo method, of class Ingrediente.
     */
    @Test
    public void testGetPrezzo() {
        System.out.println("getPrezzo");
        Ingrediente instance = new Ingrediente ("Ragu", 1, 2);
        double expResult = 2;
        double result = instance.getPrezzo();
        assertEquals(expResult, result, 2);
        
        
    }
    
}
