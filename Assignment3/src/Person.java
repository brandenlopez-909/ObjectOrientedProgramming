//package businessadmin;

public class Person {
	private String firstName;
	private String lastName;
	private String ssn;
	private int age; 
	private Address address;
	
	/**
	 * The empty person constructor. 
	 */
	public Person(){
			this.firstName = ""; 
			this.lastName = "";
			this.ssn = "";
			this.age =0;
			this.address = new Address();
	}
	
	//The UML diagram doesn't want age in the constructor
	/**
	 * The non-empty constructor
	 * @param firstName The first name
	 * @param lastName The last name
	 * @param address The address
	 * @param ssn The ssn
	 */
	public Person(String firstName, String lastName, Address address, String ssn ) {
		this.address = new Address(address);
		this.firstName = firstName; 
		this.lastName = lastName;
		this.address = address;	
		this.ssn = ssn;
		this.age =0;
		//this.age = age;	
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
	 * Sets the address
	 * @param newAddress The desired address
	 */
	public void setAddress(Address newAddress) {this.address = newAddress;}
	/**
	 * Set the address
	 * @param newSSN The desired SSN
	 */
	public void setSSN(String newSSN) {this.ssn = newSSN;}
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
	 * Gets the last name 
	 * @return The address
	 */
	public Address getAddress() {return this.address ;}
	/**
	 * Gets the SSN
	 * @return SSN
	 */
	public String getSSN() {return this.ssn ;}
	/**
	 * Gets the age
	 * @return age
	 */
	public int getAge() {return this.age ;}

	
	
	
}
