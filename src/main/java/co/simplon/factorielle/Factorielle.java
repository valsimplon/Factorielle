package co.simplon.factorielle;

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
    		} else if (n == 0) {
    			return 1;
    		}
    		return n;
    }

}
