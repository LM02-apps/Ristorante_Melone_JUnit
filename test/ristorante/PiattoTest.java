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
public class PiattoTest {
    
    public PiattoTest() {
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
     * Test of AggiuntaIngredientte method, of class Piatto.
     */
    @Test
    public void testAggiuntaIngredientte() {
        System.out.println("AggiuntaIngredientte");
        Ingrediente x = new Ingrediente ("Pesto", 1, 3);
        Piatto instance = new Piatto ("Pasta al pesto", "Secondo");
        instance.AggiuntaIngredientte(x);

    }

    /**
     * Test of RimozioneIngredientte method, of class Piatto.
     */
    @Test
    public void testRimozioneIngredientte() {
        System.out.println("RimozioneIngredientte");
        Ingrediente x =  new Ingrediente ("Pesto", 1, 3);
        Piatto instance = new Piatto ("Pasta al pesto", "Secondo");
        instance.RimozioneIngredientte(x);

    }

    /**
     * Test of getPre method, of class Piatto.
     */
    @Test
    public void testGetPre() {
        System.out.println("getPre");
        Piatto instance = new Piatto ("Pasta al pesto", "Secondo");;
        double expResult = 1;
        double result = instance.getPre();
        assertEquals(expResult, result, 1);

    }

    /**
     * Test of getTipo method, of class Piatto.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Piatto instance = new Piatto ("Pasta al pesto", "Secondo");;
        String expResult = "Secondo";
        String result = instance.getTipo();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of getNome method, of class Piatto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Piatto instance = new Piatto ("Pasta al pesto", "Secondo");
        String expResult = "Pasta al pesto";
        String result = instance.getNome();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Piatto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Piatto instance = new Piatto ("Pasta al pesto", "Secondo");
        String expResult = "Nome: Pasta al pesto Tipo: Secondo Prezzo: 3";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
