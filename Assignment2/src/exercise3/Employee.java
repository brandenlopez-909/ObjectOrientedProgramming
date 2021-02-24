//package exercise3;

/**
 * 
 * 
 */

public class Employee extends Person{
	private int id;
	private String status;
	private double basePay;
	
	//All set methods 
	/**
	 * Sets the employee work status. 
	 * @param newStatus  f for full-time, p for part-time, and c for contractor.
	 * If the parameter is not entered correctly the it will not set the value and prompt the user to use the proper characters. 
	 */
	public void setStatus(String newStatus) {
		//Since this takes a newStatus we simply have to check the value and tell them to try again 
		if(newStatus == "f")
			this.status = "Full-Time";
		else if(newStatus == "c")
			this.status = "Contractor";
		else if(newStatus == "p")
			this.status = "Part-Time";
		else
			System.out.println("Please use character f for Full-Time \n c for Contractor \n p for Part-Time." );
	}
	
	/**
	 * Sets the base pay of the employee
	 * @param newPay The pay of the employee. Must be a positive value. 
	 * If the parameter is not entered correctly, it will set the value and inform the user about positive numbers.
	 */
	public void setBasePay(double newPay) {
		if(newPay > 0)
			this.basePay = newPay;
		else
			System.out.println("Only positive numbers are accepted");
	}
	
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
	 * Get the employee work status. 
	 * @return The employee work status.
	 */
	public String getStatus() {return this.status;}
	/**
	 * Gets base pay of the employee.
	 * @return The base pay
	 */
	public double getBasePay() {return this.basePay; }
	
	/**
	 * Gets the ID of the employee 
	 * @return The employee ID
	 */
	
	public int getID() {return this.id;}
	
	
	
	@Override 
	/**
	 * This introduce method is used for printing all of the employee information. 
	 */
	public void introduce() {
		System.out.print( "Employee Name: " + this.getFirstName());
		System.out.println(" "+ this.getLastName());
		System.out.println("SSN: "+ this.getSSN());
		System.out.println("Address: " + this.getAddress());
		System.out.print("Weight and Age: " + this.getWeight());
		System.out.println("Lbs & "+  this.getAge() + " years.");	
		System.out.println("Gender " + this.getGender()); 
		System.out.println( "Employment status: " + this.getStatus());
		System.out.println("Employee ID: " + this.getID() );
		System.out.println( "Base Pay: " + this.getBasePay());
		}		
	
	/**
	 * This method calculate the Pay of the Employee. This method ONLY WORKS after the status and basePay have been set. 
	 * @param timeWorked The time worked. Input weeks worked for full-time employees, otherwise enter the hours. 
	 */
	public void calculatePay(double timeWorked) {
		//First we see if the employee has a status and a basePay
		if(this.getStatus() != "" && this.getBasePay() != 0) {
			if(this.getStatus() != "f") {
				System.out.println("The pay for " + timeWorked +" hours is " +timeWorked*this.getBasePay() );
				}
			else{
				// I googled how many weeks in a year and the answer was 52.143
				// Despite this lab instructs us to use 52weeks
				// If we divide the annual salary by this we can get the pay for each week worked. 
				System.out.println("The pay for " + timeWorked +" weeks is " + (this.getBasePay()/52)*timeWorked); 
				
				}
		}
		else 
			System.out.print("Please set the status first and try again");
	}
	
	// The Constructor
	/**
	 * This is the Employee constructor 
	 * @param firstName The employee first name. 
	 * @param lastName  The employee last name
	 * @param address  The employee address.
	 * @param ssn  The employee SSN.
	 * @param gender The employee gender.
	 * @param age The employee age.
	 * @param weight The employee weight. 
	 * @param id The employee  ID. 
	 * @param status The employee employment status. Ie: f for full-time, p for part-time, c for contractor. 
	 * @param pay The employee base pay. For full-time employees enter the annual salary, otherwise enter the hourly rate. 
	 */
	public Employee(String firstName, String lastName, String address, String ssn, String gender, int age, float weight, int id, String status, double pay)
	{
		super(firstName, lastName, address, ssn, gender,age,weight);

		this.id = id;
		this.status = status;
		this.basePay = pay;		
	}
	

	
	
	
	
	
	
	
	
	//The empty constructor 	
	/**
	 * This is the empty Employee constructor 
	 */
	public Employee() 
	{
		this.setFirstName(""); 
		this.setLastName("");
		this.setAddress("");
		this.setSSN("");
		this.setGender("");
		this.setAge(0);
		this.setWeight(0);
		this.id = 0;
		this.status = "";
		this.basePay = 0;
	}
	

	
}