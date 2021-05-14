/*
package exercise1;
*/
/**
 * Triangle Class
 *
 */
public class Triangle extends Shape{

	//Needs a ctr
	/**
	 * Triangle Constructor
	 * @param newLength The Height of the Triangle
	 * @param newWidth The Base of the Triangle
	 */
	Triangle(double newLength, double newWidth){
		super(newLength, newWidth);
	}
	//Empty ctr
	/**
	 * Empty triangle CTR
	 */
	Triangle(){super();}
	
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
		return super.computeArea() /2;
	}
	/**
	 * Returns the information in a neat string.  
	 */
	public String toString() {
		return ("Triangle: The length is " + this.len + " the width is "+ 
				this.width + " the area is " + this.computeArea());
				}
	
	
	
	
}
