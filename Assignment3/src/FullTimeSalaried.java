//package businessadmin;

/**
 * Tracks information on the Full time salaried employee
 *
 */
public class FullTimeSalaried extends FullTimeEmployee{

	/**
	 * The empty constructor
	 */
	FullTimeSalaried(){
		super();
	}
	
	/**
	 * The non-empty constructor
	 * @param firstName First name
	 * @param lastName Last name
	 * @param add The Address
	 * @param id The id 
	 * @param salary The salary
	 */
	FullTimeSalaried( String firstName, String lastName, Address add, int id ,double salary){
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(add);
		this.setBasePay(salary);
		this.setID(id);
		
	}
	
	@Override
	/**
	 * @ return "Full-Time Salaried Employee " + this.getID() + ": " + this.getFirstName()
	 */
	public String toString() {
		return "Full-Time Salaried Employee " + this.getID() + ": " + this.getFirstName()
		+ " " +this.getLastName();
	}
	
	/**
	 * Prints the toString() method
	 * @param displaySSN If true, displays the employee SSN
	 */
	public void introduce(boolean displaySSN) {
		if(displaySSN) {
			System.out.println( toString() + "\n 	SNN:"+ this.getSSN());}
		else
			System.out.println( toString() );
	}
	
	/**
	 * Computes the pay
	 * @param numWeeks The number of weeks worked 
	 * @return The pay for n weeks worked.
	 */
	public double computePay(int numWeeks) {
		return numWeeks*(this.getBasePay()/52);}
}
