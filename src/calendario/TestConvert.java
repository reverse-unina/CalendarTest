package calendario;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConvert {

	@Test
	public void testConvert1() {
		assertEquals("Lunedi",Calendario.convert(1));
	}
	@Test
	public void testConvert2() {
		assertEquals("Martedi",Calendario.convert(2));
	}
	@Test
	public void testConvert3() {
		assertEquals("Mercoledi",Calendario.convert(3));
	}
	@Test
	public void testConvert4() {
		assertEquals("Giovedi",Calendario.convert(4));
	}
	@Test
	public void testConvert5() {
		assertEquals("Venerdi",Calendario.convert(5));
	}
	@Test
	public void testConvert6() {
		assertEquals("Sabato",Calendario.convert(6));
	}
	@Test
	public void testConvert7() {
		assertEquals("Domenica",Calendario.convert(0));
	}
	@Test
	public void testConvert8() {
		assertEquals("Errore",Calendario.convert(-1));
	}
	@Test
	public void testConvert9() {
		assertEquals("Errore",Calendario.convert(10));
	}
	
}
