package calendario;

import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestGiornoDellaSettimana.
 */
public class TestGiornoDellaSettimana {

	/**
	 * Test giorno della settimana 1.
	 */
	//TEST BLACK BOX
	@Test
	public void testGiornoDellaSettimana1() {
		assertEquals("Lunedi",Calendario.giornoDellaSettimana(11, "maggio", 2020));
	}
	
	/**
	 * Test giorno della settimana 2.
	 */
	@Test
	public void testGiornoDellaSettimana2() {
		assertEquals("Martedi",Calendario.giornoDellaSettimana(12, "maggio", 2020));
	}
	
	/**
	 * Test giorno della settimana 3.
	 */
	@Test
	public void testGiornoDellaSettimana3() {
		assertEquals("Mercoledi",Calendario.giornoDellaSettimana(13, "maggio", 2020));
	}
	
	/**
	 * Test giorno della settimana 4.
	 */
	@Test
	public void testGiornoDellaSettimana4() {
		assertEquals("Giovedi",Calendario.giornoDellaSettimana(14, "maggio", 2020));
	}
	
	/**
	 * Test giorno della settimana 5.
	 */
	@Test
	public void testGiornoDellaSettimana5() {
		assertEquals("Venerdi",Calendario.giornoDellaSettimana(15, "maggio", 2020));
	}
	
	/**
	 * Test giorno della settimana 6.
	 */
	@Test
	public void testGiornoDellaSettimana6() {
		assertEquals("Sabato",Calendario.giornoDellaSettimana(16, "maggio", 2020));
	}
	
	/**
	 * Test giorno della settimana 7.
	 */
	@Test
	public void testGiornoDellaSettimana7() {
		assertEquals("Domenica",Calendario.giornoDellaSettimana(17, "maggio", 2020));
	}
	
	/**
	 * Test giorno della settimana 8.
	 */
	@Test
	public void testGiornoDellaSettimana8() {
		assertEquals("Errore",Calendario.giornoDellaSettimana(32, "maggio", 2020));
	}

	/**
	 * Test giorno della settimana 11.
	 */
	//TEST WHITE BOX
		@Test
		public void testGiornoDellaSettimana11() {
			assertEquals("Lunedi",Calendario.giornoDellaSettimana(11, "maggio", 2020));
		}
		
		/**
		 * Test giorno della settimana 12.
		 */
		@Test
		public void testGiornoDellaSettimana12() {
			assertEquals("Sabato",Calendario.giornoDellaSettimana(11, "gennaio", 2020));
		}
		
		/**
		 * Test giorno della settimana 13.
		 */
		@Test
		public void testGiornoDellaSettimana13() {
			assertEquals("Martedi",Calendario.giornoDellaSettimana(11, "febbraio", 2020));
		}
		
		/**
		 * Test giorno della settimana 14.
		 */
		@Test
		public void testGiornoDellaSettimana14() {
			assertEquals("Mercoledi",Calendario.giornoDellaSettimana(11, "marzo", 2020));
		}
		
		/**
		 * Test giorno della settimana 15.
		 */
		@Test
		public void testGiornoDellaSettimana15() {
			assertEquals("Sabato",Calendario.giornoDellaSettimana(11, "aprile", 2020));
		}
		
		/**
		 * Test giorno della settimana 16.
		 */
		@Test
		public void testGiornoDellaSettimana16() {
			assertEquals("Giovedi",Calendario.giornoDellaSettimana(11, "giugno", 2020));
		}
		
		/**
		 * Test giorno della settimana 17.
		 */
		@Test
		public void testGiornoDellaSettimana17() {
			assertEquals("Sabato",Calendario.giornoDellaSettimana(11, "luglio", 2020));
		}
		
		/**
		 * Test giorno della settimana 18.
		 */
		@Test
		public void testGiornoDellaSettimana18() {
			assertEquals("Martedi",Calendario.giornoDellaSettimana(11, "agosto", 2020));
		}
		
		/**
		 * Test giorno della settimana 19.
		 */
		@Test
		public void testGiornoDellaSettimana19() {
			assertEquals("Venerdi",Calendario.giornoDellaSettimana(11, "settembre", 2020));
		}
		
		/**
		 * Test giorno della settimana 20.
		 */
		@Test
		public void testGiornoDellaSettimana20() {
			assertEquals("Errore",Calendario.giornoDellaSettimana(11, "brumaio", 2020));
		}
		
		/**
		 * Test giorno della settimana 21.
		 */
		@Test
		public void testGiornoDellaSettimana21() {
			assertEquals("Domenica",Calendario.giornoDellaSettimana(11, "ottobre", 2020));
		}
		
		/**
		 * Test giorno della settimana 22.
		 */
		@Test
		public void testGiornoDellaSettimana22() {
			assertEquals("Mercoledi",Calendario.giornoDellaSettimana(11, "novembre", 2020));
		}
		
		/**
		 * Test giorno della settimana 23.
		 */
		@Test
		public void testGiornoDellaSettimana23() {
			assertEquals("Venerdi",Calendario.giornoDellaSettimana(11, "dicembre", 2020));
		}
	
}
