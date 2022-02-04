package Controllers;

import java.util.Scanner;

import app.services.ShipServiceImpl;

/**
 * Esta es la clase principal, permite crear un tipo de nave y ejercutar sus funciones.
 * 
 * @author Italo Alberto Guevara Villamil
 * 
 */

public class ShipController {

	/**
	 * Clase de Servicio.
	 */
	static ShipServiceImpl service = new ShipServiceImpl();
	
	static Scanner sc = new Scanner(System.in);
	
	static boolean activ = true;
	static int selection = 0;

	public static void main(String[] args) {

		System.out.println("Bienvenidos, marca una opción");

		/**
		 * Esta condicional permite mantener la aplicación funcionando mientras el la
		 * variable `activ` sea TRUE.
		 */
		while (activ == true) {
			System.out.print("\n¡¡POR FAVOR NO USAR ESPACIOS!! para un correcto funcionamiento del programa. \n");

			System.out.println("\n1.  Crear nave de Tripulada Grande");
			System.out.println("2.  Crear nave de Tripulada pequeña");
			System.out.println("3.  Crear nave de Lanzadera Grande");
			System.out.println("4.  Crear nave de Lanzadera Pequeña");
			System.out.println("5.  Salir");
			System.out.print("\nMarca aquí= ");
			selection = sc.nextInt();
			System.out.print("\n---------------------------------------------------------------");

			switch (selection) {
			case 1:
				service.makeBigShip();
				break;

			case 2:
				service.makeSmallShip();
				break;

			case 3:
				service.makeBigShuttle();
				break;

			case 4:
				service.makeSmallShuttle();
				break;

			case 5:
				activ = false;
				System.out.print("\nFIN!! programa finalizado");

				break;

			default:
				System.out.println("\nERROR!, Opción incorrecta, marca una opción valida por favor!");
				System.out.print("\n---------------------------------------------------------------");
				break;
			}

		}

	}

}
