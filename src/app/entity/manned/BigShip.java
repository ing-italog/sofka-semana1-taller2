package app.entity.manned;

import java.util.Scanner;

import app.commons.Ship;

/**
 * Clase para crear una Nave Tripulada de tamaño Grande, extiende la clase Ship del package main.commons, esta tipo de naves puede aterrizar,
 * llevar pasajeros, pero no permite llevar carga.
 * 
 * @author Italo Alberto Guevara Villamil
 * 
 */

public class BigShip extends Ship{
	
	private int numPassangger;
	Scanner sc = new Scanner(System.in);
	
	/**
	 * La nave inicia el aterrizaje.
	 */
	public void toLand() {
		if(getFly() == true) {
			speed = 0;
			System.out.println("\nLa nave esta aterrizando...");
			System.out.println("La nave esta en tierra fimre".toUpperCase());
			System.out.print("\n---------------------------------------------------------------");
			setFly(false);
			
		}else {
			System.out.println("\nLa nave ya se encuentra en tierra firme".toUpperCase());	
			System.out.print("\n---------------------------------------------------------------");
		}
	}

	/**
	 * Permite asignar la cantidad de pasajeros, pero la nave debe ocupar su
	 * capacidad miníma de 5 tripulantes.
	 * 
	 * @param numPassangger
	 */
	public void setNumPassangger(int numPassangger) {
		
		this.numPassangger = numPassangger;
		
		if(this.numPassangger >= 5 && this.numPassangger <= 10) {
			this.numPassangger = numPassangger;
		}else {
			System.out.println("\nLa nave solo puede ser tripulada por mínimo 5 tripulantes y máximo 10".toUpperCase());
			System.out.print("\nIngresa nuevamente Capacidad de pasajeros= ");
			this.numPassangger = sc.nextInt();
			System.out.print("\n---------------------------------------------------------------");
		}
		
	}
	
	public int getNumPassangger() {
		return numPassangger;
	}
	
	@Override
	public String toString() {
		return "\n---------------------------------------------------------------" + 
	            "\nNave Tripulada Grande" +
				"\n\nid= " + getId() +
				"\nNombre= " + getName() +
				"\nPais de origen= " + getCountry() +
				"\nPeso en toneladas= " + getWeigth()+ 
				"\nAltura= " + getHeigth() + 
				"\nAncho= " + getWeid() + 
				"\nProfundo= " + getDeep() + 
				"\nVelocidad máxima= "	+ getMaxSpeed() + " Km/h" +
				"\nTipo de Combustible= " + getFuelType() + 
				"\nCapacidad e combustible= " + getFuelCapacity() + " Gl" +
				"\nMaterial del fuselaje= " + getMaterial() +
				"\nCapacidad de pasajeros= " + numPassangger +
				"\n \nVelocidad actual= " + speed + " Km/h"
				+ "\n---------------------------------------------------------------";
		
	}

}
