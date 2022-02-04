package app.services;

/**
 * Aqu� estan los m�todos.
 * 
 * @author Italo Alberto Guevara Villamil
 * 
 */

public interface IShipService {
	
	/**
	 * Crear una Nave Tripulada grande y ejecuta m�todos de la nave.
	 */
	public void makeBigShip();
	
	/**
	 * Crear una Nave Tripulada peque�a y ejecuta m�todos de la nave.
	 */
	public void makeSmallShip();
	
	/**
	 * Crear una Nave Lanzadera grande y ejecuta m�todos de la nave.
	 */
	public void makeBigShuttle();
	
	/**
	 * Crear una Nave Lanzadera peque�a y ejecuta m�todos de la nave.
	 */
	public void makeSmallShuttle();
}
