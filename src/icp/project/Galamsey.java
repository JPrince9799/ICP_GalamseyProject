package icp.project;

import java.util.Scanner;

/*
 * @author Ransford Nyarko
 * @author Naa Akle Noi
 * @author Georgette Asiedu
 * @author Joseph Prince-Agbodjan
 * @version 1.1
 * 
 * This is the galamsey class to store and retrieve information about the 
 * vegetation color, color value, position(latitude and longitude) and year of the event
 */

public class Galamsey {
	
	int colorValue;
	double latitude;
	double longitude;
	int yearEvent;
	enum color{GREEN, YELLOW, BROWN};
	color Colour;
	
	public Galamsey() {}
	
	/*
	public Galamsey(int clvalue, double lat, double lng, String yr, color Colour) {
		
		this.latitude = lat;
		this.longitude = lng;
		this.yearEvent = yr;
		this.colorValue = clvalue;
		this.Colour = Colour;
		
	}
	*/
	
	private void input() {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			
			int clval = 0;
			
			System.out.println("Iteration " + i);
			
			if(i == 1) {
				
				
				System.out.println("Enter the color value <1, 2, or 3>: ");

				clval = scan.nextInt();
				
				if(0 < clval) {
					
					if(clval <= 3) {
						
						System.out.println("Colour Value is now: " + clval);
						
						System.out.println("This is a Valid Colour value");
						
						this.colorValue = clval;
						
						continue;
					}
					
				}
				
					
				else {
					
					System.out.println("other!");
					
				}
			}
			
			if(i == 2) {
				
				System.out.println("Enter the latitude: ");
				
				double lt = scan.nextDouble();
				
				this.latitude = lt;
				/*
				try {
					
					double lat = Double.parseDouble(lt);
					
					this.latitude = lat;
					
				}
				
				catch(Exception e) {
					
					e.getMessage();
					
				}
				*/
			}
		
			if(i == 3) {
				
				System.out.println("Enter the longitude: ");
				
				double lg = scan.nextDouble();
				
				this.longitude = lg;
				/*
				try {
					
					double lon = Double.parseDouble(lg);
					
					this.longitude = lon;
					
				}
				
				catch(Exception e) {
					
					e.getMessage();
										
				}
				*/
			}
			
			if(i == 4) {
				
				System.out.println("Enter the year of the event: ");
				
				int yr = scan.nextInt();
				
				this.yearEvent = yr;
				/*
				try {
					
					int year = Integer.parseInt(yr);
					
					if (0000 < year && year <= 9999) {
						
						this.yearEvent = year;
					}
					
				}
				
				catch(Exception e) {
					
					e.getMessage();

				}
				*/
			}
			
			if (i == 5) {
				
				System.out.println("Enter the color: ");
				
				String col = scan.nextLine().toUpperCase();
				
				/*
				if(clval == 1 && (!(col.equals("GREEN")))) {
					
					System.out.println("The colour you entered does not match the colour value");
					
				}
				if(clval == 2 && (!(col.equals("YELLOW")))) {
					
					System.out.println("The colour you entered does not match the colour value");
					
				}
				if(clval == 3 && (!(col.equals("BROWN")))) {
					
					System.out.println("The colour you entered does not match the colour value");
					
				}
				*/
				if(col.equals("GREEN")){
					
					setColour(color.GREEN);
					
				}
				
				else if(col.equals("YELLOW")) {
					
					setColour(color.YELLOW);
					
				}
				
				else if(col.equals("BROWN")) {
					
					setColour(color.BROWN);
					
				}
				
			}
			
		}
				
	}
	
	
	//GETTERS AND SETTERS	
	/*
	 * Return the color value of the field
	 */
	public int getColorValue() {
		return colorValue;
	}
	
	/*
	 * This gets the color of the vegetation
	 */
	public color getColour() {
		return Colour;
	}

	public void setColour(color colour) {
		Colour = colour;
	}

	/*
	 * @param colorValue
	 * set the color value of the field
	 */
	public void setColorValue(int colorValue) {
		this.colorValue = colorValue;
	}
	
	/*
	 * Return the latitude of the field
	 */
	public double getLatitude() {
		return latitude;
	}
	
	/*
	 * @param latitude
	 * set the latitude of the field
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	/*
	 * Return the longitude of the field
	 */
	public double getLongitude() {
		return longitude;
	}
	
	/*
	 * @param longitude
	 * Set the longitude of the field
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/*
	 * Get the year of the event
	 */
	public int getYearEvent() {
		return yearEvent;
	}

	/*
	 * @param yearEvent
	 * Set the year of the event
	 */
	public void setYearEvent(int yearEvent) {
		this.yearEvent = yearEvent;
	}

	public String toString() {
		return "The colour of the vegetation is: "+ getColour() + '\n' +
				"The color value is: " + this.colorValue + '\n' + 
				"The position of the location has latitude " + this.latitude + " and longitude " +this.longitude + '\n' + 
				"The year of the event is: " + this.yearEvent;
	}
	
	public static void main(String[] args) throws Exception {
		
		Galamsey g = new Galamsey();
		
		g.input();
		
		System.out.println("we are done");
		
		System.out.println(g.toString());
		
		
	}

}
