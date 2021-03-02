//package businessadmin;

/**
 * This class tracks information of Executive employees.
 *
 */
public class Executive extends Employee{
	private double yearlyCompensation, yearlyBonus;

	/**
	 * The empty constructor
	 */
	public Executive() {
		super();
		this.yearlyCompensation = 0;
		this.yearlyBonus = 0;
	}
	
	/**
	 * The non-empty constructor
	 * @param firstName First name
	 * @param lastName Last name
	 * @param address Address
	 * @param id The employee ID
	 * @param pay The executive Pay
	 * @param bonus The yearly bonus
	 */
	public Executive(String firstName, String lastName, Address address, int id, double pay, double bonus) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setID(id);
		this.yearlyCompensation = pay;
		this.yearlyBonus = bonus;
	}
	
	//Setters
	/**
	 * Sets the executive bonus
	 * @param newBonus The desired bonus
	 */
	public void setBonus(double newBonus) {this.yearlyBonus = newBonus;}
	/**
	 * Sets the executive pay.
	 * @param newPay The desited pay
	 */
	public void setCompensation(double newPay) {this.yearlyCompensation = newPay;}
	
	//Getters
	/**
	 * Gets the bonus
	 * @return
	 */
	public double getBouns() {return this.yearlyBonus;}
	
	/**
	 * Get the yearly compensation
	 * @return The compensation
	 */
	public double getCompensation() {return this.yearlyCompensation;}
	
	@Override
	/**
	 * @return "Executive " + this.getID() +": " + this.getFirstName() + this.getLastName();
	 */
	public String toString() {
		return "Executive " + this.getID() +": " + this.getFirstName() + this.getLastName();
	}
	
	/**
	 * Prints the toString method
	 * @param displaySSN
	 */
	public void introduce(boolean displaySSN) {
		if(displaySSN)
			System.out.println(toString() + "\n	SSN: " + this.getSSN());
		else 
			System.out.println(toString());
			
	}
	
	/**
	 * Computes the pay of the Executive 
	 * @return this.yearlyCompensation + this.yearlyBonus;
	 */
	public double computePay() {
		return this.yearlyCompensation + this.yearlyBonus;
	}

}

