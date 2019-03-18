package icp.project;
import java.util.Scanner;

public class MonitoringIO {
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter 'observatory' data or 'galamsey' data: ");
		
		System.out.println("Enter 'exit' to close the program: ");
		
		Scanner glm = new Scanner(System.in);
		
		String input = glm.nextLine();
		
		if(input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
			
			System.out.println("The program has terminated!!");
			
			System.exit(0);
			
		}
		else {
			
		}
		
	}

}
