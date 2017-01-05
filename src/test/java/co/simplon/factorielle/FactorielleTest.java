package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void testCalculerAvecValeur1() {
		
		Factorielle factorielle = new Factorielle();
		long resultat = factorielle.calculer(1);
		assertEquals(1, resultat);
		assertEquals(2, factorielle.calculer(2));
		assertEquals(6, factorielle.calculer(3));
		assertEquals(24, factorielle.calculer(4));
		assertEquals(120, factorielle.calculer(5));
		assertEquals(5040, factorielle.calculer(7));
		assertEquals(40320, factorielle.calculer(8));
	}

}
