//package exercise5;
/**
 * This class inherits from animal and implements Domesticated 
 * @author Branden Lopez 
 *
 */
public class Dog extends Animal implements Domesticated {
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
	 * Prints the animal eating
	 */
	public void eat() {System.out.println("*Munch, munch*");}
	/**
	 * Prints the dog barking
	 */
	public void bark() {System.out.println("*Bark,Bark!*");}
	/**
	 * Prints the dog walking
	 */
	public void walk() {System.out.println("The dog goes on a walk");}
	/**
	 * Prints the dog greeting.
	 */
	public void greetHuman(){System.out.println("The dog greets the human!");}
	
	/** 
	 * Returns a string when printing the instance of the animal.
	 * @return newString = "A dog named " + getAnimalName
	 */
	public String toString() {
		String newString = "A dog named " + getAnimalName();
		return newString; 
	}
	
	/**
	 * The dog constructor.
	 * @param animalName The name of the Dog
	 * @param age The age of the dog in human years
	 * @param gender The gender of the dog
	 * @param environment The Environment it live in. Ie: House, Yard, Dog Pound.
	 * @param speed The speed at which the dog can run
	 */
	public Dog(String animalName, int age, String gender, String environment, double speed){
		//I don't think I did this properly in exercise 3
		super("Dog", animalName, age,gender, environment,  speed);

		
	}
}
