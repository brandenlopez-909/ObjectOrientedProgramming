//package exercise5;
/**
 * This class holds information for animals.
 * 
 * 
 * @author Branden Lopez 
 */

public class Animal {
	private String animalType;
	private String animalName;
	private int age;
	private String gender;
	private String environment; 
	private double speed;
	
	//Necessary Setters
	/**
	 * Sets the type of animal.
	 * @param type Is the "type of animal. Ie: Dog,Cat, Whale, Racoon,etc.  
	 */
	
	public void setAnimalType(String type) {this.animalType = type;}
	/**
	 * Sets the animal Name 
	 * @param name Is the name of the animal. Ie: A dog named Jack, or a cat named Boots.
	 */
	
	public void setAnimalName(String name) {this.animalName = name;}
	/**
	 * Sets the age of the animal.
	 * @param age The age of the animal.
	 */
	
	public void setAge(int age) {this.age = age;}
	/**
	 * Sets the gender of the animal.
	 * @param gender The gender of the dog. Ie: Male, Female, non-binary, etc.
	 */
	public void setGender(String gender) {this.gender = gender;}
	/**
	 * Sets the environment of the animal.
	 * @param enviro The environment the animal lives in. Ie: Home, Forest, Ocean 
	 */
	public void setEnvironment(String enviro) {this.environment = enviro;}
	
	/**
	 * Sets the speed the animal can go in miles per hour. 
	 * @param speed The speed of the animal. IE; 25, 10, 12, etc. Do not inlcude the unit only the scaler. 
	 */
	public void setSpeed(double speed) {this.speed = speed;}
	
	//Necessary Getters 
	/**
	 * Gets the type of animal.
	 * @return The type of animal.
	 */
	public String getAnimalType() {return this.animalType;}
	/**
	 * Gets the animal name.
	 * @return the animal name.
	 */
	public String getAnimalName() {return this.animalName;}
	/**
	 * Gets the age of the animal.
	 * @return The age of the animal.
	 */
	public int getAge(){return this.age;}
	/**
	 * Gets the gender.
	 * @return the gender of the animal. 
	 */
	public String getGender() {return this.gender;}
	/**
	 * Gets the environnment.
	 * @return the environment of the animal.
	 */
	public String getEnvironment() {return this.environment;}
	/**
	 * Gets the speed
	 * @return the speed of the animal. 
	 */
	public double getSpeed() {return this.speed;}
	
	//Constructor
	/**
	 * 
	 * @param animalType The animal type
	 * @param animalName The animal Name
	 * @param age The animal age in human years 
	 * @param gender The animal gender 
	 * @param environment The animal environment
	 * @param speed The speed at which the animal can move. 
	 */
	public Animal(String animalType, String animalName, int age, String gender, String environment, double speed ) {
		this.animalType = animalType; 
		this.animalName = animalName;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	
}
