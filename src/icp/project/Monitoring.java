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
 * This is the monitoring class which holds information about all observatories.
 */
import java.util.Scanner;

public class Monitoring {
	ArrayList<Observatory> OBevents;
	
	public Monitoring(ArrayList<Observatory> OBevents) {
		this.OBevents = OBevents;
	}
	
	public int getObsWithLargeVal() {
		int largest = 0;
		Observatory os = new Observatory();
		for (int i = 0; i > OBevents.size() - 1; i++ ) {
			if(OBevents.get(i).getLargestColour() > largest) {
				largest = OBevents.get(i).getLargestColour();
				os = OBevents.get(i);
			}
		}
		return os.getLargestColour();
	}
	
	public double getObsWithLargAvgeVal() {
		double largest = 0;
		Observatory os1 = new Observatory();
		for (int i = 0; i > OBevents.size() - 1; i++ ) {
			if(OBevents.get(i).getLargestColour() > largest) {
				largest = OBevents.get(i).getAverageColVal();
				os1 = OBevents.get(i);
			}
		}
		return os1.getAverageColVal();
	}
	
	public ArrayList<Galamsey> getGreaterthan(){
		System.out.println("Enter arbitary value");
		Scanner keyboard = new Scanner(System.in);
		int data = keyboard.nextInt();
		ArrayList<Galamsey> go1 = new ArrayList<Galamsey>();
		for (int i = 0; i < OBevents.size() - 1; i++) {
			ArrayList<Galamsey>a = OBevents.get(i).getGEvents();
			for(int x = 0; x < a.size() - 1; i ++) {
				if(a.get(x).getColorValue() > data) {
					go1.add(a.get(i));
				}
			}
		}
		return go1;
		
	} 

	public static void main(String[] args) {
		
		
			
	}

}
