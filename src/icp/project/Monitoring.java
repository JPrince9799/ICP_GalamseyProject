package icp.project;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

/**
 * @author Georgette Asiedu
 * @author Naa Akle Noi
 * @author Ransford Nyarko
 * @author Joseph Prince-Agbodjan
 * 
 * This is the monitoring class which holds information about all observatories.
 */
 

public class Monitoring {
	
	ArrayList<Observatory> OBEvents;			//instance of an arrayList to hold all the observatories
	
	
	
	/**
	 * Default Constructor
	 */
	public Monitoring() {}
	
	
	
	/**
	 * @param OBdata
	 */
	public void OBtrack(Observatory OBdata) {
		
		OBEvents.add(OBdata);
		
	}
	
	/*
	public ArrayList<Galamsey> getGEvents() {
		
		return Observatory.getList();
		
	}
	*/
	public String getObsWithLargeCVal() {
		
		int largest = 0;
		
		Observatory temp = null;
		
		for(Observatory u: OBEvents) {
				
			ArrayList<Galamsey> j = u.getGEvents();
		
			for(Galamsey cv: j) {
				
				int clval = cv.getColorValue();
			
				if(clval > largest) {
						
					largest = clval;
						
					temp = u;	
						
					}
			}
	}
		
		return "The Observatory with the largest color value is: " +  temp.getNameofObservatory();
	
		
	}
	
	@SuppressWarnings("null")
	public String getObsWithLargAvgeVal() {
		int avg = 0;
		
		int cal = 0;
		
		Observatory temp1 = null;
		
		for(Observatory u: OBEvents) {
				
			ArrayList<Galamsey> j = u.getGEvents();
			
			int[] sum = new int[j.size()];
			
			for(int i = 0; i < j.size(); i++) {
				
				int temp = j.get(i).getColorValue();
				
				sum[i] = temp;
				
			}
			
			for(int o = 0; o < sum.length; o++) {
				
				cal = cal + sum[o];
				
			}
			
			avg = cal / j.size();
	}
		
		return "The observatory with the largest colour value recorded is " + temp1.getNameofObservatory();
		
	}
	
	@SuppressWarnings("null")
	public String getGreaterthan(int gt){
		
		ArrayList<Galamsey> holdgt = null;
		
		for(Observatory u: OBEvents) {
			
			ArrayList<Galamsey> j = u.getGEvents();
		
			for(Galamsey cv: j) {
				
				int clval = cv.getColorValue();
				
				if(clval > gt) {
					
					holdgt.add(cv);
					
				}
				
			}
			
		}
		
		return "This is a list of Galamsey event with a colour value greater than " + gt + "\n" + holdgt;
		
	} 

	public static void main(String[] args) {
		
		
			
	}

}
