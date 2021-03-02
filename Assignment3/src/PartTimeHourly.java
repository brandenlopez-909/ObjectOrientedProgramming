//package businessadmin;

/**
 * This package tracks information on PartTimeHourly Employees.
 * This class can only work up to 40 hrs. 
 */
public class PartTimeHourly extends Employee{
	
	private double baseHourlyPay; 
	/**
	 * Empty Constructor
	 */
	public PartTimeHourly() {
		super();
		this.baseHourlyPay = 0;	
	}
	
	/**
	 * Ctr that accepts arguments
	 * @param firstName First Name
	 * @param lastName Last Name
	 * @param address The Address
	 * @param id The employee Id
	 * @param pay The employee pay
	 */
	PartTimeHourly(String firstName, String lastName, Address address, int id, double pay){
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setID(id);
		this.baseHourlyPay = pay;
	}
	
	//Setter
	/**
	 * Sets the hourly pay
	 * @param newPay The desired pay
	 */
	public void setHourlyPay(double newPay) {this.baseHourlyPay =newPay;}
	//Getters
	/**
	 * Gets the hourly pay.
	 * @return The employee hourly pay. 
	 */
	public double getHourlyPay() {return this.baseHourlyPay;}
	
	@Override
	/**
	 * @return "Hourly Part-Time Employee " + this.getID() + ": " + this.getFirstName() + " " + this.getLastName();
	 */
	public String toString() {
		return "Hourly Part-Time Employee " + this.getID() + ": " + this.getFirstName() + " " + this.getLastName();
	}
	
	/**
	 * Prints the toString method
	 * @param displaySSN A boolean that if true, will also print the SSN. 
	 */
	public void introduce(boolean displaySSN) {
		if(displaySSN)
			System.out.println( this.toString() + "\n	SSN " +this.getSSN() );
		else
			System.out.println(this.toString());
	}
	/**
	 * A method that computes the pay of the employee
	 * @param numHRS The hours worked
	 * @return The pay if under 41 hours worked. If more it returns -1.
	 */
	public double computePay(int numHRS) {
		if(numHRS < 41)
			return numHRS*this.getHourlyPay();
		else 
			return -1;
	}
	
	
}
