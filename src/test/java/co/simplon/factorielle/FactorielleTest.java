package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTest {
	
	public Factorielle factorielle;

	@Before
	public void initObjet() {
		factorielle = new Factorielle();
	}
	
	@Ignore
	@Test
	public void testCalculerAvecValeur1() {
		
		long resultat = factorielle.calculer(1);
		assertEquals(1, resultat);

	}

	@Test
	public void testCalculerAvecValeur5() {
		
		assertTrue(120 == factorielle.calculer(5));

	}
	
	@Test
	public void testCalculerAvecValeurNulle() {

		
		assertEquals("cas particulier", 1, factorielle.calculer(0));

	}
	
/*	@Test
	public void testCalculerAvecValeurNegative() {
		
		Factorielle factorielle = new Factorielle();
		
		assertEquals(1, factorielle.calculer(-1));

	}*/
	
	@Test
	public void testCalculerAvecValeur10() {
		
		assertEquals(3628800, factorielle.calculer(10));

	}
	
	@Test
	public void testCalculerAvecValeur15() {
		
		assertEquals(1307674368000l, factorielle.calculer(15));

	}

	@Test
	public void testCalculerAvecValeur16() {
		
		assertEquals("erreur introduite volontairement", 1307674368000l, factorielle.calculer(16));

	}

	
	@Ignore
	@Test
	public void testCalculerAvecValeur16Boolean() {
		
		assertTrue(1307674368000l == factorielle.calculer(16));

	}
}
