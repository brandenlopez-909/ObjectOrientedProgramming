//package exercise5;

/**
 * This class inherits from animal and implements Swimmer 
 * @author Branden Lopez 
 *
 */
public class Whale extends Animal implements Swimmer{
	/**
	 * Prints the animal sleeping.
	 */
	public void sleep() {System.out.println("zzz");}
	/**
	 * Prints the animal moving.
	 */
	public void move() {System.out.println("Drifts in ocean");}
	/**
	 * Prints an animal sound.
	 */
	public void sound() {System.out.println("Whale Sounds");}
	/**
	 * Prints the animal eating.
	 */
	public void eat() {System.out.println("Opens mouth");}
	/**
	 * Prints the animal Swimming. 
	 */
	public void swim() {System.out.println("Swims");}
	
	/**
	 * @return "A whale named " + getAnimalName();
	 */
	public String toString() {
		String newString = "A whale named " + getAnimalName();
		return newString; 
	}
	
	/**
	 * 
	 * @param animalName The name of the whale.
	 * @param age The age of the whale in human years
	 * @param gender The gender of the whale.
	 * @param environment The environment the whale live in. Ie: Ocean, tank, etc. 
	 * @param speed The speed at which the whale can swim. 
	 */
	public Whale( String animalName, int age, String gender, String environment, double speed) {
		super("Whale" , animalName, age,gender, environment,  speed);
	}
}
