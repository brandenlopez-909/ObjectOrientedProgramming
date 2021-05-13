/*package exercise1;

import java.lang.reflect.*;
*/
public class ReflectionTest {

	public static void main(String[] args) {
		/* 1. Print out all methods declared in class Person (notice, declared methods only), including the
		 * number of input parameters and all input parameter types.
		 * 
		 */
		
		//streetNumber, String streetName , String cityName, String state , String zipCode
		Address a1 = new Address(12300, "5th St", "Yucaipa", "Ca", "92399");
		Person p1 = new Person("Branden", "Lopez", a1,"123-45-6789"); 
		Class personClass = p1.getClass();

		for(Method method: personClass.getDeclaredMethods()) {
			System.out.println(method.getName() );
			Class[] parameters = method.getParameterTypes();
			
			if(parameters.length == 0 ) {
				System.out.println(method.getName() + " has 0 parameters");
			}
			else {
				System.out.println(method.getName() + " has " +  parameters.length+" parameters");
				for(Class p :parameters) {
					System.out.println("\t"+p.getName());
				}
			}
		}//End question 1 
		
		/* 2.
		 * Print out all methods available to class Address (notice, all methods), including the number 
		 * of input parameters and all input parameter types.
		 */
		System.out.println("-------------------------------------------\n");
		System.out.println("Question 2. Address");
		Class addressClass = a1.getClass();
		for(Method method: addressClass.getMethods()) {
			System.out.println(method.getName() );
			Class[] parameters = method.getParameterTypes();
			
			if(parameters.length == 0 ) {
				System.out.println(method.getName() + " has 0 parameters");
			}
			else {
				System.out.println(method.getName() + " has " +  parameters.length+" parameters");
				for(Class p :parameters) {
					System.out.println("\t"+p.getName());
				}
			}
		}//End question 2
		
		/*
		 * Question 3
		 * Print out all fields declared in class Address (notice, declared fields only), including the
		 * access modifier and the type of the field.
		 */
		System.out.println("-------------------------------------------\n");
		System.out.println("Question 3. Address Fields");
		
		Field[] addresssFields = Address.class.getDeclaredFields();
		for(Field field: addresssFields ) {
			System.out.println(field.getName() );
			

		}//end for loop
		
		//Private is the access modifier, type of field comes right after the access modifier. 
		//After that is the location of the field.
		System.out.println("\nField access modifier and types");
		for(Field field: addresssFields ) {
			System.out.println(field.toString() );
		}
		
		/*
		 * Instantiate 3 new instances of class Person. This should also involve instantiating the Address 
		 * class using reflection.
		 */
		
		System.out.println("-------------------------------------------\n");
		System.out.println("Question 3. 3 new instances of person.");
		Constructor<Address> addressCtr;
		Constructor<Person> personCtr;
		Address a2, a3, a4; 
		Person p2, p3, p4;
			try {
				addressCtr = Address.class.getConstructor(int.class, String.class, String.class, String.class, String.class);
				a2 = addressCtr.newInstance(1738, "Seseme St", "Abc", "Nbc", "1234");
				a3 = addressCtr.newInstance(650, "Storke Rd", "Goleta", "Ca", "93107");
				a4 = addressCtr.newInstance(6657, "Sueno Rd", "Goleta", "Ca", "93107");
				
				personCtr = Person.class.getConstructor( String.class, String.class, Address.class, String.class);
				p2 = personCtr.newInstance("Juan", "Tejada", a2, "122-45-6789");
				p3 = personCtr.newInstance("Peter", "Parker", a3, "345-45-6789");
				p4 = personCtr.newInstance("Talent", "Wang", a4, "987-45-6789");
				
				
				System.out.println(p2.toString()+ "\tAge: " + p2.getAge());
				System.out.println(p3.toString()+ "\tAge: " + p3.getAge());
				System.out.println(p4.toString()+ "\tAge: " + p4.getAge());
				
				
				
				System.out.println("-------------------------------------------\n");
				
				/*
				 *  Question 4 
				 *  Use Java reflection to invoke setFirstName(), setLastName() and setAge() in one or more 
				 *  instance(s) of Person class
				 */
				
				System.out.println("Question 4, invoking setFistName(), setLastName() and setAge().");
			
				
				p2.setFirstName("Ben");
				p2.setLastName("Kenobi");
				p2.setAge(40);
				
				p3.setFirstName("Asoka");
				p3.setLastName("Tano");
				p3.setAge(18);
				
				p4.setFirstName("Anakin");
				p4.setLastName("Skywalker");
				p4.setAge(24);
				
				
				
				System.out.println(p2.toString() + "\tAge: " + p2.getAge());
				System.out.println(p3.toString() + "\tAge: " + p3.getAge());
				System.out.println(p4.toString() + "\tAge: " + p4.getAge());
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
			
		
	}//End main method
	
}
