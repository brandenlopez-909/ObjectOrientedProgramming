//package businessadmin;

public class Address {
	private String streetName, city,  state, zip;
	private int  streetNum ;
	
	
	/**
	 * The Requested constructor 
	 * @param streetNumber The street Number
	 * @param streetName The street Name
	 * @param cityName The city name
	 * @param state The state
	 * @param zipCode The zip code
	 */
	public Address(int streetNumber, String streetName , String cityName, String state , String zipCode ){ 
		if(streetNumber <1) 
		{System.out.println("Please enter a positive integer for the street number");}
		else {
		this.streetNum = streetNumber;
		this.streetName = streetName;
		this.city = cityName;
		this.state = state;
		this.zip = zipCode;}
	}
	
	public Address() {
		this.streetNum = 0;
		this.streetName = "";
		this.city = "";
		this.state = "";
		this.zip = "";
	}
	
	
	/**
	 * Takes an address class and instantiates it
	 * @param theAddress The addressInstance which will be fed back.
	 */
	public Address(Address theAddress){
		this.streetNum = theAddress.streetNum;
		this.streetName = theAddress.streetName;
		this.city = theAddress.city;
		this.state = theAddress.state;
		this.zip = theAddress.zip;
		
	}
	
	//The Setters
	/**
	 * Sets the street number
	 * @param newStreetNum The street number 
	 */
	public void setStreetNum(int newStreetNum) {this.streetNum = newStreetNum;}
	/**
	 * Sets the street name 
	 * @param newStreetName The street name
	 */
	public void setStreetName(String newStreetName) {this.streetName = newStreetName;}
	/**
	 * Sets the City name
	 * @param newCity The city
	 */
	public void setCity(String newCity) {this.city = newCity;}
	/**
	 * Sets the state
	 * @param newState The state
	 */
	public void setState(String newState) {this.state = newState;}
	/**
	 * Sets the zip code
	 * @param newZip The zip code
	 */
	public void setZip(String newZip) {this.zip = newZip;}
	
	
	//The Getters
	/**
	 * Gets the street number
	 * @return The Street number 
	 */
	public int getStreetNum() {return this.streetNum ;}
	/**
	 * Gets the street name
	 * @return the street name
	 */
	public String getStreetName() {return this.streetName ;}
	/**
	 * Gets the city
	 * @return The city
	 */
	public String getCity() {return this.city ;}
	/**
	 * Gets the state
	 * @return the state
	 */
	public String getState() {return this.state ;}
	/**
	 * Gets the zipcode
	 * @return The zipcode
	 */
	public String getZip() {return this.zip ;}
	
	
	@Override
	/**
	 * @return this.streetNum + this.streetName + this.city+ this.state +this.zip;
	 */
	public String toString() {
		return this.streetNum + this.streetName + this.city+ this.state +this.zip;
	}
	

}
