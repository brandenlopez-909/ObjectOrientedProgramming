//package exercise1;

/**
 * Is a rectangle
 *
 */
public class Rectangle extends Shape{

	//Needs a ctr
	/**
	 * Rectangle constructor
	 * @param newLength The length
	 * @param newWidth The Width
	 */
	Rectangle(double newLength, double newWidth){
		super(newLength, newWidth);
	}
	
	//Empty ctr
	/**
	 * Rectangle constructor that takes no arguments 
	 */
	Rectangle(){super();}
	
	//Setters
	/**
	 * Sets the length
	 */
	public void setLength(double newLength) {
		super.setLength(newLength);
	}
	
	/**
	 * Sets the width
	 */
	public void setWidth() {
		super.setWidth(width);
	}
	
	//Getters 
	/**
	 * Gets the width
	 */
	public double getWidth(){
		return super.getWidth();
	}
	
	/**
	 * Gets the length
	 */
	public double getLength(){
		return super.getLength();
	}
	
	/**
	 * Computes the area
	 */
	synchronized public double computeArea() {
		return super.computeArea();
	}
	
	/**
	 * Returns the information in a neat string.  
	 */
	public String toString() {
		return ("Rectangle: The length is " + this.len + " the width is "+ 
				this.width + " the area is " + this.computeArea());
				}
	
	
	
	
	
	
}
