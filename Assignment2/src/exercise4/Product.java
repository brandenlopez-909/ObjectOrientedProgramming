//package exercise4;

/**
 * This class is an implementation of an immutable class. 
 *
 */
public final class Product {
	final private String productName;
	final private String productDescription; 
	final private double  productPrice;
	final private int maxQuantity;
	
	//The constructor
	/**
	 * The constructor for the immutable class.
	 * @param productName The name of the product.
	 * @param productDescription The product description. 
	 * @param productPrice The product price.
	 * @param maxQuantity The max quantity. 
	 */
	public Product(String productName, String productDescription,double productPrice,int maxQuantity ) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.maxQuantity = maxQuantity;
	}
	
	//All Getters
	/**
	 * Gets the Product name
	 * @return The product name 
	 */
	public String getProductName() {return this.productName;}
	/**
	 * Get the product description
	 * @return the product description 
	 */
	public String getProductDescription(){return this.productDescription;}
	/**
	 * Gets the product price
	 * @return The product price
	 */
	public double getProductPrice() {return this.productPrice;}
	/**
	 * Gets the max quantity
	 * @return The max quantity
	 */
	public int getMaxQuantity() {return this.maxQuantity;}

	@Override
	/**
	 * @return this.productName + "\n" + this.productDescription + "\nPrice " + this.productPrice + ", limit " + this.maxQuantity; 
	 */
	public String toString(){
		String newString = this.productName + "\n" + this.productDescription + "\nPrice " + this.productPrice + ", limit " + this.maxQuantity; 
		return newString;
		
	}
	
	/**
	 * Used to test the Proudct Class
	 */
	public static void main(String[] args) {
		Product wiskey = new Product("Wiskey", "Dark and good", 25.00,1);
		System.out.println(wiskey);
	}
			
}

