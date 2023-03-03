package main;

public class Console extends Out{

	public static void run() {
		// Objects
		Out out = new Out();
		
		// UI
		out.os();
		out.start();
	    
	    // Loop
	    do {
	    	System.out.print("Enter command: ");
	    	
	    	// Command handler
	    	try {
	    		String command = scan.next();
	    
	    		switch(command) {	
	    		case "help":
	    			out.help();
	    			break;
	    		case "close":
	    			running = false;
	    			break;
	    		case "setlevel":
	    			out.setlevel();
	    			break;
	    		case "getlevel":
	    			out.getlevel();
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
