import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] arg) {

		 Scanner scannerToReadAirlines = null;
		 
		 
		 Scanner scannerToReadAirliness = null;
		 
		 
		 
	        try{
	            scannerToReadAirlines = new Scanner(new File("airlines.txt"));
	        }
	        catch(IOException e){
	            System.out.println("Could not connect to file airlines.txt.");
	            System.exit(0);
	        }
	        if(scannerToReadAirlines != null){
	      //      ArrayList<Airline> airlinesPartnersNetwork = new ArrayList<Airline>();
	         //   Airline newAirline;
	            String lineFromFile;
	            String[] airlineNames;
	            
	            while( scannerToReadAirlines.hasNext() ){
	                lineFromFile = scannerToReadAirlines.nextLine();
	                airlineNames = lineFromFile.split(",");
	            //    newAirline = new Airline(airlineNames);
	              //  airlinesPartnersNetwork.add( newAirline );
	            }
	       //     System.out.println(airlinesPartnersNetwork);
	            Scanner keyboard = new Scanner(System.in);
	            System.out.print("Enter airline miles are on: ");
	            String start = keyboard.nextLine();
	            System.out.print("Enter goal airline: ");
	            String goal = keyboard.nextLine();
	            ArrayList<String> pathForMiles = new ArrayList<String>();
	            ArrayList<String> airlinesVisited = new ArrayList<String>();
	           
	  
	        }
	    }
	    
	
}
