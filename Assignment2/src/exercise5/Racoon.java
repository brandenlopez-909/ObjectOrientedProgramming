//package exercise5;

/**
 * This class inherits from animal and implements Scratcher 
 *
 *
 */
public class Racoon extends Animal implements Scratcher{
	/**
	 * Prints the animal sleeping.
	 */
	public void sleep() {System.out.println("zzz");}
	/**
	 * Prints the animal moving.
	 */
	public void move() {System.out.println("Wiggle");}
	/**
	 * Prints an animal sound.
	 */
	public void sound() {System.out.println("I am the UCSB mascot");}
	/**
	 * Prints the animal eating.
	 */
	public void eat() {System.out.println("*Munch, munch*");}
	/**
	 * Prints the animal scratching.
	 */
	public void scratch() {System.out.println("Scratch!");}
	
	/**
	 * @return "A Mapache(Racoon) named " + getAnimalName()
	 */
	public String toString() {
		String newString = "A Mapache(Racoon) named " + getAnimalName();
		return newString; 
	}
	
	/**
	 * 
	 * @param animalName The name of the Racoon.
	 * @param age The age of the Racoon in human years.
	 * @param gender The gender of the Racoon. 
	 * @param environment The environment the Racoon lives in. Ie: Forest, Streets, home, etc.
	 * @param speed The speed at which the Racoon can move. 
	 */
	public Racoon( String animalName, int age, String gender, String environment, double speed) {
		super("Racoon", animalName, age,gender, environment,  speed);
	}
}
