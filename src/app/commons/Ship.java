package app.commons;

import java.util.Scanner;

/**
 * Esta es clase es un objeto de Nave Común, funciona como molde(extends) a clases hijas para crear naves.
 * La nave puede despegar, aumentar velocidad, bajar velocidad.
 * 
 * @author Italo Alberto Guevara Villamil
 * 
 */

public abstract class Ship {

	private long id;
	private String country;
	private String name;
	private float weigth;
	private double heigth;
	private double weid;
	private double deep;
	private double maxSpeed;
	private String fuelType;
	private double fuelCapacity;
	private String material;

	protected double speed;

	/**
	 * Atributos auxiliares para implementar los métodos de la clase.
	 */
	private boolean fly = false;
	Scanner sc = new Scanner(System.in);

	/**
	 * La nave inicia el despegue.
	 */
	public void takeOff() {
		if(fly == false) {
			speed = maxSpeed * 0.8;
			System.out.println("\nLa nave esta despegando...".toUpperCase());
			System.out.println("Velocidad alcanzada= " + speed + " Km/h");
			System.out.println("\nNave se encuentra en el cielo".toUpperCase());
			System.out.print("\n---------------------------------------------------------------");
			fly = true;
			
		}else {
			System.out.println("\nLa nave ya se encuentra en pleno viaje".toUpperCase());	
			System.out.print("\n---------------------------------------------------------------");
		}

	}

	/**
	 * Aumenta la velocidad de la nave he imprime le velocidad actual;
	 * @param SPEED velocidad que se desea agregar
	 */
	public void toSpeed(Double speed) {	
		this.speed += speed;
		if(fly != false && this.speed < maxSpeed) {
			System.out.println("\nLa nave esta acelerando...".toUpperCase());
			System.out.println("Velocidad alcanzada es= " + this.speed + " Km/h");
			System.out.print("\n---------------------------------------------------------------");
		}else if(fly != false && this.speed >= maxSpeed){
			this.speed -= speed;
			System.out.println("\nLa nave no puede acelerar, ya que estaría sobre pasando su velocidad máxima".toUpperCase());
			System.out.println("\nVelocidad máxima= " + maxSpeed);
			System.out.println("Velocidad actual es= " + this.speed + " Km/h");
			System.out.print("\n---------------------------------------------------------------");
		}else if (fly == false) {
			System.out.println("\nLa nave esta en tierra, No ha despegado aún".toUpperCase());
			System.out.print("\n---------------------------------------------------------------");
		}
	}

	/**
	 * Disminuye la velocidad de la nave he imprime le velocidad actual;
	 * 
	 * @param SPEED velocidad que se desea restar
	 */
	public void slowerSpeed(Double speed) {
		this.speed -= speed;
		if(fly != false && this.speed < maxSpeed && this.speed >= (maxSpeed * 0.3)) {
		
			System.out.println("\nLa nave esta desacelerando...".toUpperCase());
			System.out.println("Velocidad disminuidad a= " + this.speed + " Km/h");
			System.out.print("\n---------------------------------------------------------------");
		}else if(fly != false && this.speed <= (maxSpeed * 0.3)){
			this.speed += speed;
			System.out.println("\nLa nave no puede descalerar, porque se estrella, velocidad mínima permitda 30% de la velocidad máxima".toUpperCase());
			System.out.println("Velocidad máxima es= " + maxSpeed + " Km/h");
			System.out.println("Velocidad actual es= " + this.speed + " Km/h");
			System.out.print("\n---------------------------------------------------------------");
		}else if (fly == false) {
			System.out.println("\nLa nave esta en tierra, No ha despegado aún".toUpperCase());
			System.out.print("\n---------------------------------------------------------------");
		}
	}

	/**
	 * Constructor vacio.
	 */
	public Ship() {
	}

	/**
	 * Constructor con todos los campos.
	 */
	public Ship(long id, String name, String country, double weigth, double heigth, double weid,
			double deep, double maxSpeed,  String fuelType, double fuelCapacity, String material) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.weigth = (float) weigth;
		this.heigth = heigth;
		this.weid = weid;
		this.deep = deep;
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.material = material;
	}

	/**
	 * Getters & Setters
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = (float) weigth;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getWeid() {
		return weid;
	}

	public void setWeid(double weid) {
		this.weid = weid;
	}

	public double getDeep() {
		return deep;
	}

	public void setDeep(double deep) {
		this.deep = deep;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public boolean getFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}
