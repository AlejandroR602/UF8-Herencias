/**
 * 
 */
package Paquete;

/**
 * 
 */
public class Salon extends estancias{
	int numTomas;
	boolean terraza = false;
	
	public Salon(String nombre, int metros2, int puertas, int ventanas, int numTomas, boolean terraza) {
		super(nombre, metros2, puertas, ventanas);
		this.numTomas = numTomas;
		this.terraza = terraza;
	}
	
	public int metrosTerraza(int metrosT){
		if(terraza == false) {
			metrosT = 0;
		}else {
			metros2 += metrosT;
		}
		return metrosT;
	}
}
