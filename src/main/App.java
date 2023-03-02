package main;
import java.util.Scanner;

public class App {

	public static void start() {
		// Objects
		Scanner scan = new Scanner(System.in);
		
		// Text colors
		final String RESET = "\u001B[0m";
		final String YELLOW = "\u001B[33m";
		final String GREEN = "\u001B[32m";
		final String RED = "\u001B[31m";
		
		// GUI
		System.out.println("_____________________________________");
	    System.out.println(RED + "\nFive nights at Freddy's Java Edition" + RESET);
	    System.out.println("\nversion 1.0 ");
	    System.out.println("made by Uosio");
	    System.out.println("01.03.2023");
	    System.out.println(YELLOW + "\nRecommendation: if you don't know commands, type help." + RESET);
	    System.out.println("_____________________________________");
	    
	    boolean running = true;
	    
	    // Loop
	    do {
	    	System.out.print("Enter command: ");
	    	
	    	// Command handler
	    	try {
	    		String command = scan.next();
	    
	    		switch(command) {
	    		case "play":
	    			System.out.println("Play");
	    			break;
	    		case "help":
	    			System.out.println(GREEN + "_____________________________________" + RESET);
	    			System.out.println(GREEN + "|               HELP                |" + RESET);
	    			System.out.println(GREEN + "|                                   |" + RESET);
	    			System.out.println(GREEN + "|-------------commands--------------|" + RESET);
	    			System.out.println(GREEN + "| help - open help menu             |" + RESET);
	    			System.out.println(GREEN + "| play - start game                 |" + RESET);
	    			System.out.println(GREEN + "|-----------------------------------|" + RESET);
	    			System.out.println(GREEN + "|___________________________________|" + RESET);
	    			break;
	    		default:
	    			System.out.println(RED + "Error: Invalid command." + RESET);
	    		}
	    	}
	    	
	    	// Initialized error
	    	catch (Exception e) {
	    		System.out.println(RED + "Error: Initialized." + RESET);
	    	}
	    
	    } while (running == true);
	    
	}
}

