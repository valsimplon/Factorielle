package co.simplon.factorielle;

import java.lang.Math;

/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) {
    		if (n > 1) {
    			return n * calculer(n-1);
    		} else if (n < 0) {
    			throw new IllegalArgumentException();
    		} 
    		return 1;
    } 
    
/*	public long calculer (long n) {
		if (n > 1) {
			return n * calculer(n-1);
		} else if (n < 0) {
			return calculer(Math.abs(n));
		}
		return 1;	
	}
*/
}
