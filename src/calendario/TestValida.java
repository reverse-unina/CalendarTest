package calendario;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValida {

	@Test
	public void testValida1() {
		assertFalse(Calendario.valida(1, 1, 1492));
	}
	@Test
	public void testValida2() {
		assertFalse(Calendario.valida(-1, 1, 2020));
	}	
	@Test
	public void testValida3() {
		assertFalse(Calendario.valida(101, 1, 2020));
	}	
	@Test
	public void testValida4() {
		assertFalse(Calendario.valida(1, 0, 2020));
	}	
	@Test
	public void testValida5() {
		assertTrue(Calendario.valida(29, 2, 2020));
	}
	@Test
	public void testValida6() {
		assertTrue(Calendario.valida(29, 2, 2020));
	}
}
