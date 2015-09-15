package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;


public class MarshmallowController
{
	private MarshmallowMonster sydoMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
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
		
	public void start()
		{
			myDisplay.displayInfo(sydoMonster.toString());
			askQuestions();
			myDisplay.displayInfo("Updated monster info: " + sydoMonster.toString());
		}
	
		private void askQuestions()
		{
			System.out.println("I want a new name for a monster, type one please! (p_p)");
			String newMonsterName = monsterScanner.next();
			sydoMonster.setMonsterName(newMonsterName);
		}
}
