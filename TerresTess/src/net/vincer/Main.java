package net.vincer;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Boolean gameRunning = false;
		Boolean levelOne = true;

		// TODO Auto-generated method stub
		
		Scanner scRead = new Scanner(System.in);
		String input;
		System.out.println("Start Game?");
		if(levelOne == true){
		do{
			input = scRead.nextLine();
			
			switch(input){
			case"Yes":System.out.println("Yes"); gameRunning = true;input = ""; break; 
			case"yes":System.out.println("Yes"); gameRunning = true;input = ""; break;
			case"No":System.out.println("No"); levelOne = false; break;
			case"no":System.out.println("No"); levelOne = false; break;
			default: break;
			}
			if(gameRunning == true){
				
				do{
					int numx = 20; //min
					int numy = 100; //max
					int z = ((numy-numx)/2);
					int xx;
					
					System.out.println("Is your number Greater or Smaller than "+ z);
					input = scRead.nextLine();
					/*
					switch(input){
					case"greater":
					case"Greater": System.out.println("Greater then. Okay."); x = z; return; 
					case"Smaller": 
					case"smaller": System.out.println("Smaller then. Okay."); y = z; return;
					case"Hit":
					case"hit": System.out.println("Your number was: "+ z); gameRunning = false; break; 
					*/
					System.out.println(input);
					if(input == "Greater"|| input == "greater"){
						xx = (numy-numx)/2;
						numx = xx;
						System.out.println("Greater then. Okay.");
						System.out.println(numx);
						System.out.println(z);
						System.out.println(input);
						continue;
					} else if(input == "Smaller"|| input == "smaller"){	
						xx = (numy-numx)/2;
						numy = xx;
						System.out.println("Smaller then. Okay.");
						System.out.println(numy);
						System.out.println(z);
						System.out.println(input);
						continue;}
						/*
						if (input.equals("Yes") || input.equals("yes")) {
                    				System.out.println("Yes");
                				 gameRunning = true;
                				   input = "";
                				} else if (input.equals("No") || input.equals("no")) {
                				  System.out.println("No");
                				  levelOne = false;
        					 } else {
                				}
						*/
					
				}while(gameRunning);
				}
		
			
			
		}while(levelOne);

		scRead.close();
	}

}
}
