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
			case"Yes":System.out.println("Yes"); gameRunning = true; break; 
			case"yes":System.out.println("Yes"); gameRunning = true; break;
			case"No":System.out.println("No"); levelOne = false; break;
			case"no":System.out.println("No"); levelOne = false; break;
			default: break;
			}
		
			
			
		}while(levelOne);
		}else if(gameRunning == true){
		
		do{
			int x = 0; //min
			int y = 100; //max
			int z = ((y-x)/2);
			System.out.println("Is your number Greater or Smaller than "+ z);
			input = scRead.nextLine();
			switch(input){
			case"greater":
			case"Greater": System.out.println("Greater then. Okay."); x = z; return; 
			case"Smaller": 
			case"smaller": System.out.println("Smaller then. Okay."); y = z; return;
			case"Hit":
			case"hit": System.out.println("Your number was: "+ z); gameRunning = false; break;
			
			}
		}while(gameRunning);
		}
		scRead.close();
	}

}
