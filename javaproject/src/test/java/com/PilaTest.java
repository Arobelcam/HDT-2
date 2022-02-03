package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;



/**
 * Unit test for simple App.
 */
class PilaTest {

    Vector <Double> vector = new Vector<>(); 
        Double p = 1.00;
        Double p2 = 2.00;
    private Pila pil;    // Se instancia la clase Pila
    @BeforeEach 
    void setBefore() {
        pil = new Pila();
        
    }

    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
  
    @Test
    void testAdd() {
        vector.add(p);
        assertEquals(1.00, vector.get(size()));
        vector.add(p2);
        assertEquals(1.00, vector.get(size()), 0.01);

        
        
    }

    private int size() {
        return 0;
    }

    @Test
    void testCalculate() throws Exception {
        assertEquals( Math.abs(Math.log(0)), this.pil.calculate("1 0 / 3+")); // validar este test
        assertEquals(15, this.pil.calculate("1 2 + 4 * 3 +"));       
    }

    @Test
    void testEmptoy() {
        vector.add(p);
        assertEquals(false, vector.isEmpty());
        vector.remove(p);
        assertEquals(true, vector.isEmpty());   
    }

    @Test
    void testPeek() {
        vector.add(p);
        assertEquals(1.0, vector.get(size()), 0.01);        
    }


    @Test
    void testRemove() {
        vector.add(p);
        vector.add(p2);
        assertEquals(1.00, vector.get(size()), 0.01);
        vector.remove(p2);
        //assertEquals(15.0, vector.remove(p2), 0.01);
        
    }
    @Test
    void testSize() {
        vector.add(p);
        assertEquals(1, vector.size());
        vector.add(p);
        assertEquals(2, vector.size());
    }

    @Test
    void Empty() {
        vector.add(p);
        assertEquals(false, vector.isEmpty());
        vector.remove(p);
        assertEquals(true, vector.isEmpty());      
    }
    
}
