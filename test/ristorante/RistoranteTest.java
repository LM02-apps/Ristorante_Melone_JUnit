/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

import java.util.Vector;
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
public class RistoranteTest {
    
    public RistoranteTest() {
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
     * Test of Tipopiatti method, of class Ristorante.
     */
    @Test
    public void testTipopiatti() {
        System.out.println("Tipopiatti");
        String tipopiatto = "Pasta al pesto";
        Ristorante instance = new Ristorante();
        Vector<Piatto> expResult = null;
        Vector<Piatto> result = instance.Tipopiatti(tipopiatto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AggiuntaPiatto method, of class Ristorante.
     */
    @Test
    public void testAggiuntaPiatto() {
        System.out.println("AggiuntaPiatto");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaPiatto(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RimozionePiatto method, of class Ristorante.
     */
    @Test
    public void testRimozionePiatto() {
        System.out.println("RimozionePiatto");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.RimozionePiatto(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Importomax method, of class Ristorante.
     */
    @Test
    public void testImportomax() {
        System.out.println("Importomax");
        Ristorante instance = new Ristorante();
        int expResult = 0;
        int result = instance.Importomax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IncassoGiornaliero method, of class Ristorante.
     */
    @Test
    public void testIncassoGiornaliero() {
        System.out.println("IncassoGiornaliero");
        Ristorante instance = new Ristorante();
        double expResult = 0.0;
        double result = instance.IncassoGiornaliero();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ristorante.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        int i = 0;
        Ristorante instance = new Ristorante();
        String expResult = "";
        String result = instance.toString(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AggiuntaOrdine method, of class Ristorante.
     */
    @Test
    public void testAggiuntaOrdine() {
        System.out.println("AggiuntaOrdine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaOrdine(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RimozioneOrdine method, of class Ristorante.
     */
    @Test
    public void testRimozioneOrdine() {
        System.out.println("RimozioneOrdine");
        int x = 0;
        Ristorante instance = new Ristorante();
        instance.RimozioneOrdine(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSizemenu method, of class Ristorante.
     */
    @Test
    public void testGetSizemenu() {
        System.out.println("getSizemenu");
        Ristorante instance = new Ristorante();
        int expResult = 0;
        int result = instance.getSizemenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
