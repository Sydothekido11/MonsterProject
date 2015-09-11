package marshmallows.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
		private MarshmallowMonster()
		{
			
		}
		
		public MarshmallowMonster(String monsterName, int monsterEyes, boolean monsterBellyButton, int monsterNoses, double monsterLegs, double monsterHair)
		{
			this.monsterName = monsterName;
			this.monsterEyes = monsterEyes;
			this.monsterNoses = monsterNoses;
			this.monsterLegs = monsterLegs;
			this.monsterHair = monsterHair;
			this.monsterBellyButton = monsterBellyButton;
			
		}
		
		public String toString()
		{
			String monsterInfo = "My monster has " + monsterLegs + " legs and its name is " + monsterName
									+ " with " + monsterEyes + " eyes and " + monsterNoses + " noses and amazing " + monsterHair + " hair and lastly " + monsterBellyButton + " belly buttons.";
			
			return monsterInfo;
		}
}

