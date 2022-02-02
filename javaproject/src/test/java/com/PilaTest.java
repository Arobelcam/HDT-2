package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;



/**
 * Unit test for simple App.
 */
class PilaTest {
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
        
    }

    @Test
    void testCalculate() throws Exception {
        assertEquals(-0.00001, this.pil.calculate("1 0 /")); // valor de error de defecto
        assertEquals(15, this.pil.calculate("1 2 + 4 * 3 +"));
        assertEquals(-0.00001, this.pil.calculate("oh no")); // valor de defecto      
        assertEquals(6.25, this.pil.calculate("1 4 / 6+"));
    }

    @Test
    void testEmpty() {
        
    }
    @Test
    void testPeek() {
        
    }
    @Test
    void testRemove() {
        
    }
    @Test
    void testSize() {
        
    }

    /**
     * Tests para ver funcionamiento de metodos privados, misma razon por la cual estan comentados
     */
    /*@Test
    void testIsNumber() {
        assertEquals(false, this.pil.isNumber("c"));
    }

    @Test
    void testIsOperator() {
        assertEquals(false, this.pil.isOperator("c"));
        assertEquals(false, this.pil.isOperator(" "));
        assertEquals(false, this.pil.isOperator(""));
        assertEquals(false, this.pil.isOperator("$"));
        assertEquals(true, this.pil.isOperator("+"));
        assertEquals(true, this.pil.isOperator("-"));
    }*/
}
