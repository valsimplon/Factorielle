package co.simplon.factorielle;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
		assertFalse(120 != factorielle.calculer(5));

	}
	
	@Test
	public void testCalculerAvecValeurNulle() {
		
		assertEquals("cas particulier", 1, factorielle.calculer(0));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculerAvecValeurNegative() {
				
		factorielle.calculer(-1);

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
	
	@Test(timeout=1)
	public void testCalculerAvecValeur18() {

		for (int i = 0; i<=99; i++)
			assertEquals(6402373705728000l, factorielle.calculer(18));

	}

	@Ignore
	@Test
	public void testCalculerAvecValeur16() {
		
		assertEquals("erreur introduite volontairement", 1307674368000l, factorielle.calculer(16));

	}
	
	@Ignore
	@Test
	public void testCalculerAvecValeur16Boolean() {
		
		//assertTrue(1307674368000l == factorielle.calculer(16));
		if (1307674368000l != factorielle.calculer(16)) {
			fail("ERREUR");
		}
	}
	
	@Test
	public void factorielle_4_doit_etre_24_avec_hamcrest() {
		//GIVEN
		long entier = 4;
		long resultatAttendu = 24;
		
		//WHEN
		long resultat = factorielle.calculer(entier);
		
		//THEN
		assertThat(resultat, equalTo(resultatAttendu));
		//assertThat(resultat == resultatAttendu, Is.is(true));
		//assertThat(resultat == resultatAttendu, is(true));
		assertThat(resultat == resultatAttendu, is(true));
	}
}
