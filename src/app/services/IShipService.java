package app.services;

/**
 * Aquí estan los métodos.
 * 
 * @author Italo Alberto Guevara Villamil
 * 
 */

public interface IShipService {
	
	/**
	 * Crear una Nave Tripulada grande y ejecuta métodos de la nave.
	 */
	public void makeBigShip();
	
	/**
	 * Crear una Nave Tripulada pequeña y ejecuta métodos de la nave.
	 */
	public void makeSmallShip();
	
	/**
	 * Crear una Nave Lanzadera grande y ejecuta métodos de la nave.
	 */
	public void makeBigShuttle();
	
	/**
	 * Crear una Nave Lanzadera pequeña y ejecuta métodos de la nave.
	 */
	public void makeSmallShuttle();
}
