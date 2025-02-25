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
	//salon (A)
	//habitacion (A)
	//baño (R)
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMetros2() {
		return metros2;
	}

	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVentanas() {
		return ventanas;
	}

	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}
}
