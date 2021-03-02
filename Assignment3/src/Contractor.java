//package businessadmin;

/**
 * This class tracks information on contracted employees.
 * Contractors do not earn overtime. 
 */
public class Contractor extends Employee {

		private double basePay;
		
		/**
		 * The empty constructor
		 */
		public Contractor(){
			super();
			this.basePay = 0;
		}
		
		/**
		 * The non-empty constructor
		 * @param firstName Fist name
		 * @param lastName Last NAme
		 * @param address The Address
		 * @param id The employee ID
		 * @param pay The employee Pay
		 */
		public Contractor(String firstName, String lastName, Address address, int id, double pay) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setID(id);
		this.basePay = pay;
		}
		
		//Setters
		/**
		 * Sets the base Pay
		 * @param newPay The desired pay
		 */
		public void setBasePay(double newPay) {this.basePay = newPay;}
		
		//Getters
		/**
		 * Gets the employee pay
		 * @return The employee pay
		 */
		public double getBasePay() {return this.basePay;}
		
		@Override
		/**
		 * Returns contractor information
		 * @return "Contractor " + this.getID() +": " + this.getFirstName() +this.getLastName();
		 */
		public String toString() {
			return "Contractor " + this.getID() +": " + this.getFirstName() +this.getLastName();
		}
		
		/**
		 * Prints the toString method
		 * @param displaySSN A boolean that if true, prints the employee SSN. 
		 */
		public void introduce(boolean displaySSN) {
			if(displaySSN)
				System.out.println(toString() + "\n 	SSN: " + getSSN());
			else
				System.out.println(toString());
		}

		/**
		 * Computes the pay
		 * @param numHRS The hours worked 
		 * @return The total pay
		 */
		public double computePay(int numHRS) {
			return numHRS*this.getBasePay();

		}
		
}
		
		
