//package exercise2;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int id;
	private float hourlyPay;
	
	//All set methods 

	
	/**
	 * Sets the hourly pay of the employee
	 * @param newPay The pay of the employee. Must be a positive value. 
	 * If the parameter is not entered correctly, it will set the value and inform the user about positive numbers.
	 */
	public void setHourlyPay(float newPay) {
		if(newPay > 0)
			this.hourlyPay = newPay;
		else
			System.out.println("Only positive numbers are accepted");
	}
	
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
	 * Sets the employee ID
	 * @param newID The employee ID, must be positive. 
	 * IF the parameter is not positive it will not set the ID and inform the user. 
	 */
	public void setID(int newID) {
		//Verifying the ID as positive
		if(newID >0)
			this.id = newID;
		else
			System.out.println("Only positive IDs are accepted");
	}
	
	
	/**
	 * Gets hourly pay of the employee.
	 * @return The base pay
	 */
	public float getHourlyPay() {return this.hourlyPay; }
	
	/**
	 * Gets the ID of the employee 
	 * @return The employee ID
	 */
	public int getID() {return this.id;}
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
	 * This introduce method is used for printing all of the employee information. 
	 */
	public void introduce() {
		System.out.print( "Employee Name: " + this.getFirstName());
		System.out.println(" "+ this.getLastName());
		System.out.println("Employee ID: " + this.getID() );
		System.out.println( "Hourly Pay: " + this.getHourlyPay());
		}		
	
	/**
	 * This method calculate the Pay of the Employee. 
	 * @param timeWorked The time worked.
	 * Throws Exceptions if the time worked is negative or over 40. 
	 */
	public float computePay(int timeWorked) throws NumberFormatException,TooManyHoursWorkedException {
		//First we see if the employee has a status and a basePay
		float earnings =0;

		if( timeWorked <=40 && timeWorked >= 0) {
			 earnings = (float)timeWorked*this.getHourlyPay();
				}
		else if(timeWorked < 0 ){
			String message = "NumberFormatException: Cannot work less than 0 hours";
			throw new NumberFormatException(message);
		}
		else if( timeWorked > 40) {
			String message = "TooManyHoursWorkedException: Cannot work more than 40 hours";
			throw new TooManyHoursWorkedException(message);
		}
		return earnings;
	}
	
	// The Constructor
	/**
	 * This is the Employee constructor 
	 * @param firstName The employee first name. 
	 * @param lastName  The employee last name
	 * @param id The employee  ID. 
	 * @param pay The employee base pay. For full-time employees enter the annual salary, otherwise enter the hourly rate. 
	 */
	public Employee(String firstName, String lastName, int id,  float pay)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.hourlyPay = pay;		
	}
	

	
	
	
	
	
	
	
	
	//The empty constructor 	
	/**
	 * This is the empty Employee constructor 
	 */
	public Employee() 
	{
		this.firstName = "";
		this.lastName = "";
		this.id = 0;
		this.hourlyPay = 0;
	}
	
}
