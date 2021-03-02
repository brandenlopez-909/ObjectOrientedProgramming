//package businessadmin;
/**
 * This class is a that tracks the customer information
 *
 */
public class Customer extends Person{
	private int customerID;
	private String payPreference;
	
	/**
	 * This is an empty constructor
	 */
	public Customer(){
		super();
		this.customerID = 0;
		this.payPreference = "";
	}
	
	/**
	 * A Customer constructor that can have arguments passed
	 * @param firstName The first name 
	 * @param lastName The last naem 
	 * @param address The address.
	 * @param id The customer id
	 */
	public Customer(String firstName, String lastName, Address address, int id) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.customerID = id;
	}
	
	//Setters
	/**
	 * Sets the Customer ID
	 * @param newCustomerID The desired ID
	 */
	public void setCustomerID(int newCustomerID) {this.customerID = newCustomerID  ;}
	/**
	 * Sets the Customer Pay Preference
	 * @param newPP The desired pay preference
	 */
	public void setPayPreference(String newPP) {this.payPreference = newPP  ;}
	
	//Getters
	/**
	 * Gets the customer ID
	 * @return the customer ID
	 */
	public int getCustomerID() {return this.customerID;}
	/**
	 * Gets the pay preference
	 * @return The pay preference
	 */
	public String getPayPreference() {return this.payPreference;}
	
	@Override
	/**
	 * When printing the instance it will return this.
	 * @return"Customer " +getCustomerID()+ ": "+ this.getFirstName() +  " "+this.getLastName()
		+". Has a pay preference of: " + this.payPreference;	
	 */
	public String toString() {
		return "Customer " +getCustomerID()+ ": "+ this.getFirstName() +  " "+this.getLastName()
		+". Has a pay preference of: " + this.payPreference;		
	}
	
	/**
	 * Will automatically print, toString.
	 */
	public void introduce() {
		System.out.println( toString());
	}
	
	/**
	 * Will print the preferred method of pay.
	 */
	public void makePayment() {
		System.out.println("The prefered method of payment is: " + this.getPayPreference());
	}
	
		
	
	
}
