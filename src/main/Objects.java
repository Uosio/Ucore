package main;

import java.util.Scanner;

public class Objects {
	public static Scanner scan = new Scanner(System.in);
	
	// Text colors
	public final static String RESET = "\u001B[0m";
	public final static String YELLOW = "\u001B[33m";
	public final static String GREEN = "\u001B[32m";
	public final static String RED = "\u001B[31m";
	
	public byte os = 0;
	public static boolean running = true;
	public static String level = "";
}



class Out extends Objects{
	protected void os() {
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
			System.out.println(GREEN + "| setlevel - start game level       |" + RESET);
			System.out.println(GREEN + "| getlevel - get game level         |" + RESET);
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
		System.out.println("| setlevel - start game level       |");
		System.out.println("| getlevel - get game level         |");
		System.out.println("|-----------------------------------|");
		System.out.println("|___________________________________|");
		}
	}
	
	protected void setlevel() {
		System.out.print("\tEnter level name: ");
		level = scan.next();
		switch (level) {
		case "menu":
			System.out.println("Menu");
			break;
		default:
			System.out.println("Error: Invalid command.");
		}
	}
	
	public void getlevel() {
		System.out.println(level);
	}
}