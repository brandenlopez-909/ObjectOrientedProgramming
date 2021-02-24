//package exercise5;

/**
 * This class inherits from animal and implements Domesticated and Scratcher. 
 * @author Branden Lopez 
 *
 */
public class Cat extends Animal implements Domesticated,Scratcher{
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
	public void sound() {System.out.println("*fart*");}
	/**
	 * Prints the animal eating.
	 */
	public void eat() {System.out.println("*Munch, munch*");}
	/**
	 * Prints the animal scratching.
	 */
	public void scratch() {System.out.println("Scratch!");}
	/**
	 * Prints the animal walking.
	 */
	public void walk() {System.out.println("The cat goes on a walk");}
	/**
	 * Prints an animal greeting a human
	 */
	public void greetHuman(){System.out.println("The cat greets the human!");}
	
	/**
	 * @return "A cat named " + getAnimalName()
	 */
	public String toString() {
		String newString = "A cat named " + getAnimalName();
		return newString; 
	}
	
	/**
	 * 
	 * @param animalName The name of the cat
	 * @param age The age of the cat in human years 
	 * @param gender The gender of the cat.
	 * @param environment The environment the cat lives in. Ie: Home, Park, Animal Shelter, etc. 
	 * @param speed The speed at which the cat can move. 
	 */
	public Cat( String animalName, int age, String gender, String environment, double speed){
		super("Racoon", animalName, age,gender, environment,  speed);
	}
	
}
