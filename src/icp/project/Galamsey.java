package icp.project;


/**
 * @author Georgette Asiedu
 * @author Naa Akle Noi
 * @author Ransford Nyarko
 * @author Joseph Prince-Agbodjan
 * This is the galamsey class to store and retrieve information about the 
 * vegetation color, color value, position(latitude and longitude) and year of the event
 */ 


public class Galamsey {
	
	Color colorValue;			//instance variable for color value
	
	String vegColor;			//instance variable for vegetation color
	
	double latitude;			//instance variable for latitude of the location
	
	double longitude;			//instance variable for longitude of the location
	
	int yearEvent;				//instance variable for the year of the Galamsey event
	
	
	/**
	 * @version 0
	 * This is an enum class that converts the color value entered by the user to the appropriate color value
	 */
	public enum Color{
		
		one("Green"), two("Yellow"), three("Brown");

		String vegColour;		//instance variable to store the vegetation color of the enum
		
		/**
		 * @param vcol
		 */
		Color(String vcol) {
			
			this.vegColour = vcol;
			
		}
		
		/**
		 * @return vegColor
		 */
		public String getColor() {
			
			return this.vegColour;
		}
	}
	
	
	/**
	 * Default constructor
	 * @version 1.1
	 */
	public Galamsey() {}

	/**
	 * @param cval
	 * @param lat
	 * @param lon
	 * @param yr
	 * @throws IllegalArgumentException
	 * overloaded constructor that instantiates an object of the Galamsey class
	 */
	public Galamsey(String cval,double lat,double lon,int yr)throws IllegalArgumentException {
		
		this.colorValue = Color.valueOf(cval);
		
		this.vegColor = colorValue.getColor();
		
		this.latitude = lat;
		
		this.longitude = lon;
		
		if(yr > 99 && yr < 9999) {
			this.yearEvent = yr;
		}
		else{throw new IllegalArgumentException();}
	}
	
	
	
	//SETTERS
	
	
	/*
	 * Return the color value of the field
	 */
	public int getColorValue() {
		
		if(this.vegColor == "Green") return 1;
		else if(this.vegColor == "Yellow") return 2;
		else return 3;
		
	}
	

	/*
	 * @param colorValue
	 * set the color value of the field
	 */
	public void setColorValue(String colval) {
		
		this.colorValue = Color.valueOf(colval);
		
		this.vegColor = colorValue.getColor();
		
	}
	
	/*
	 * @param latitude
	 * set the latitude of the field
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	/*
	 * @param yearEvent
	 * Set the year of the event
	 */
	public void setYearEvent(int yearEvent) {
		this.yearEvent = yearEvent;
	}
	
	/*
	 * @param longitude
	 * Set the longitude of the field
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	//GETTERS
	
	/*
	 * Return the latitude of the field
	 */
	public double getLatitude() {
		return latitude;
	}
	

	/*
	 * Return the longitude of the field
	 */
	public double getLongitude() {
		return longitude;
	}
	

	/*
	 * Get the year of the event
	 */
	public int getYearEvent() {
		return yearEvent;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * toString() method
	 * Auxilliary method that prints the details of a galamsey event
	 */
	public String toString() {
		return "The colour of the vegetation is: "+ this.vegColor + '\n' +
				"The color value is: " + getColorValue() + '\n' + 
				"The position of the location has latitude " + this.latitude + " and longitude " +this.longitude + '\n' + 
				"The year of the event is: " + this.yearEvent;
	}
	
	public static void main(String[] args) throws Exception {
		
		Galamsey g = new Galamsey("one", 3.2, 4.5, 2019);
		
		System.out.println(g.toString());
		
	}

}
