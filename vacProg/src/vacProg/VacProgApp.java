package vacProg;

import java.io.*;
import java.util.*;

public class VacProgApp
{

	public static void main (String[] args) throws Exception
	{
		Functions f = new Functions();
		
		Scanner input = new Scanner(System.in);
		BufferedWriter br = new BufferedWriter(new FileWriter("D:\\Users\\Asus\\Desktop\\DetailUser.txt"));
		PrintWriter pr = new PrintWriter(br);
       
		String symp, reg, vac, name = null, reason = null, IC = null, phoNum = null, vacStatus = null, sympStatus = null;
	   
		System.out.println("Enter your name: ");
		name = input.nextLine();
   
		System.out.println("Enter your identification card (IC) number: ");
		IC = input.next();
   
		System.out.println("Have you been vaccinated before (at least first dose)? (Yes/No): ");
		vac = input.next();
	   
		f.CheckYesNo(vac);
		if (vac.equalsIgnoreCase("Yes"))
	   	{
			vacStatus = "Vaccinated";
	   
			System.out.println("Are you exhibiting any of the symptoms? \n(Cough/Difficulty/Loss of smell/Loss of taste) (Yes/No):");
			symp = input.next();
	   
			f.CheckYesNo(symp);
		   	if (symp.equalsIgnoreCase("Yes"))
		   	{
		   		sympStatus = "Have symptoms";
		   		System.out.println("Dear " +name+ " (" +IC+ "), you have a symptom. Please consult a doctor very soon. Thank you.");
		   	}
		   	else if (symp.equalsIgnoreCase("No"))
		   	{
			  	sympStatus = "No symptoms";
			  	System.out.println("Dear " +name+ " (" +IC+ "), congratulations, You have been vaccinated. Thank you.");
		   	}
	   	}
		else if (vac.equalsIgnoreCase("No"))
		{
			vacStatus = "Unvaccinated";
	   
			System.out.println("Have you registered on MySejahtera application? (Yes/No): ");
			reg = input.next();
		   
			f.CheckYesNo(reg);
			if (reg.equalsIgnoreCase("Yes"))
			{
				System.out.println("Dear " +name+ " (" +IC+ "), kindly wait your turn to be vaccinated. Thank you.");
			}
			else if (reg.equalsIgnoreCase("No"))
			{
				System.out.println("State your reason for not registering on MySejahtera: ");
				reason = input.nextLine();
	   			
				System.out.println("State your phone number: ");
				phoNum = input.next();
	   			
				System.out.println("Dear " +name+ " (" +IC+ "), your reason for not registering yet in MySejahtera is: " +reason+ ".");
				System.out.println("Your reason has been recorded. Your phone number is " +phoNum+ ". KPM will contact you soon. Thank you.");
			}
	   }
	   pr.println("Name: \t" +name);
	   pr.println("Identification card: \t" +IC);
	   pr.println("Vaccination Status: \t" +vacStatus);
	   pr.println("Symptom Status: \t" +sympStatus);
	   pr.println("Reason for not registering MySejahtera: \t" +reason);
	   pr.println("Phone number: \t" +phoNum);
	   
	   input.close();
	   pr.close();
	}
}


