package app.entity.unmanned;

import java.util.Scanner;

import app.commons.Ship;

/**
 * Clase para crear una Nave Carguera de tamaño Grande, extiende la clase Ship
 * del package main.commons, esta tipo de naves no permite aterrizar, puede
 * llevar carga, pero no puede llevar pasajeros.
 * 
 * @author Italo Alberto Guevara Villamil
 * 
 */

public class BigShuttle extends Ship {

	private float loadingCapacity;
	boolean loadDrop = false;

	Scanner sc = new Scanner(System.in);
	
	/**
	 * Soltar el total de la carga.
	 */
	public void loadDrop() {
		
		if(loadDrop == false) {
			System.out.println("\nLa nave esta soltando la carga...");
			System.out.println("\nCarga liberada completamente".toUpperCase());	
			System.out.print("\n---------------------------------------------------------------");
			loadDrop = true;
		}else if (loadDrop== true){
			System.out.println("\nLa nave no tiene carga pendiente por liberar".toUpperCase());
			System.out.print("\n---------------------------------------------------------------");
		}
	}

	/**
	 * Este método asigna la carga, sí la carga supera el 40% del peso de la nave, no se puede cargar la nave, ya
	 * que estaría muy pesada para despegar.
	 * 
	 * @param loadingCapacity
	 */
	public void setLoadingCapacity(float loadingCapacity) {
		this.loadingCapacity = loadingCapacity;

		if (this.loadingCapacity <= (getWeigth() * 0.4)) {
			this.loadingCapacity = loadingCapacity;

		} else {
			while (this.loadingCapacity > (getWeigth() * 0.4)) {
				System.out.println("\nLa carga ha superado el 40% del peso total de la nave.".toUpperCase());
				System.out.print("\nIngresa nuevamente carga= ");
				this.loadingCapacity = sc.nextFloat();
				System.out.print("\n---------------------------------------------------------------");
			}
		}
	}

	public double getLoadingCapacity() {
		return loadingCapacity;
	}

	@Override
	public String toString() {
		return "\n---------------------------------------------------------------"  
	            + "\nNave Lanzadera Grande " 
				+ "\n\nid= " + getId()
				+ "\nNombre= " + getName() 
				+ "\nPais de origen= " + getCountry()
				+ "\nPeso en toneladas= " + getWeigth()
				+ "\nAltura= " + getHeigth()
				+ "\nAncho= " + getWeid()
				+ "\nProfundo= " + getDeep()
				+ "\nVelocidad máxima= " + getMaxSpeed() + " Km/h"
				+ "\nTipo de Combustible= " + getFuelType()
				+ "\nCapacidad e combustible= " + getFuelCapacity()  + " Gl"
				+ "\nMaterial del fuselaje= " + getMaterial()
				+ "\nCapacidad de carga= " + loadingCapacity  + " Toneladas"
				+ "\n \nVelocidad actual= " + speed + " Km/h"
				+ "\n---------------------------------------------------------------";

	}

}
