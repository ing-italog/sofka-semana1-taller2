package app.services;

import java.util.Scanner;

import app.entity.manned.BigShip;
import app.entity.manned.SmallShip;
import app.entity.unmanned.BigShuttle;
import app.entity.unmanned.SmallShuttle;

/**
 * Esta clase implementa los métodos que pueden llegar a utilizar las naves.
 * 
 * @author Italo Alberto Guevara Villamil
 * 
 */

public class ShipServiceImpl implements IShipService {

	Scanner sc = new Scanner(System.in);
	int selection = 0;
	boolean close = false;
	double aux = 0;

	@Override
	public void makeBigShip() {

		BigShip ship1 = new BigShip();

		System.out.println("\nIngresar los datos que tendra la nave TRIPULADA GRANDE -- ¡¡POR FAVOR NO USAR ESPACIOS!!");
		System.out.print("ID= ");
		ship1.setId(sc.nextLong());		
		System.out.print("País de origen= ");
		ship1.setCountry(sc.next());
		System.out.print("Nombre de la nave= ");
		ship1.setName(sc.next());
		System.out.print("Peso en toneladas= ");
		ship1.setWeigth(sc.nextDouble());
		System.out.print("Altura M= ");
		ship1.setHeigth(sc.nextDouble());
		System.out.print("Ancho M= ");
		ship1.setWeid(sc.nextDouble());
		System.out.print("Profundo M= ");
		ship1.setDeep(sc.nextDouble());
		System.out.print("Velocidad máxima posible Km/h= ");
		ship1.setMaxSpeed(sc.nextDouble());
		System.out.print("Tipo de combustible= ");
		ship1.setFuelType(sc.next());
		System.out.print("Capacidad de combustible (Galones)= ");
		ship1.setFuelCapacity(sc.nextDouble());
		System.out.print("Material del fuselaje= ");
		ship1.setMaterial(sc.next());
		System.out.print("\nCapacidad de pasajeros(>=5  && <= 10) = ");
		ship1.setNumPassangger(sc.nextInt());

		System.out.println(ship1);

		/**
		 * Mantiene activa las funciones que puede realizar la nave, mientras CLOSE sea
		 * False.
		 */
		while (close == false) {
			System.out.print("\nQue te gustaría realizar");
			System.out.println("\n1.  Despegar");
			System.out.println("2.  Aterrizar");
			System.out.println("3.  Subir velocidad");
			System.out.println("4.  Bajar la velocidad");
			System.out.println("5.  Volver al menú anterior");
			System.out.println("6.  Cerrar el programa");
			System.out.print("\nMarca aquí= ");

			selection = sc.nextInt();

			switch (selection) {
			case 1:
				ship1.takeOff();
				;

				break;
			case 2:
				ship1.toLand();

				break;
			case 3:
				if (ship1.getFly() == true) {
					System.out.println("\nVas agregar velocidad, cuanto deseas agregar= ");
					System.out.print("\nMarca aquí= ");

					ship1.toSpeed(sc.nextDouble());
				} else {
					System.out.println(
							"\nLa nave esta en tierra, no es posible agregar velocidad, primero debes despegar".toUpperCase());
				}

				break;
			case 4:
				if (ship1.getFly() == true) {
					System.out.println("\nVas restar velocidad, cuanto deseas restar= ");
					System.out.print("\nMarca aquí= ");

					ship1.slowerSpeed(sc.nextDouble());
				} else {
					System.out.println(
							"\nLa nave esta en tierra, no es posible restar velocidad, primero debes despegar".toUpperCase());
				}

				break;
			case 5:
				System.out.println("\nCerrando menú, nave eliminada".toUpperCase());
				System.out.print("\n---------------------------------------------------------------");
				close = true;

				break;
			case 6:
				System.out.print("\n---------------------------------------------------------------");
				System.out.print("\nFIN!! programa finalizado".toUpperCase());	
				System.exit(0);

				break;

			default:
				System.out.println("\nERROR!, Opción incorrecta, marca una opción valida por favor!".toUpperCase());
				System.out.print("\n---------------------------------------------------------------");
				break;
			}
		}

	}

	@Override
	public void makeSmallShip() {
		boolean close = false;

		SmallShip ship2 = new SmallShip();

		System.out.println("\nIngresar los datos que tendra la nave TRIPULADA PEQUEÑA -- ¡¡POR FAVOR NO USAR ESPACIOS!!");
		System.out.print("ID= ");
		ship2.setId(sc.nextLong());
		System.out.print("País de origen= ");
		ship2.setCountry(sc.next());
		System.out.print("Nombre de la nave= ");
		ship2.setName(sc.next());
		System.out.print("Peso en toneladas= ");
		ship2.setWeigth(sc.nextDouble());
		System.out.print("Altura M= ");
		ship2.setHeigth(sc.nextDouble());
		System.out.print("Ancho M= ");
		ship2.setWeid(sc.nextDouble());
		System.out.print("Profundo M= ");
		ship2.setDeep(sc.nextDouble());
		System.out.print("Velocidad máxima posible= ");
		ship2.setMaxSpeed(sc.nextDouble());
		System.out.print("Tipo de combustible= ");
		ship2.setFuelType(sc.next());
		System.out.print("Capacidad de combustible (Galones)= ");
		ship2.setFuelCapacity(sc.nextDouble());
		System.out.print("Material del fuselaje(hierro, cobre, platino..)= ");
		ship2.setMaterial(sc.next());
		System.out.print("\nCapacidad de pasajeros( <=4 )= ");
		ship2.setNumPassangger(sc.nextInt());

		System.out.println(ship2);

		/**
		 * Mantiene activa las funciones que puede realizar la nave, mientras CLOSE sea
		 * False.
		 */
		while (close == false) {
			System.out.print("\nQue te gustaría realizar");
			System.out.println("\n1.  Despegar");
			System.out.println("2.  Aterrizar");
			System.out.println("3.  Subir velocidad");
			System.out.println("4.  Bajar la velocidad");
			System.out.println("5.  Volver al menú anterior");
			System.out.println("6.  Cerrar el programa");
			System.out.print("\nMarca aquí= ");

			selection = sc.nextInt();

			switch (selection) {
			case 1:
				ship2.takeOff();
				;

				break;
			case 2:
				ship2.toLand();

				break;
			case 3:
				if (ship2.getFly() == true) {
					System.out.println("\nVas agregar velocidad, cuanto deseas agregar= ");
					System.out.print("\nMarca aquí= ");

					ship2.toSpeed(sc.nextDouble());
				} else {
					System.out.println(
							"\nLa nave esta en tierra, no es posible agregar velocidad, primero debes despegar".toUpperCase());
				}

				break;
			case 4:
				if (ship2.getFly() == true) {
					System.out.println("\nVas restar velocidad, cuanto deseas restar= ");
					System.out.print("\nMarca aquí= ");

					ship2.slowerSpeed(sc.nextDouble());
				} else {
					System.out.println(
							"\nLa nave esta en tierra, no es posible agregar velocidad, primero debes despegar".toUpperCase());
				}

				break;
			case 5:
				System.out.println("\nCerrando menú, nave eliminada".toUpperCase());
				close = true;

				break;
			case 6:
				System.out.print("\n---------------------------------------------------------------");
				System.out.print("\nFIN!! programa finalizado".toUpperCase());	
				System.exit(0);

				break;

			default:
				System.out.println("\nERROR!, Opción incorrecta, marca una opción valida por favor!".toUpperCase());
				System.out.print("\n---------------------------------------------------------------");
				break;
			}
		}

	}

	@Override
	public void makeBigShuttle() {
		boolean close = false;

		BigShuttle ship3 = new BigShuttle();

		System.out.println("\nIngresar los datos que tendra la nave LANZADERA GRANDE -- ¡¡POR FAVOR NO USAR ESPACIOS!!");
		System.out.print("ID= ");
		ship3.setId(sc.nextLong());
		System.out.print("País de origen= ");
		ship3.setCountry(sc.next());
		System.out.print("Nombre de la nave= ");
		ship3.setName(sc.next());
		System.out.print("Peso en toneladas= ");
		ship3.setWeigth(sc.nextDouble());
		System.out.print("Altura M= ");
		ship3.setHeigth(sc.nextDouble());
		System.out.print("Ancho M= ");
		ship3.setWeid(sc.nextDouble());
		System.out.print("Profundo M= ");
		ship3.setDeep(sc.nextDouble());
		System.out.print("Velocidad máxima posible= ");
		ship3.setMaxSpeed(sc.nextDouble());
		System.out.print("Tipo de combustible= ");
		ship3.setFuelType(sc.next());
		System.out.print("Capacidad de combustible (Galones)= ");
		ship3.setFuelCapacity(sc.nextDouble());
		System.out.print("Material del fuselaje(hierro, cobre, platino..)= ");
		ship3.setMaterial(sc.next());
		System.out.print("\nCapacidad de carga en Toneladas= ");
		ship3.setLoadingCapacity(sc.nextFloat());

		System.out.println(ship3);

		/**
		 * Mantiene activa las funciones que puede realizar la nave, mientras CLOSE sea
		 * False.
		 */
		while (close == false) {
			System.out.print("\nQue te gustaría realizar");
			System.out.println("\n1.  Despegar");
			System.out.println("2.  Liberar Carga");
			System.out.println("3.  Subir velocidad");
			System.out.println("4.  Bajar la velocidad");
			System.out.println("5.  Volver al menú anterior");
			System.out.println("6.  Cerrar el programa");
			System.out.print("\nMarca aquí= ");

			selection = sc.nextInt();

			switch (selection) {
			case 1:
				ship3.takeOff();
				;

				break;
			case 2:
				ship3.loadDrop();

				break;
			case 3:
				if (ship3.getFly() == true) {
					System.out.println("\nVas agregar velocidad, cuanto deseas agregar= ");
					System.out.print("\nMarca aquí= ");

					ship3.toSpeed(sc.nextDouble());
				} else {
					System.out.println(
							"\nLa nave esta en tierra, no es posible agregar velocidad, primero debes despegar".toUpperCase());
				}

				break;
				
			case 4:
				if (ship3.getFly() == true) {
					System.out.println("\nVas restar velocidad, cuanto deseas restar= ");
					ship3.slowerSpeed(sc.nextDouble());
				} else {
					System.out.println(
							"\nLa nave esta en tierra, no es posible agregar velocidad, primero debes despegar".toUpperCase());
				}

				break;
			case 5:
				System.out.println("\nCerrando menú, nave eliminada".toUpperCase());
				System.out.print("\n---------------------------------------------------------------");
				close = true;

				break;
			case 6:
				System.out.print("\n---------------------------------------------------------------");
				System.out.print("\nFIN!! programa finalizado".toUpperCase());	
				System.exit(0);

				break;

			default:
				System.out.println("\nERROR!, Opción incorrecta, marca una opción valida por favor!".toUpperCase());
				System.out.print("\n---------------------------------------------------------------");
				break;
			}
		}

	}

	@Override
	public void makeSmallShuttle() {
		boolean close = false;

		SmallShuttle ship4 = new SmallShuttle();

		System.out.println("\nIngresar los datos que tendra la nave LANZADERA PEQUEÑA -- ¡¡POR FAVOR NO USAR ESPACIOS!!");
		System.out.print("ID= ");
		ship4.setId(sc.nextLong());
		System.out.print("País de origen= ");
		ship4.setCountry(sc.next());
		System.out.print("Nombre de la nave= ");
		ship4.setName(sc.next());
		System.out.print("Peso en toneladas= ");
		ship4.setWeigth(sc.nextDouble());
		System.out.print("Altura M= ");
		ship4.setHeigth(sc.nextDouble());
		System.out.print("Ancho M= ");
		ship4.setWeid(sc.nextDouble());
		System.out.print("Profundo M= ");
		ship4.setDeep(sc.nextDouble());
		System.out.print("Velocidad máxima posible= ");
		ship4.setMaxSpeed(sc.nextDouble());
		System.out.print("Tipo de combustible= ");
		ship4.setFuelType(sc.next());
		System.out.print("Capacidad de combustible (Galones)= ");
		ship4.setFuelCapacity(sc.nextDouble());
		System.out.print("Material del fuselaje(hierro, cobre, platino..)= ");
		ship4.setMaterial(sc.next());
		System.out.print("\nCapacidad de carga en Toneladas= ");
		ship4.setLoadingCapacity(sc.nextFloat());

		System.out.println(ship4);

		/**
		 * Mantiene activa las funciones que puede realizar la nave, mientras CLOSE sea
		 * False.
		 */
		while (close == false) {
			System.out.print("\nQue te gustaría realizar");
			System.out.println("\n1.  Despegar");
			System.out.println("2.  Liberar Carga");
			System.out.println("3.  Subir velocidad");
			System.out.println("4.  Bajar la velocidad");
			System.out.println("5.  Volver al menú anterior");
			System.out.println("6.  Cerrar el programa");
			System.out.print("\nMarca aquí= ");

			selection = sc.nextInt();

			switch (selection) {
			case 1:
				ship4.takeOff();
				;

				break;
			case 2:
				ship4.loadDrop();

				break;
			case 3:
				if (ship4.getFly() == true) {
					System.out.println("\nVas agregar velocidad, cuanto deseas agregar= ");
					System.out.print("\nMarca aquí= ");

					ship4.toSpeed(sc.nextDouble());
				} else {
					System.out.println(
							"\nLa nave esta en tierra, no es posible agregar velocidad, primero debes despegar".toUpperCase());
				}

				break;
			case 4:
				if (ship4.getFly() == true) {
					System.out.println("\nVas restar velocidad, cuanto deseas restar= ");
					ship4.slowerSpeed(sc.nextDouble());
				} else {
					System.out.println(
							"\nLa nave esta en tierra, no es posible agregar velocidad, primero debes despegar".toUpperCase());
				}

				break;
			case 5:
				System.out.println("\nCerrando menú, nave eliminada".toUpperCase());
				System.out.print("\n---------------------------------------------------------------");
				close = true;

				break;
			case 6:
				System.out.print("\n---------------------------------------------------------------");
				System.out.print("\nFIN!! programa finalizado".toUpperCase());	
				System.exit(0);

				break;

			default:
				System.out.println("\nERROR!, Opción incorrecta, marca una opción valida por favor!".toUpperCase());
				System.out.print("\n---------------------------------------------------------------");
				break;
			}
		}

	}

}
