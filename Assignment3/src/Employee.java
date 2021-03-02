//package businessadmin;
/**
 * Tracks employee information
 *
 */
public class Employee extends Person{

	int id;
	String educationLevel;
	boolean directDeposit;
	
	/**
	 * The empty constructor
	 */
	Employee(){
		super();
		this.id = 0;
		
		}
	
	/**
	 * The non-empty Constructor
	 * @param firstName The desired first name
	 * @param lastName The desired last name
	 * @param address The desired address
	 * @param id The desired id
	 */
	
	 Employee(String firstName, String lastName, Address address, int id){
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setAddress(address);
			this.id = id;
	 }
	 
	 /**
	  * Gets the employee id
	  * @return id
	  */
	 public int getID() {return this.id;};
	 /**
	  * Get the employee education
	  * @return education
	  */
	 public String getEducation() {return this.educationLevel;}
	 /**
	  * Gets the Direct deposit information
	  * @return
	  */
	 public boolean getDirectDeposit() {return this.directDeposit;}
	 
	 /**
	  * Sets the ID
	  * @param newID The desired id
	  */
	 public void setID(int newID) {this.id =newID;}
	 /**
	  * Sets The education level
	  * @param newEDU The desired education level
	  */
	 public void setEducation(String newEDU) {this.educationLevel = newEDU;}
	 /**
	  * Sets the direct deposit boolean
	  * @param newDD If true, direct deposit is set up.
	  */
	 public void setDirectDeposit(boolean newDD) {this.directDeposit = newDD;}
	 
}
