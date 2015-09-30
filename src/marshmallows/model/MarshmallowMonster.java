package marshmallows.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
		public MarshmallowMonster()
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
		
		public String getMonsterName()
		{
			return monsterName;
		}

		public int getMonsterEyes()
		{
			return monsterEyes;
		}
		
		public int getMonsterNoses()
		{
			return monsterNoses;
		}
		
		public double getMonsterLegs()
		{
			return monsterLegs;
		}
		
		public double getMonsterHair()
		{
			return monsterHair;
		}
		
		public boolean getMonsterBellyButton()
		{
			return monsterBellyButton;
		}
		
		public void setMonsterName(String monsterName)
		{
			this.monsterName = monsterName;
		}
		
		public void setMonsterEyes(int monsterEyes)
		{
			this.monsterEyes = monsterEyes;
		}
		
		public void setMonsterNoses(int monsterNoses)
		{
			this.monsterNoses = monsterNoses;
		}
		
		public void setMonsterLegs(int monsterLegs)
		{
			this.monsterLegs = monsterLegs;
		}
		
		public void setMonsterHair(int monsterHair)
		{
			this.monsterHair = monsterHair;
		}
		
		public void setMonsterBellyButton(boolean monsterBellyButton)
		{
			this.monsterBellyButton = monsterBellyButton;
		}
		
		
		
		public String toString()
		{
			String monsterInfo = monsterName + " has " + monsterEyes + " and " + monsterNoses + " noses and " + monsterLegs + " legs and " + monsterHair " hair " + monsterBellyButton + "belly button.";
			
			return monsterInfo;
		}
}

