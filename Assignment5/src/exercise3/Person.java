//package exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person {
	private String firstName;
	private String lastName;
	private int age; 
	
	/**
	 * The empty person constructor. 
	 */
	public Person(){
			this.firstName = ""; 
			this.lastName = "";
			this.age =0;

	}
	
	/**
	 * The non-empty constructor
	 * @param firstName The first name
	 * @param lastName The last name
	 * @param age The age
	 */
	public Person(String firstName, String lastName, int age ) {
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;	
	}
	
	//Setters
	/**
	 * Sets the first name
	 * @param newFirstName the desired first name 
	 */
	public void setFirstName(String newFirstName) {this.firstName = newFirstName;}
	/**
	 * Sets the  Last name
	 * @param newLastName the desired last name
	 */
	public void setLastName(String newLastName) {this.lastName = newLastName;}
	/**
	 * Sets the age
	 * @param newAge  the desired age
	 */
	public void setAge(int newAge) {this.age = newAge;}
	
	//Getters 
	/** 
	 * Gets the first name
	 * @return first name
	 */
	public String getFirstName() {return this.firstName ;}
	/**
	 * Gets the last name
	 * @return Last name 
	 */
	public String getLastName() {return this.lastName ;}

	/**
	 * Gets the age
	 * @return age
	 */
	public int getAge() {return this.age ;}

	//We need a method to sort Arrays
	/**
	 * Sorts an array of Person.
	 * @param people The ArrayList of Person Type. 
	 * @param method The Person variable we sort on.(firstName, lastName, age)
	 * @param ascending A boolean, true is ascending, false is descending.
	 */
	public static void sortPeople(ArrayList<Person> people ,String method ,boolean ascending) {
		
		if(ascending) {
			if(method == "firstName") {
				Collections.sort(people, new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {
					return p1.getFirstName().compareTo(p2.getFirstName()); 
					}
				});
			}	
			if(method =="lastName") {
				Collections.sort(people, new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {						//We need the getmethod to change below. 
					return p1.getLastName().compareTo(p2.getLastName()); 
					}
				});
			}
			if(method =="age") {
				Collections.sort(people, new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {						//We need the getmethod to change below. 
					return p1.getAge() - p2.getAge(); 
					}
				});
			}
			
		}//End of ascending
		else {
			if(method == "firstName") {
				Collections.sort(people, new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {
					return p2.getFirstName().compareTo(p1.getFirstName()); 
					}
				});
			}	
			if(method =="lastName") {
				Collections.sort(people, new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {						//We need the getmethod to change below. 
					return p2.getLastName().compareTo(p1.getLastName()); 
					}
				});
			}
			if(method =="age") {
				Collections.sort(people, new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {						//We need the getmethod to change below. 
					return p2.getAge() - p1.getAge(); 
					}
				});
			}
		}
		for(Person i: people)
			i.printInfo();
	}
	
	/**
	 * Used to print instance information.
	 * Must be used if you don't want the hashcode. 
	 */
	public void printInfo() {
		System.out.println( this.firstName +" " + this.lastName + " " +
							this.age );
	}
}
