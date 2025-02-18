/**
 * 
 */
package Paquete;

/**
 * 
 */
public class bano extends estancias {
	
	protected boolean tipo;

	public bano(String nombre, int metros2, int puertas, int ventanas, boolean tipo) {
		super(nombre, metros2, puertas, ventanas);
		this.tipo = tipo;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
}
