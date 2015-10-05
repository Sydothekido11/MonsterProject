package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;


public class MarshmallowController
{
	private MonsterDisplay myMonster; //Declares a Monster called sydoMonster.
	private MarshmallowMonster userMonster;
	private Scanner monsterScanner;
	
	public MarshmallowController()
	{
		myMonster = new MonsterDisplay();
	}
	
	public void start()
	{
		String name = myMonster.getAnswers("Type in the monsters name");
		
		myMonster.displayResponse("You typed in" + name);
		
		int eyes;
		String tempEyes = myMonster.getAnswers("Type in how many eyes it has");
		
		while(!isInteger(tempEyes))
		{
			tempEyes = myMonster.getAnswers("Type in an integer value!");
		}
		
		if(isInteger(tempEyes))
		{
			eyes = Integer.parseInt(tempEyes);
		}
		else
		{
			eyes = 3;
		}
		
		myMonster.displayResponse("You typed in" + eyes);
		
		int noses;
		String tempNoses = myMonster.getAnswers("Type in how many noses it has");
		
		while(!isInteger(tempNoses))
		{
			tempNoses = myMonster.getAnswers("Type in an integer value!");
		}
		
		if(isInteger(tempNoses))
		{
			noses = Integer.parseInt(tempNoses);
		}
		else
		{
			noses = 4;
		}
		
		myMonster.displayResponse("You typed in" + noses);
		
		double legs;
		String tempLegs = myMonster.getAnswers("Type in how many legs it has");
		
		while(!isDouble(tempLegs))
		{
			tempLegs = myMonster.getAnswers("Give a valid double value!");
		}
		
		if(isDouble(tempLegs))
		{
			legs = Double.parseDouble(tempLegs);
		}
		else
		{
			legs = 6.5;
		}
		
		myMonster.displayResponse("You typed in" + legs);
		
		boolean bellybutton;
		String tempBellybutton = myMonster.getAnswers("Type in if it has a belly button or not. (True or false)");
		
		while(!isBoolean(tempBellybutton))
		{
			tempBellybutton = myMonster.getAnswers("Give a true or false!");
		}
		
		if(isBoolean(tempBellybutton))
		{
			bellybutton = Boolean.parseBoolean(tempBellybutton);
		}
		else
		{
			bellybutton = false;
		}
		
		myMonster.displayResponse("You typed in" + bellybutton);
		
		//userMonster = new MarshmallowMonster (name, )
		
		
		
		
	}
	
	public MarshmallowController()
	{
		String name = "Renald O'Squam";
		int eyes = 2;
		int noses = 0;
		double legs = 2.0;
		double hair = 0.5;
		boolean hasBellyButton = false;
		
		monsterScanner = new Scanner(System.in);
		
		myDisplay = new MonsterDisplay();
		sydoMonster = new MarshmallowMonster(name, eyes, hasBellyButton, noses, legs, hair );
	}
		
	//public void start()
		{
			myDisplay.displayInfo(sydoMonster.toString());
			//createUserMonster();
			myDisplay.displayInfo("Updated monster info: " + userMonster.toString());
		}
	
		//private void askQuestions()


		{
			System.out.println("I want a new name for a monster, type one please! (p_p)");
			String newMonsterName = monsterScanner.next();
			sydoMonster.setMonsterName(newMonsterName);
			
			System.out.println("How many eyes should I have?");
			int updatedEyes = monsterScanner.nextInt();
			sydoMonster.setMonsterEyes(updatedEyes);
			System.out.println("How many noses should I have?");
			int updatedNoses = monsterScanner.nextInt();
			sydoMonster.setMonsterNoses(updatedNoses);
			System.out.println("How many legs?");
			double updatedLegs = monsterScanner.nextDouble();
			System.out.println("How much hair?");
			double updatedHair = monsterScanner.nextDouble();
			System.out.println("Should I have a belly button? True or False.");
			boolean updatedBellyButton = monsterScanner.nextBoolean();
			
			
		}

		/**
		 * Creates a MarshmallowMonster instance from user input.
		 */
	//	private void createUserMonster()
		{
			//Step One: Gather user information.
			System.out.println("What is your monsters name? boop.");
			String userName;
			userName = monsterScanner.nextLine();
			System.out.println("How many legs will it have? This is a decimal value. meep.");
			double userLegs = monsterScanner.nextDouble();
			System.out.print("How much hair does it have? Another decimal please. beep.");
			double userHair;
			userHair = monsterScanner.nextDouble();
			System.out.println("Does it have a belly button? True or False. blep.");
			boolean hasBellyButton = monsterScanner.nextBoolean();
			System.out.println("Number of eyes on the monster. pepe");
			int userEyes = monsterScanner.nextInt();
			System.out.println("How many noses? sqwoop.");
			int userNoses = monsterScanner.nextInt();
			
			//Step two: Build the monster using the constructor.
			userMonster = new MarshmallowMonster(userName, userEyes, hasBellyButton, userNoses, userLegs, userHair);
			
			
			
		}
}
