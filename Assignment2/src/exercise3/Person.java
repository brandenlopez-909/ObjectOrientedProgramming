//package exercise3;

/**
 * This class takes has many tools to log people/ 
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String ssn;
	private String gender;
	private int age; 
	private float weight;
	
	/**
	 * The empty constructor.
	 */
	public Person() 
	{
		this.firstName = ""; 
		this.lastName = "";
		this.address = "";
		this.ssn = "";
		this.gender = "";
		this.age =0;
		this.weight =0;
		
		
	}
	
	/**
	 * The filled constructor
	 * @param firstName The person's first name.
	 * @param lastName The person's last name.
	 * @param address The person's address.
	 * @param ssn The person's SSN.
	 * @param gender The person's gender.
	 * @param age The person's age.
	 * @param weight The person's weight. 
	 */
	public Person(String firstName, String lastName, String address, String ssn,String gender, int age, float weight  ) 
	{
		this.firstName = firstName; 
		this.lastName = lastName;
		this.address = address;	
		this.ssn = ssn;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		
		
		
		
	}
	
	@Override
	/**
	 * @return this.firstName + " " + this.lastName + ". SSN: " + this.ssn
	 */
	public String toString() {
		String newString = this.firstName + " " + this.lastName + ". SSN: " + this.ssn;
		return newString;
	}
	
	/**
	 * A method that prints out all of the instance variables. 
	 */
	public void introduce() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(weight);
		System.out.println(ssn);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
	}
	
	//All set methods.
	/**
	 * Sets the Person's first name .
	 * @param newName The person's first name.
	 */
		public void setFirstName(String newName) {this.firstName = newName;}
		/**
		 * Sets the person's last name.
		 * @param newName the person's last name.
		 */
		public void setLastName(String newName) {this.lastName = newName;}
		
		/**
		 * sets the person's address.
		 * @param newAddress sets the person's address.
		 */
		public void setAddress(String newAddress) {this.address = newAddress;}
		/**
		 * Sets the SSN.
		 * @param newSocialNum the SSN.
		 */
		public void setSSN(String newSocialNum) {this.ssn = newSocialNum;}
		/**
		 * Sets the person's weight.
		 * @param newWeight The person's weight. 
		 */
		public void setWeight(float newWeight) {this.weight = newWeight;}
		/**
		 * Sets the person's age.
		 * @param newAge The person's age.
		 */
		public void setAge(int newAge) {this.age = newAge;}
		/**
		 * Sets the person's gender.
		 * @param newGender The person's gender.
		 */
		public void setGender(String newGender) {this.gender = newGender;}
		
	//All Getters
		/**
		 * Gets the person's fist name.
		 * @return First name. 
		 */
		public String getFirstName() {return this.firstName;}
		/**
		 * Gets the person's last name.
		 * @return Last name
		 */
		public String getLastName() {return this.lastName ;}
		/**
		 * Gets the SSN
		 * @return SSN
		 */
		public String getSSN() {return this.ssn;}
		/**
		 * Gets the address.
		 * @return Address
		 */
		public String getAddress() {return this.address;}
		/**
		 * Gets the weight
		 * @return Weight 
		 */
		public float getWeight() {return this.weight;}
		/**
		 * Gets the age
		 * @return age
		 */
		public int getAge() {return this.age;}	
		/**
		 * Gets the gender. 
		 * @return gender
		 */
		public String getGender() {return this.gender;} 
}
