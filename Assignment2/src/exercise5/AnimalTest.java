//package exercise5;

/**
 *This class aims to test the Animal SuperClass and its childClasses   
 */
public class AnimalTest {
	/**
	 * Used to run the test.
	 */
	public static void main(String[] args) {
		Dog jack = new Dog("Jack" ,5, "Male", "House", 10);
		Cat boots = new Cat("Boots", 10, "Male", "House", 15);
		Racoon ole = new Racoon("Ole", 2, "Male", "Forest(Even tho they are found in the streets)", 16);
		Whale shamoo = new Whale("Shamoo", 5, "Female", "Ocean", 45);
		
		//Saves the test animals in a list so we can easily loop thru them
		Animal testList[] = {jack,boots,ole,shamoo};
		
		//Loops thru the test animals and tries all methods. 
		for(int i=0; i <testList.length; i++) {
			System.out.println(testList[i]);
			System.out.println(testList[i].getAge() + " years");
			System.out.println(testList[i].getAnimalName() );
			System.out.println(testList[i].getAnimalType() );
			System.out.println(testList[i].getGender() );
			System.out.println(testList[i].getEnvironment() );
			System.out.println(testList[i].getSpeed() + "mph");
			System.out.println( );
			
		}
	
	}
}