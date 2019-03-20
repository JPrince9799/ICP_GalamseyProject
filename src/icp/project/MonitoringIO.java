package icp.project;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MonitoringIO implements Serializable{
	
	PrintWriter galamseyData = null;
	
	PrintWriter observatoryData = null;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MonitoringIO() {}
	
	public void createOutputFile() {
 		
 		try {
 			
 			//Note that we are able to append to the file because of the "true" parameter
 			galamseyData = new PrintWriter(new FileOutputStream("Galamasey_Data.txt", true));
 			
 			observatoryData = new PrintWriter(new FileOutputStream("Observatory_Data.txt", true));
 		}
 		
 		catch(FileNotFoundException fnfe) {
 			
 			fnfe.getMessage();
 			
 		}
		    
 		
 			
		   
		    //Close Writer
		    //galamseyData.close();
		    
		    //observatoryData.close();
	}
	

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Welcome to GalamseyMonitor\n");
		
		System.out.println("To enter Galamasey Data type: 'egd'.");
		
		System.out.println("To enter observatory data type: 'eod'.");
		
		System.out.println("To view statististics type: 'view'.");
		
		System.out.println("To exit the program type: 'exit'.");
		
		System.out.println("To enter another input type 'again' after each entry.");
		
		System.out.println("Enter Action: ");
		
		String input = scan.nextLine().toLowerCase();
		
		try {
			
			while(true){
			
				if(input.equals("egd")) {
					
					Scanner scan1 = new Scanner(System.in);
					
					String [] a = {"Colour Value <one, two or three>", "Latitude", "Longitude", "Year of Event"};
					
					ArrayList <String> Gdata = new ArrayList<String>();
					
					for (int i = 0; i < 4; i ++) {
					
						System.out.println("Enter " + a[i]);
						
						String finish = scan1.nextLine().toLowerCase();
						
						Gdata.add(finish);
						
					}
					try {
						Galamsey event = new Galamsey(Gdata.get(0), Double.parseDouble(Gdata.get(1)), Double.parseDouble(Gdata.get(2)), Integer.parseInt(Gdata.get(3)));
						
						//saveGEvent(event);
						
						System.out.println(event.toString());
					}
					
					catch(Exception e) {e.getMessage();}
					
					input = scan1.nextLine().toLowerCase();
				}
				
				else if(input.equals("eod")) {
					
					Scanner scan2 = new Scanner(System.in);
					
					String [] a = {"Name of Observatory", "Name of country", "Year of Observatory", "Area Covered"};
					
					ArrayList <String> OBdata = new ArrayList<String>();
					
					for (int i = 0; i < 4; i ++) {
					
						System.out.println("Enter " + a[i]);
						
						String finish = scan2.nextLine().toLowerCase();
						
						OBdata.add(finish);
						
					}
					
					try {
					
						Observatory event = new Observatory(OBdata.get(0), OBdata.get(1), Integer.parseInt(OBdata.get(2)), Double.parseDouble(OBdata.get(3)));
						
						//OBtrack(event);
						
						System.out.println(event.toString());
					}
					
					catch(Exception e) {e.getMessage();}
					
					input = scan2.nextLine().toLowerCase();
					
					
				}
				
				else if(input.equals("view")) {
					
					Scanner scan3 = new Scanner(System.in);
					
					System.out.println("Enter 1 to view observatory with the largest average galamsey colour value");
					
					System.out.println("Enter 2 to view largest galamsey colour value ever recorded");
					
					System.out.println("Enter 3 to get a list of all galamsey recorded with colour value greater than a provided arbitrary number");
					
					String inp = scan3.nextLine();
					
					try {
						
						Monitoring ob = new Monitoring();
						
						if(inp.equals("1")) {
							
							ob.getObsWithLargeCVal();
							
						}
						if(inp.equals("2")) {
							
							ob.getObsWithLargAvgeVal();
							
						}
						if(inp.equals("3")) {
							
							System.out.println("Enter Abitrary value <1, 2 or 3>");
							
							Scanner uni = new Scanner(System.in);
							
							int entry = Integer.parseInt(uni.nextLine());
							
							ob.getGreaterthan(entry);
							
						}
						
					}
					
					catch(Exception e) {e.getMessage();}
					
					input = scan3.nextLine().toLowerCase();
					
				}
				
				else if(input.equals("again")) {
					
					Scanner scans =  new Scanner(System.in);
					
					System.out.println("Welcome to GalamseyMonitor\n");
					
					System.out.println("To enter Galamasey Data type: 'egd'.");
					
					System.out.println("To enter observatory data type: 'eod'.");
					
					System.out.println("To view statististics type: 'view'.");
					
					System.out.println("To exit the program type: 'exit'.");
					
					System.out.println("To enter another input type 'again'.");
					
					System.out.println("Enter Action: ");
					
					input = scans.nextLine().toLowerCase();
					
				}
				
				if(input.equals("exit")) {
					
					System.out.println("The program has terminated!");
					
					System.exit(0);
					
				}
			}
		}
		
		catch(Exception e) {
				
				System.out.println("Input mismatch");
				
				e.getMessage();
			
		}
		
	}

}
