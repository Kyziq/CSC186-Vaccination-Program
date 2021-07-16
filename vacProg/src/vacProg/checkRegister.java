package vacProg;

public class checkRegister extends userInfo 
{
	// n = name, i = IC, vs = vaccine status, ss = symptom status
	public checkRegister (String n, String i, String vs, boolean r,  String pn) // Normal
	{
		super(n, i, vs);
		userRegStatus = r;
	}
	public void setReason (String n, String i, String vs, boolean r, String pn) // Mutator(setter)
	{
		userRegStatus = r;
	}
	public void resultReg() 
	{
		if (userRegStatus == true)
		{
			frameFinal.setSize(400, 200);
			finalText.setText(convertToMultiline("Dear " +userName+ " (" +userIC+ "), \nkindly wait your turn to be vaccinated. Thank you."));
			panelFinal.add(finalText);
			frameFinal.add(panelFinal);
		}
		else if (userRegStatus == false)
		{
			frameFinal.setSize(600, 300);
			finalText.setText(convertToMultiline("State your reason for not \nregistering on MySejahtera"));
			panelFinal.add(finalText);
			panelFinal.add(reasonText);
			
			finalText2.setText(convertToMultiline("State your phone number"));
			panelFinal.add(finalText2);
			panelFinal.add(phoneText);
			
			panelFinal.add(submitFinal);
			frameFinal.add(panelFinal);
	
			userReason = reasonText.getText();
			userPhone = phoneText.getText();
			if(userReason != null && userPhone != null && !userReason.isEmpty() && !userPhone.isEmpty())
			{
				panelFinal.add(finalText3);
				finalText3.setText(convertToMultiline("Dear " +userName+ " (" +userIC+ "), your reason for not registering yet in MySejahtera is:\n " +userReason+ "."));
				panelFinal.add(finalText4);
				finalText4.setText(convertToMultiline("Your reason has been recorded. Your phone number is " +userPhone+ ".\nKPM will contact you soon. Thank you."));
			}
		}
	}
}
