//package exercise5;

/**
 * This interface specifies required methods for domesticated animals. 
 *
 */
public interface Domesticated {
	/** We want a print statement of the animal walking
	 * 
	 */
	void walk();
	/**
	 * We want a print statement of the animal greeting a human. 
	 */
	void greetHuman();
	/**
	 * We want  a print statement of the animal sleeping.
	 */
	void sleep();
	/**
	 * We want a print statement of the animal moving 
	 */
	void move();
	/**
	 * We want a print statement of the animal making a sound.
	 */
	void sound();
	/**
	 * We want a print statement of an animal eating. 
	 */
	void eat();
	/**
	 * We want the animal to have specific string when printing an instance. 
	 * @return The animal and some info. 
	 */
	String toString();
}
