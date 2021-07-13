package vacProg;

import java.io.*;
import java.util.*;

public class Test123
{
	public class User
	{
		private String name; 
		private String reason;
		private String ic;
		private String phoNum;
		private String vacStatus;
		private String sympStatus;
		
		public User (String name, String reason, String ic, String phoNum, String vacStatus, String sympStatus)
		{
			name = null; 
			reason = null;
			ic = null;
			phoNum = null;
			vacStatus = null;
			sympStatus = null;
		}
	}
	public static void main (String[] args) throws Exception
	{
	   Scanner in = new Scanner(System.in);
       
       BufferedWriter br = new BufferedWriter(new FileWriter("D:\\Users\\Asus\\Desktop\\DetailUser.txt"));
       PrintWriter pr = new PrintWriter(br);
       
	  // String name = null, reason = null, ic = null, phoNum = null, vacStatus = null, sympStatus = null;
	  // char vac, symp, reg;

	   System.out.println("Enter your name: ");
	   User.name = in.nextLine();
   
	   System.out.println("Enter your identification card (IC) number: ");
	   ic = in.next();
   
	   System.out.println("Have you been vaccinated before (at least first dose)? (Y/N): ");
	   vac = in.next().charAt(0);
	   
	   if (vac == 'Y' || vac == 'y')
	   {
		   vacStatus = "Vaccinated";
		   
		   System.out.println("Are you exhibiting any of the symptoms? \n(Cough/Difficulty/Loss of smell/Loss of taste) (Y/N):");
		   symp = in.next().charAt(0);
		   
		   if (symp == 'Y' || symp == 'y')
		   {
			   sympStatus = "Have symptoms";
			   System.out.println("Dear " +name+ " (" +ic+ "), you have a symptom. Please consult a doctor very soon. Thank you.");
		   }
		   else
		   {
			   sympStatus = "No symptoms";
			   System.out.println("Dear " +name+ " (" +ic+ "), congratulations, You have been vaccinated. Thank you.");
		   }
	   }
	   else
	   {
		   	vacStatus = "Unvaccinated";
		   
		   	System.out.println("Have you registered on MySejahtera application? (Y/N): ");
		   	reg = in.next().charAt(0);
		   	if (reg == 'Y' || reg == 'y')
		   	{
		   		System.out.println("Dear " +name+ " (" +ic+ "), kindly wait your turn to be vaccinated. Thank you.");
		   	}
		   	else
		   	{
		   		System.out.println("State your reason for not registering on MySejahtera: ");
		   		reason = in.nextLine();
		   		
		   		System.out.println("State your phone number: ");
		   		phoNum = in.next();
		   		
		   		System.out.println("Dear " +name+ " (" +ic+ "), your reason for not registering yet in MySejahtera is: " +reason+ ".");
		   		System.out.println("Your reason has been recorded. Your phone number is " +phoNum+ ". KPM will contact you soon. Thank you.");
		   		

		   	}
	   }
	   pr.println("Name: \t" +name);
	   pr.println("Identification card: \t" +ic);
	   pr.println("Vaccination Status: \t" +vacStatus);
	   pr.println("Symptom Status: \t" +sympStatus);
	   pr.println("Reason for not registering MySejahtera: \t" +reason);
	   pr.println("Phone number: \t" +phoNum);
	   
	   in.close();
	   pr.close();
	}
}
// aseroakseorakweorakwer kaerollllll reason kerolllllnnnnnnnnnnnnn



