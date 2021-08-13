package vacProg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainCode 
{
	public static void main (String[] args) throws IOException
	{
		// Questions, Input
		Scanner input = new Scanner(System.in);
		userInfo uI = new userInfo();
		
		System.out.println("Enter your name: ");
		uI.setName(input.nextLine());
   
		System.out.println("Enter your identification card (IC) number: ");
		uI.setIC(input.next());
		
		System.out.println("Have you been vaccinated before (at least first dose)? (Yes/No): ");
		uI.setVacText(input.next());
	   
		// Check if vaccinated
		if (uI.getVacText().equalsIgnoreCase("Yes"))
	   	{
			uI.setVacStatus(true);
			System.out.println("Are you exhibiting any of the symptoms? \n(Cough/Difficulty/Loss of smell/Loss of taste) (Yes/No):");
			uI.setSympText(input.next());
			
			// Check if got symptoms
			if (uI.getSympText().equalsIgnoreCase("Yes"))
				uI.setSympStatus(true);
			else if (uI.getSympText().equalsIgnoreCase("No"))
				uI.setSympStatus(false);
			
			if (uI.getSympStatus() == true)
				System.out.println(uI.toString() + "you have a symptom. Please consult a doctor very soon. Thank you.");
			else if (uI.getSympStatus() == false)
				System.out.println(uI.toString() + "congratulations, You have been vaccinated. Thank you.");
	   	}
		else if (uI.getVacText().equalsIgnoreCase("No"))
		{
			uI.setVacStatus(false);
			
			System.out.println("Have you registered on MySejahtera application? (Yes/No): ");
			uI.setRegisteredText(input.next());
			
			// Check if registered
			if (uI.getRegisteredText().equalsIgnoreCase ("Yes")) 
			{
				uI.setRegisteredStatus(true);
				System.out.println(uI.toString() +  "kindly wait your turn to be vaccinated. Thank you.");
			}
			else if (uI.getRegisteredText().equalsIgnoreCase("No")) 
			{
				uI.setRegisteredStatus(false);
				
				System.out.println("State your reason for not registering on MySejahtera: ");
				uI.setReason(input.nextLine());
				uI.setReason(input.nextLine()); // Got two to read the \n and make this working
				
				System.out.println("State your phone number: ");
				uI.setPhone(input.nextLong());	

				System.out.println(uI.toString() + "your reason for not registering yet in MySejahtera: " + uI.getReason() + "\n" + "Your phone number is +60" + uI.getPhone() + ", KPM will contact you soon. Thank you.");
			 }
		}
		
		// To Txt File (Output)
		BufferedWriter br = new BufferedWriter(new FileWriter("D:\\Users\\Asus\\Desktop\\UserDetails.txt"));
		PrintWriter pr = new PrintWriter(br);
		
		pr.println("Name: \t" +uI.getName());
		pr.println("Identification card: \t" +uI.getIC());
		
		if (uI.getVacStatus() == true)
			uI.setVacText("Vaccinated");
		else if (uI.getVacStatus() == false)
			uI.setVacText("Not vaccinated");
		pr.println("Vaccination Status: \t" +uI.getVacText());
		
		if (uI.getSympStatus() == true)
			uI.setSympText("Have symptoms");
		else if (uI.getSympStatus() == false)
			uI.setSympText("No symptoms");
		pr.println("Symptom Status: \t" +uI.getSympText());
		
		pr.println("Reason for not registering MySejahtera: \t" +uI.getReason());
		pr.println("Phone number: +60\t" +uI.getPhone());
		
		pr.close();
		input.close();
	}
}
