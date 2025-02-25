/**
 * 
 */
package Paquete;

/**
 * 
 */
public class Hall extends estancias {
	
	protected boolean blindada;

	public boolean isBlindada() {
		return blindada;
	}


	public void setBlindada(boolean blindada) {
		this.blindada = blindada;
	}


	public Hall(String nombre, int metros2, int puertas, int ventanas, boolean blindada) {
		super(nombre, metros2, puertas, ventanas);
		this.blindada = blindada;
	}
	
		

}
