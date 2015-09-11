package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;

public class MarshmallowController
{
	private MarshmallowMonster sydoMonster;
	private MonsterDisplay myDisplay;
	
	public MarshmallowController()
	{
		String name = "";
		int eyes = 2;
		int noses = 0;
		double legs = 2.0;
		double hair = 0.5;
		boolean hasBellyButton = false;
		
		myDisplay = new MonsterDisplay();
		sydoMonster = new MarshmallowMonster(name, eyes, hasBellyButton, noses, legs, hair );
	}
		public void start()
		{
			myDisplay.displayInfo(sydoMonster.toString());
		}
	
}
