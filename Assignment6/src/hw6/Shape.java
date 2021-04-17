//package hw6;

/**
 * Shape Class
 *
 */
public class Shape {
	double width; 
	double len;
	
	//Empty Ctr
	/**
	 * No-args Contructor 
	 */
	Shape(){
		this.width = 0;
		this.len = 0;
	}
	
	//Single CTR for circle and hexagon
	/**
	 * Some 2-D shapes only need a single argument to compute their area
	 * I.e: A circle only needs a radius or a hexagon only a side. 
	 * @param newLength
	 */
	Shape(double newLength){
		this.len = newLength;
		this.width =1;
	}
	
	//Ctr
	/**
	 * 2-D shape constructor
	 * @param newLength The length
	 * @param newWidth The Width
	 */
	Shape(double newLength, double newWidth ){
		this.width = newWidth;
		this.len = newLength;
	}
	
	//Setters 
	/**
	 * Sets the length
	 */
	public void setWidth(double newWidth) {
		this.width = newWidth;
	} 
	
	/**
	 * Sets the width
	 */
	public void setLength(double newLength) {
		this.len = newLength;
	} 
	
	//Getters 
	/**
	 * Gets the width
	 */
	public double getWidth() {
		return this.width;
	}
	
	/**
	 * Gets the length
	 */
	public double getLength() {
		return this.len;
	}
	
	/**
	 * Computes the area
	 */
	synchronized public double computeArea() {
		return len*width;
	}
	
	
	
}
