//package exercise2;

/**
 * Custom Exception 
 * Used for the Employee.computePay Method
 * If someone works more than 40 hours we throw this Exception
 */
public class TooManyHoursWorkedException extends Exception{
	/**
	 * Our custom exception. 
	 * @param e The error message
	 */
	TooManyHoursWorkedException(String e){
		super(e);
	}
	
	@Override
	/**
	 * Gets the message passed to our custom exception 
	 */
	public String getMessage() {
		return super.getMessage();
	}
	
}
