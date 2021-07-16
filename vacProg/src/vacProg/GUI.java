package vacProg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI extends userInfo implements ActionListener 
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {         
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI()
    {
		frame1.setSize(400, 250);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1.setLayout(null);
		panelVacYes.setLayout(null);
		panelVacNo.setLayout(null);
		panelFinal.setLayout(null);
		
		//JLabel
		nameLabel = new JLabel("Enter your name");
		nameLabel.setBounds(10, 20, 100, 25);
		panel1.add(nameLabel);

		icLabel = new JLabel("Enter your IC number");
		icLabel.setBounds(10, 60, 140, 25);
		panel1.add(icLabel);
		
		vacLabel = new JLabel("Have you been vaccinated before (at least first dose)? (Yes / No) ");
		vacLabel.setBounds(10, 100, 500, 25);
		panel1.add(vacLabel);

		sympLabel = new JLabel(" ");
		sympLabel.setBounds(10, 0, 500, 80);
		sympLabel.setText(convertToMultiline("Are you exhibiting any of the symptoms? \n(Cough difficulty / Loss of smell / Loss of taste) \nAnswer yes or no."));
		panelVacYes.add(sympLabel);
		
		//
		finalText = new JLabel(" ");
		finalText.setBounds(10, 10, 500, 50);
		finalText2= new JLabel(" ");
		finalText2.setBounds(10, 50, 500, 50);
		finalText3= new JLabel(" ");
		finalText3.setBounds(10, 150, 500, 50);
		finalText4= new JLabel(" ");
		finalText4.setBounds(10, 190, 500, 50);

		regLabel = new JLabel("Have you registered on MySejahtera application? (Yes / No)");
		regLabel.setBounds(10, 10, 500, 25);
		panelVacNo.add(regLabel);
		
		// JTextField
		nameText = new JTextField(20);
		nameText.setBounds(200, 20, 165, 25);
		panel1.add(nameText);
		
		icText = new JTextField(20);
		icText.setBounds(200, 60, 165, 25);
		panel1.add(icText);
		
		vacText = new JTextField(20);
		vacText.setBounds(10, 130, 165, 25);
		panel1.add(vacText);
		
		sympText = new JTextField(20);
		sympText.setBounds(10, 70, 165, 25);
		panelVacYes.add(sympText);
		
		regText = new JTextField(20);
		regText.setBounds(10, 50, 165, 25);
		panelVacNo.add(regText);
		
		reasonText = new JTextField(30);
		reasonText.setBounds(230, 20, 250, 25);

		phoneText = new JTextField(20);
		phoneText.setBounds(230, 60, 165, 25);

		// JButton
		submit1 = new JButton("Submit");
		submit1.setBounds(10, 170, 80, 25);
		submit1.addActionListener(new GUI());
		panel1.add(submit1);
		
		submitVacYes = new JButton("Submit");
		submitVacYes.setBounds(10, 110, 80, 25);
		submitVacYes.addActionListener(new GUI());
		panelVacYes.add(submitVacYes);
		
		submitVacNo = new JButton("Submit");
		submitVacNo.setBounds(10, 100, 80, 25);
		submitVacNo.addActionListener(new GUI());
		panelVacNo.add(submitVacNo);
		
		submitFinal = new JButton("Submit");
		submitFinal.setBounds(10, 100, 80, 25);
		submitFinal.addActionListener(new GUI());
		
		frame1.add(panel1);
		frame1.setVisible(true);
	}
    
	@Override
	public void actionPerformed(ActionEvent e)
	{
		userName = nameText.getText();
		userIC = icText.getText();
		userVac = vacText.getText();
		
		// Vaccine
		if (userVac.equalsIgnoreCase("Yes"))
	   	{
			HideAndShowFrame(frame1, frameVacYes);
			frameVacYes.setSize(400, 200);
			frameVacYes.add(panelVacYes);
			userSymp = sympText.getText();
			setUserVacStatus("Vaccinated");
			
			if (userSymp.equalsIgnoreCase("Yes"))
			{
				userSympStatus = true;
				checkSymptom cs = new checkSymptom(userName, userIC, userVacStatus, userSympStatus);
				HideAndShowFrame(frameVacYes, frameFinal); 
				cs.resultSymp();
			}
			else if (userSymp.equalsIgnoreCase("No"))
			{
				userSympStatus = false;
				checkSymptom cs = new checkSymptom(userName, userIC, userVacStatus, userSympStatus);
				HideAndShowFrame(frameVacYes, frameFinal);
				cs.resultSymp();
			}
	   	}
		else if (userVac.equalsIgnoreCase("No"))
	   	{
			HideAndShowFrame(frame1, frameVacNo);
			frameVacNo.setSize(400, 200);
			frameVacNo.add(panelVacNo);
			userReg = regText.getText();
			setUserVacStatus("Unvaccinated");
			
			if (userReg.equalsIgnoreCase("Yes"))
			{
				userRegStatus = true;
				checkRegister cr = new checkRegister(userName, userIC, userVacStatus, userRegStatus, userPhone);
				HideAndShowFrame(frameVacNo, frameFinal);
				cr.resultReg();
			}
			else if (userReg.equalsIgnoreCase("No"))
			{
				userRegStatus = false;
				checkRegister cr = new checkRegister(userName, userIC, userVacStatus, userRegStatus, userPhone);
				HideAndShowFrame(frameVacNo, frameFinal);
				cr.resultReg();
			}
	   	}
	}	
}