package marshmallows.view;

import javax.swing.JOptionPane;
/**
 * This provides windows for input and output.
 * @author snem8901
 * @version 1.0 9/30/15
 */
public class MonsterDisplay
{

	public String getAnswers(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
		
	}
	public void displayInfo(String input)
	{
		JOptionPane.showMessageDialog(null,  input);
	}
}
