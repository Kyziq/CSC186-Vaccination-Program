package vacProg;

public class checkSymptom extends userInfo
{
	// n = name, i = IC, vs = vaccine status, ss = symptom status
	public checkSymptom (String n, String i, String vs, boolean ss) // Normal
	{
		super(n, i, vs);
		userSympStatus = ss;
	}
	public void setYes (String n, String i, String vs, boolean ss) // Mutator (setter)
	{
		userSympStatus  = ss;
	}
	// Accessor(getter)
	public boolean getSympStatus () { return userSympStatus ; }
	
	public void resultSymp() 
	{
		if (userSympStatus  == true)
		{
			frameFinal.setSize(400, 200);
			finalText.setText(convertToMultiline("Dear " +userName+ " (" +userIC+ "), you have a symptom. \nPlease consult a doctor very soon. Thank you."));
			panelFinal.add(finalText);
			frameFinal.add(panelFinal);
		}
		else if (userSympStatus == false)
		{
			finalText.setText(convertToMultiline("Dear " +userName+ " (" +userIC+ "), congratulations, \nYou have been vaccinated. Thank you."));
			frameFinal.setSize(400, 200);
			panelFinal.add(finalText);
			frameFinal.add(panelFinal);
		}
	}
}