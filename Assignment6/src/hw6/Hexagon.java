//package hw6;

/**
 * Hexagon Class: This class works with the measurement of the side
 *
 * @author JungleBook
 *
 */
public class Hexagon extends Shape{
	//Needs a ctr
 
	/**
	 * Hexagon Constructor
	 * @param newLength: The length of a side.
	 */
	Hexagon(double newLength){
		super(newLength);
	}
	//Empty ctr
	/**
	 * No-args Hexagon Constructor
	 */
	Hexagon(){super();}
	
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
		
	@Override
	/**
	 * Computes the area
	 */
	synchronized public double computeArea() {
		
		return ( (3* Math.sqrt(3) * Math.pow( super.getLength() , 2 ) )/2 );
	}
	
	/**
	 * Returns the information in a neat string.  
	 */
	public String toString() {
		return ("Hexagon: The length is " + this.len + " the width is "+ 
				this.width + " the area is " + this.computeArea());
				}
}
