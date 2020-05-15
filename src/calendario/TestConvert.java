package calendario;

import org.junit.Test;

import static org.junit.Assert.*;

//TODO: Auto-generated Javadoc

/**
 * The Class TestConvert.
 */
public class TestConvert {

    /**
     * Test convert 1.
     */
    @Test
    public void testConvert1() {
        assertEquals("Lunedi", Calendario.convert(1));
    }

    /**
     * Test convert 2.
     */
    @Test
    public void testConvert2() {
        assertEquals("Martedi", Calendario.convert(2));
    }

    /**
     * Test convert 3.
     */
    @Test
    public void testConvert3() {
        assertEquals("Mercoledi", Calendario.convert(3));
    }

    /**
     * Test convert 4.
     */
    @Test
    public void testConvert4() {
        assertEquals("Giovedi", Calendario.convert(4));
    }

    /**
     * Test convert 5.
     */
    @Test
    public void testConvert5() {
        assertEquals("Venerdi", Calendario.convert(5));
    }

    /**
     * Test convert 6.
     */
    @Test
    public void testConvert6() {
        assertEquals("Sabato", Calendario.convert(6));
    }

    /**
     * Test convert 7.
     */
    @Test
    public void testConvert7() {
        assertEquals("Domenica", Calendario.convert(0));
    }

    /**
     * Test convert 8.
     */
    @Test
    public void testConvert8() {
        assertEquals("Errore", Calendario.convert(-1));
    }

    /**
     * Test convert 9.
     */
    @Test
    public void testConvert9() {
        assertEquals("Errore", Calendario.convert(10));
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
