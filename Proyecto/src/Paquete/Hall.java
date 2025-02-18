/**
 * 
 */
package Paquete;

/**
 * 
 */
public class Hall extends estancias {
	
	protected boolean blindada;

	public Hall(String nombre, int metros2, int puertas, int ventanas, boolean blindada) {
		super(nombre, metros2, puertas, ventanas);
		this.blindada = blindada;
	}
	
		

}
