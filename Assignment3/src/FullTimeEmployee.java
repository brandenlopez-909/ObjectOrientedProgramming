//package businessadmin;
/**
 * Tracks the information of the full time employee
 * 
 */
public class FullTimeEmployee extends Employee {
	private double basePay;
	
	/**
	 * The empty constructor
	 */
	public FullTimeEmployee() {
		super();
		this.basePay = 0;
	}

	/** The 
	 * non-empty constructor
	 * @param firstName First name
	 * @param lastName Last name
	 * @param address The address
	 * @param id The id 
	 * @param basePay The base pay
	 */
	public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setID(id);
		this.basePay = basePay;
	}
	
	//Setter
	/**
	 * Sets the base pay
	 * @param newPay The desired pay
	 */
	public void setBasePay(double newPay) {this.basePay = newPay;}
	
	//Getter
	/**
	 * Gets the base pay
	 */
	
	public double getBasePay() {return this.basePay;}
	
	
	
}
