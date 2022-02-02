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
        assertEquals( Math.abs(Math.log(0)), this.pil.calculate("1 0 / 3+")); // validar este test
        assertEquals(15, this.pil.calculate("1 2 + 4 * 3 +"));       
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
