package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;

public class MarshmallowController
{
	private MarshmallowMonster sydoMonster;
	
	public MarshmallowController()
	{
		String name = "";
		int eyes = 2;
		int noses = 0;
		double legs = 1.5;
		double hair = 2.0;
		boolean hasBellyButton = false;
		
		sydoMonster = new MarshmallowMonster(name, eyes, hasBellyButton, noses, legs, hair );
		
	}
	
}
