package main;
import java.util.*;

public class Console extends Out{

	public static void run() {
		// Objects
		Scanner scan = new Scanner(System.in);
		Out draw = new Out();
		
		// UI
		draw.os();
		draw.start();
	    
	    boolean running = true;
	    
	    // Loop
	    do {
	    	System.out.print("Enter command: ");
	    	
	    	// Command handler
	    	try {
	    		String command = scan.next();
	    
	    		switch(command) {
	    		
	    		case "level":
	    			System.out.println("level");
	    			break;
	    			
	    		case "help":
	    			draw.help();
	    			break;
	    			
	    		case "close":
	    			running = false;
	    			break;
	    			
	    		default:
	    			System.out.println("Error: Invalid command.");
	    		}
	    	}
	    	
	    	// Initialized error
	    	catch (Exception e) {
	    		System.out.println("Error: Initialized.");
	    	}
	    
	    } while (running == true);
	    
	}
	
}

class Out{
	
	// Text colors
	public final static String RESET = "\u001B[0m";
	public final static String YELLOW = "\u001B[33m";
	public final static String GREEN = "\u001B[32m";
	public final static String RED = "\u001B[31m";
	public static byte os = 0;
	
	protected void os() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Windows = 0; Linux = 1");
		System.out.print("Set current OS: ");
		os = scan.nextByte();
	}
	
	protected void start(){
				
		if (os == 1) {
			System.out.println("_____________________________________");
			System.out.println(RED + "\nUCORE" + RESET);
			System.out.println("\nversion 1.0 ");
			System.out.println("made by Uosio");
			System.out.println("01.03.2023");
			System.out.println(YELLOW + "\nRecommendation: if you don't know commands, type help." + RESET);
			System.out.println("_____________________________________");
		}
		else if (os == 0){
		System.out.println("_____________________________________");
		System.out.println("\nUCORE");
		System.out.println("\nversion 1.0 ");
		System.out.println("made by Uosio");
		System.out.println("01.03.2023");
		System.out.println("\nRecommendation: if you don't know commands, type help.");
		System.out.println("_____________________________________");
		}
	}
	
	protected void help() {
		
		if (os == 1) {
			System.out.println(GREEN + "_____________________________________" + RESET);
			System.out.println(GREEN + "|               HELP                |" + RESET);
			System.out.println(GREEN + "|                                   |" + RESET);
			System.out.println(GREEN + "|-------------commands--------------|" + RESET);
			System.out.println(GREEN + "| help - open help menu             |" + RESET);
			System.out.println(GREEN + "| close - close console             |" + RESET);
			System.out.println(GREEN + "| level - start game level          |" + RESET);
			System.out.println(GREEN + "|-----------------------------------|" + RESET);
			System.out.println(GREEN + "|___________________________________|" + RESET);
		}
		else if (os == 0){
		System.out.println("_____________________________________");
		System.out.println("|               HELP                |");
		System.out.println("|                                   |");
		System.out.println("|-------------commands--------------|");
		System.out.println("| help - open help menu             |");
		System.out.println("| close - close console             |");
		System.out.println("| level - start game level          |");
		System.out.println("|-----------------------------------|");
		System.out.println("|___________________________________|");
		}
	}
}