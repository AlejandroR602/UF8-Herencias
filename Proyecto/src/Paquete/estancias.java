/**
 * 
 */
package Paquete;

/**
 * 
 */
public abstract class estancias {
	//casa(main)(A)
	//hall (R)
	//cocina (R)
	//salon (R)
	//habitacion (A)
	//baño (A)
	protected String nombre;
	protected int metros2;
	protected int puertas;
	protected int ventanas;
	
	public estancias(String nombre, int metros2, int puertas, int ventanas) {
		this.nombre = nombre;
		this.metros2 = metros2;
		this.puertas = puertas;
		this.ventanas = ventanas;
	}
	
	
}
