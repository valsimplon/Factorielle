package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void testCalculerAvecValeur1() {
		
		Factorielle factorielle = new Factorielle();
		long resultat = factorielle.calculer(1);
		assertEquals(1, resultat);

	}

	@Test
	public void testCalculerAvecValeur5() {
		
		Factorielle factorielle = new Factorielle();
		
		assertEquals(120, factorielle.calculer(5));

	}
	
	@Test
	public void testCalculerAvecValeurNulle() {
		
		Factorielle factorielle = new Factorielle();
		
		assertEquals(1, factorielle.calculer(0));

	}
	
	@Test
	public void testCalculerAvecValeur10() {
		
		Factorielle factorielle = new Factorielle();
		
		assertEquals(3628800, factorielle.calculer(10));

	}
	
	@Test
	public void testCalculerAvecValeur15() {
		
		Factorielle factorielle = new Factorielle();
		
		assertEquals(1307674368000l, factorielle.calculer(15));

	}
}
