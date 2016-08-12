import java.util.Scanner;

public class Lab2Adventure {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		//String choice = "yes";
		System.out.println("Welcome to the MINI Cooper driving game! ");
		System.out.println("What is your name? ");
		
		String name = scan.nextLine();
		System.out.print(name + ", would you like to play a game?(yes or no)");
		String choice = "yes";
		//using while loop, user wants to play
		while (choice.equalsIgnoreCase("yes")) {
			
		String playChoice = scan.nextLine();
		
			//if the user doesn't want to play the 1st time
		if (playChoice.equalsIgnoreCase("no")) {
			System.out.println("you're no fun!");
			scan.close();
			return; 
		}
		
		//using nested loops to drive the MINI
        if (playChoice.equalsIgnoreCase("yes")) {
        	System.out.println("Awesome! You have to choose a MINI Cooper for a drive!");
        	System.out.println("What color would you choose Blue or Red?: ");
        	String colorChoice = scan.nextLine();
        	
        	//choosing the color
        	if (colorChoice.equalsIgnoreCase("Blue")) {
        		System.out.println("Go Blue!");
        	} else if (colorChoice.equalsIgnoreCase("Red"))
        		System.out.println("Go Red!");
        	
        	System.out.println("Do you want turbo charged? (yes/no)");
        	
        	//choosing if it has a turbo
        	String turboChoice = scan.nextLine();
        	if (turboChoice.equalsIgnoreCase("yes")) {
        		System.out.println("Need for speed!");
        	} else if (turboChoice.equalsIgnoreCase("no"))
        		System.out.println("Slow poke!");
        	
        	//choosing who to bring
        	System.out.println("Who would you like bring? (friend, dog, friend and dog or none): ");
        	String friendChoice = scan.nextLine();
        	
        	System.out.println("You start your engine and start the drive!");
        	System.out.println();
        	System.out.println("Which way do you go? (left, right or straight)");
        
        	String directionChoice = scan.nextLine();
        	
        	//choosing direction
        	if (directionChoice.equalsIgnoreCase("left")) {
        		System.out.println("You turned left");
        	} else if (directionChoice.equalsIgnoreCase("right")) {
        		System.out.println("You turned right");
        	} else  {
        		System.out.println("You went straight");
        	}
        	
        	//choosing the route
        	System.out.println("What route do you want to go through?");
        	System.out.println("up a mountain, through a stream, unmarked trail,  or short cut");
        	
        	String routeChoice = scan.nextLine();
        	
        	//using nested loops to put the route and who you picked together
        	if (routeChoice.equalsIgnoreCase("up a mountain")) {
        		
        		if (friendChoice.equalsIgnoreCase("friend and dog")) {
        			System.out.println("Congrats! You picked the best route with your friend and dog!");
        		} else if (friendChoice.equalsIgnoreCase("friend")){
        			System.out.println("You picked the best route! But you are missing your dog!");
        		} else if (friendChoice.equalsIgnoreCase("dog")) {
        			System.out.println("You picked the best route! But you are missing your friend!");
        		} else if (friendChoice.equalsIgnoreCase("none")) {
        			System.out.println("You picked the best route! But you are missing your friend and dog! ");
        		}
        		
        	} else if (routeChoice.equalsIgnoreCase("through a stream")) {
        		System.out.println("Bummer! Your car has flooded!!!");	
        		
        	} else if (routeChoice.equalsIgnoreCase("unmarked trail")) {
        		
        		//using conditional statement and loop to match route and friend or dog
        		if (friendChoice.equalsIgnoreCase("friend") || friendChoice.equalsIgnoreCase("none"))
        			System.out.println("Fortunately your friend has a map, and you find your way!");
        		else 
        			System.out.println("OH crap! You are lost!!");
        	} else {
        		
        		System.out.println("MINI's never take the short cut!!");
        	}
        	
        	//does the user want to play again?
        	System.out.println("Do you want to play again? (yes or no)");
        	
        	//exits if they don't want to play more than once
        	if (choice.equalsIgnoreCase("no")) {
        		System.out.println("Thank you for driving");
        	} else if (choice.equalsIgnoreCase("yes")) {
        		
        	}
        }
           	
    	}
		
		scan.close();
	}
	    
}
	

