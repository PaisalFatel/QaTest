package Nationwide.QaTest;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		int d = 20;
		Scanner compass = new Scanner(System.in);
		System.out.println("You are:"+d+"m away");
		System.out.println("Type either North, South or East or West and you will move 1m in the respective direction");
		String direction = compass.nextLine();
		
		while (d>=0 && d<=100); {
			
			if (direction == "North"); {
				d = d - 1;
				System.out.println("You are"+d+"m away from the treasure");
				System.out.println("You're getting closer, type again");
				direction=compass.nextLine();}
			
			if (direction == "South"); {
				d = d + 1;
				System.out.println("You are"+d+"m away from the treasure");
				System.out.println("You're getting further away, type again");
				direction=compass.nextLine();}
			
			if (direction == "East"); {
				d = d + 3;
				System.out.println("You are"+d+"m away from the treasure");
				System.out.println("You're getting further away, type again");
				direction=compass.nextLine();}
			
			if (direction == "West"); {
				d = d + 3;
				System.out.println("You are"+d+"m away from the treasure");
				System.out.println("You're getting further away, type again");
				direction=compass.nextLine();}
				
			
		}
	
		compass.close();
	
	
}
}
