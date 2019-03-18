package icp.project;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Ransford Nyarko
 * @author Naa Akle Noi
 * @author Georgette Asiedu
 * @author Joseph Prince-Agbodjan
 * @version 1.1
 * 
 * This is the observatory class to store and retrieve the name of the observatory, 
 * the name of the country in which it is located, the year in which “galamsey” observations 
 * started, the area covered by the observatory (in square kilometers) and a list of “galamsey” 
 * events that it has recorded
 */

public class Observatory extends Galamsey{
	
	String nameofObservatory;
	String nameofCountry;
	String yearGStarted;
	double areaCovered;
	ArrayList<Galamsey> GEvents;
	ArrayList<Observatory>OBEvents;
	
	public Observatory() {}
	public Observatory(String nos, String noc, String ygs, double ac, ArrayList <Galamsey> gev) {
		this.nameofObservatory = nos;
		this.nameofCountry = noc;
		this.yearGStarted = ygs;
		gev.addAll(GEvents);
	}

	public String getNameofObservatory() {
		return nameofObservatory;
	}



	public void setNameofObservatory(String nameofObservatory) {
		this.nameofObservatory = nameofObservatory;
	}



	public String getNameofCountry() {
		return nameofCountry;
	}



	public void setNameofCountry(String nameofCountry) {
		this.nameofCountry = nameofCountry;
	}



	public String getYearGStarted() {
		return yearGStarted;
	}



	public void setYearGStarted(String yearGStarted) {
		this.yearGStarted = yearGStarted;
	}



	public double getAreaCovered() {
		return areaCovered;
	}



	public void setAreaCovered(double areaCovered) {
		this.areaCovered = areaCovered;
	}



	public ArrayList<Galamsey> getGEvents() {
		return GEvents;
	}



	public void setGEvents(ArrayList<Galamsey> gEvents) {
		GEvents = gEvents;
	}
	
	public int getLargestColour() {
		int largest = 0;
		for(int i = 0; i < GEvents.size() - 1; i ++) {
			if(GEvents.get(i).getColorValue() > largest) {
				largest = i;
			}
		}
		return largest;
	}
	
	public double getAverageColVal() {
		
		int sum = 0;
		
		for(int i = 0; i < GEvents.size() - 1; i ++) {
		
			sum += GEvents.get(i).getColorValue();
		
		}
		
		return sum/GEvents.size();
	}
	
	public ArrayList<Galamsey> getGreaterthan(){
		
		System.out.println("Enter arbitary value");
		
		Scanner keyboard = new Scanner(System.in);
		
		int data = keyboard.nextInt();
		
		ArrayList<Galamsey> go1 = new ArrayList<Galamsey>();
		
		for(int i = 0; i < GEvents.size() - 1; i ++) {
		
			if(GEvents.get(i).getColorValue() > data) {
				
				go1.add(GEvents.get(i));
			
			}
		
		}
		
		return go1;
		
	}
	



	public static void main(String[] args) {
		
	}

}
