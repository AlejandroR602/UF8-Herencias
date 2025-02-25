/**
 * 
 */
package Paquete;

import java.util.*;
/**
 * 
 */
public class Casa {

	static int metrosH;
	static int metrosS;
	static int metrosHa;
	static int metrosB;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime los metros cuadrados del Hall");
		metrosH = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuantas puertas tiene?");
		int puertasH = Integer.parseInt(sc.nextLine());
		System.out.println("¿Y ventanas?");
		int ventanasH = Integer.parseInt(sc.nextLine());
		System.out.println("¿Tiene puerta blinadada?");
		boolean blindada = false;
		if(sc.nextLine() == "Si"){
			blindada = true;
		}
		Hall hall = new Hall("Hall", metrosH, puertasH, ventanasH, blindada);
		
		System.out.println("Dime los metros cuadrados del Salon");
		metrosS = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuantas puertas tiene?");
		int puertasS = Integer.parseInt(sc.nextLine());
		System.out.println("¿Y ventanas?");
		int ventanasS = Integer.parseInt(sc.nextLine());
		System.out.println("¿Y tomas?");
		int Tomas = Integer.parseInt(sc.nextLine());
		System.out.println("¿Tiene puerta Terraza?");
		boolean terraza = false;
		if(sc.nextLine() == "Si"){
			terraza = true;
		}
		Salon Salon = new Salon("Salon", metrosS, puertasS, ventanasS, Tomas, terraza);
		
		System.out.println("Dime los metros cuadrados de la habitacion");
		metrosHa = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuantas puertas tiene?");
		int puertasHa = Integer.parseInt(sc.nextLine());
		System.out.println("¿Y ventanas?");
		int ventanasHa = Integer.parseInt(sc.nextLine());
		System.out.println("¿Y puertas de armario?");
		int puertasArmarioEmpotrado = Integer.parseInt(sc.nextLine());
		System.out.println("¿Tiene acceso a baño?");
		boolean accesoB = false;
		if(sc.nextLine() == "Si"){
			accesoB = true;
		}
		habitacion Habitacion = new habitacion("Habitación", metrosHa, puertasHa, ventanasHa, puertasArmarioEmpotrado, accesoB);
		
		System.out.println("Dime los metros cuadrados del baño");
		metrosHa = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuantas puertas tiene?");
		int puertasB = Integer.parseInt(sc.nextLine());
		System.out.println("¿Y ventanas?");
		int ventanasB = Integer.parseInt(sc.nextLine());
		System.out.println("¿Tiene bañera(Si) o ducha(No)?");
		boolean Tipo = false;
		if(sc.nextLine() == "Si"){
			Tipo = true;
		}
		bano Baño = new bano("Baño", metrosB, puertasB, ventanasB, Tipo);
		
		TotalMetrosCuadrados();
	}
	public static void TotalMetrosCuadrados(){
		int TotalM = 0;
		TotalM = metrosH + metrosS + metrosHa+ metrosB;
		System.out.println("Los metros cuadrados de tu casa son: "+TotalM);
	}
}
