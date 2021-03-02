//package businessadmin;

/**
 * Tracks information of the Full time hourly employee 
 *
 */
public class FullTimeHourly extends FullTimeEmployee {
	private double overTimePay;

	/**
	 * The empty construcor
	 */
	public FullTimeHourly() {
		super();
		this.overTimePay = 0;
	}
	
	/**
	 * The non-empty constructor 
	 * @param firstName First name
	 * @param lastName Last name
	 * @param address The address
	 * @param id The id 
	 * @param basePay The base pay
	 * @param overtime The overtime pay
	 */
	public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtime) {		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setID(id);
		this.setBasePay(basePay);
		this.overTimePay = overtime;
		
	}
	
	//Setters
	//IDK if the person who wrote this hw knows what overtime pay is.
	/**
	 * Sets the overtime pay as described as the UML diagram
	 * @param newOverTimePay The desired overtime pay
	 */
	public void setOverTimePay(double newOverTimePay) { this.overTimePay = newOverTimePay;}
	
	//Getters
	/**
	 * Gets the overtime pay
	 * @return Overtime pay
	 */
	public double getOverTimePay() {return this.overTimePay;}
	
	@Override
	/**
	 * @return "FullTimeHourly Employee " + this.getID() +  ": " + this.getFirstName() +" " + this.getLastName();
	 */
	public String toString() {
		return "FullTimeHourly Employee " + this.getID() +  ": " + this.getFirstName() +" " + this.getLastName();
		
	}
	
	/**
	 * Prints the toString Method
	 * @param displaySSN If true, displays the SSN. 
	 */
	public void introduce(boolean displaySSN) {
		if(displaySSN)
			System.out.println( toString() + "\n 	SSN:" + getSSN());
		else 
			System.out.println( toString() );
	}
	
	
	/**
	 * Computes the pay if the employee
	 * @param numHRS The number of hours worked 
	 * @return The pay
	 */
	public double computePay(int numHRS) {
		if(numHRS <41)
			return numHRS* this.getBasePay();
		else
			return 40*this.getBasePay() + (numHRS - 40)*this.getOverTimePay();
	}
}
