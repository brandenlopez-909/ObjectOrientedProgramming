//package exercise3;

import java.util.ArrayList;

/**
 * Used to test the Person Class
 */
public class PersonTest {
	public static void main(String[] args) {
		ArrayList<Person> test = new ArrayList<Person>();
		test.add(new Person("Joe", "Smith", 40));
		test.add(new Person("Amy", "Gold", 32));
		test.add(new Person("Tony", "Stork", 21));
		test.add(new Person("Sean", "Irish", 24));
		test.add(new Person("Tina", "Brock", 28));
		test.add(new Person("Lenny", "Hep", 18));
		//How would I do the sort without using custom compares?
		
		//The sort method is static, and uses string to deterime 
		//The varibale we sort on. (firstName, lastName, age)
		Person.sortPeople(test, "age", false);

	
	}
}
