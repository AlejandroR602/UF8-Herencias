/**
 * 
 */
package Paquete;

/**
 * 
 */
public class habitacion extends estancias {
	protected int PuertasArmarioEmpotrado;
	protected boolean AccesoABaño;
	
	public habitacion(String nombre, int metros2, int puertas, int ventanas, int puertasArmarioEmpotrado, boolean accesoABaño) {
		super(nombre, metros2, puertas, ventanas);
		PuertasArmarioEmpotrado = puertasArmarioEmpotrado;
		AccesoABaño = accesoABaño;
	}

	public int getPuertasArmarioEmpotrado() {
		return PuertasArmarioEmpotrado;
	}

	public void setPuertasArmarioEmpotrado(int puertasArmarioEmpotrado) {
		PuertasArmarioEmpotrado = puertasArmarioEmpotrado;
	}

	public boolean isAccesoABaño() {
		return AccesoABaño;
	}

	public void setAccesoABaño(boolean accesoABaño) {
		AccesoABaño = accesoABaño;
	}
}
