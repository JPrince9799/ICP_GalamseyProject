 package icp.project;
import java.util.ArrayList;

/**
 * @author Georgette Asiedu
 * @author Naa Akle Noi
 * @author Ransford Nyarko
 * @author Joseph Prince-Agbodjan
 * This is the observatory class to store and retrieve the name of the observatory, 
 * the name of the country in which it is located, the year in which “galamsey” observations 
 * started, the area covered by the observatory (in square kilometers) and a list of “galamsey” 
 * events that it has recorded
 */

public class Observatory extends Galamsey{
	
	String nameofObservatory;		//instance variable for name of observatory
	
	String nameofCountry;			//instance variable for name of country
	
	int yearGStarted;			//instance variable for year Galamsey event started
	
	double areaCovered;				//instance variable for area being covered
	
	static ArrayList<Galamsey> GEvents;	//instance variable for list of Galamsey events
	
	
	/**
	 * @version 1.1
	 * Defualt constructor
	 */
	public Observatory() {}
	
	
	
	/**
	 * @version 1.2
	 * @param nos
	 * @param noc
	 * @param ygs
	 * @param ac
	 * This is the overloaded constructor that instantiates an object of the observatory class
	 */
	public Observatory(String nos, String noc, int ygs, double ac) throws IllegalArgumentException {
		
		this.nameofObservatory = nos;			//assigns name of observatory
		
		this.nameofCountry = noc;				//assigns name of countries
		
		if(ygs > 99 && ygs < 9999) {
			this.yearGStarted = ygs;
		}
		else{throw new IllegalArgumentException();}				//assigns year Galamsey events started
		
		this.areaCovered = ac;					//assigns area covered to intialized variable
		
	}
	

	//Getters
	
	/**
	 * @return nameofObservatory
	 */
	public String getNameofObservatory() {
		return nameofObservatory;
	}

	/**
	 * @return nameofCountry
	 */
	public String getNameofCountry() {
		return nameofCountry;
	}

	/**
	 * @return yearGStarted
	 */
	public int getYearGStarted() {
		return yearGStarted;
	}
	
	/**
	 * @return areaCovered
	 */
	public double getAreaCovered() {
		return areaCovered;
	}	
	
	/**
	 * @return GEvents
	 */
	public ArrayList<Galamsey> getGEvents() {
		return GEvents;
	}
	

	//SETTERS
	
	
	/**
	 * @param nameofObservatory
	 */
	public void setNameofObservatory(String nameofObservatory) {
		this.nameofObservatory = nameofObservatory;
	}

	/**
	 * @param nameofCountry
	 */
	public void setNameofCountry(String nameofCountry) {
		this.nameofCountry = nameofCountry;
	}

	/**
	 * @param yearGStarted
	 */
	public void setYearGStarted(int yearGStarted) {
		this.yearGStarted = yearGStarted;
	}

	/**
	 * @param areaCovered
	 */
	public void setAreaCovered(double areaCovered) {
		this.areaCovered = areaCovered;
	}

	/**
	 * @param gEvents
	 */
	public void setGEvents(ArrayList<Galamsey> gEvents) {
		GEvents = gEvents;
	}
	
	
	/**
	 * @param GE
	 */
	public void saveGEvent(Galamsey GE) {
		
		GEvents.add(GE);
		
	}
	
	public static ArrayList<Galamsey> getList(){
		
		return GEvents;
		
	}
	
	
	/**
	 * @return largest
	 */
	public int getLargestGColorValue() {
		
		int largest = 0;			//instance variable to hold temporary color values of Galamsey events
		
		//for - each loop to get the largest color value from the list of Galamsey events
		for(Galamsey large: GEvents) {
			
			//variable to hold the galamsey color value of each event
			int temp = large.getColorValue();
			
			//if-else condition to check the largest variable
			if(temp > largest) {

				//reassignment of the largest variable
				largest = temp;
				
			}
			
		}
		//return the largest value saved when the loop terminates
		return largest;			//return statement
	}
	
	
	
	/**
	 * @return avgColorValue
	 */
	public double getAverageGColVal() {
		
		int sum = 0;						//instance variable for the accumulated sum
		
		double avgColorVal = 0;				//instance variable for the average value
		
		//for-each loop to loop through the galamsey events
		for(Galamsey large: GEvents) {
			
			//variable to hold the galamsey color value of each event
			int temp = large.getColorValue();
			
			//accumulate the color values of all entries
			sum = sum + temp;
			
		}
		
		//compute the average color value entry
		avgColorVal = sum / GEvents.size();
		
		return avgColorVal;
	}
		
	
	/**
	 * @param num
	 * @return TEMP
	 * Method to return a temporal list of Galamsey Events that have a color value
	 * greater than the entered arbitrary value
	 */
	public ArrayList<Galamsey> getGreaterthanX(int num){
		
		//create the temporal arraylist that holds the selected galamsey events
		ArrayList<Galamsey> TEMP = new ArrayList<Galamsey>();
		
		try {
			
			//validate that the entered arbitrary values
			if(1 <= num && num <= 3) {
				
				//for each loop to run through the Galamsey events
				for(Galamsey X: GEvents) {
					
					//temporary variable to hold the color value of the specified event
					int tempcval = X.getColorValue();
					
					//condition to check if the color value is greater than the arbitrary value
					if(tempcval > num) {
						
						//if the condition is satisfied the details of the Galamsey event is added to the temporary array
						TEMP.add(X);
						
					}
				}
			}
		}
		
		//error handler
		catch(Exception e) {
			
			//user error message
			System.out.println("The number you entered does not match the values <1, 2, or 3>");
			
			//error message thrown
			e.getMessage();
			
		}
		
		//return the entire array to the array
		return TEMP;
		
	}
	
	public String toString() {
		return "The name of the observatory is: "+ this.nameofObservatory + '\n' +
				"The country is: " + this.nameofCountry + '\n' + 
				"The year of the observatory is " + this.yearGStarted + '\n' + 
				"The area covered is: " + this.areaCovered + " km sq";
	}

}