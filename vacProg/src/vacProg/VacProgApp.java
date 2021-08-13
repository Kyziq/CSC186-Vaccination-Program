
package vacProg;
import java.io.*;
import java.util.*;

public class VacProgApp
{
	public static void main (String[] args) throws Exception
	{
		//Functions f = new Functions();
		//newuserInfo ne = new newuserInfo();
		
		
		
		Scanner input = new Scanner(System.in);
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\DetailUser.txt"));
		PrintWriter pr = new PrintWriter(br);
       
		String symp, reg, vac, name = null, reason = null, IC = null, phoNum = " ";
		boolean sympStatus = false;
		boolean vacStatus = false;
		boolean regStatus = false;
	   
		System.out.println("Enter your name: ");
		name = input.nextLine();
   
		System.out.println("Enter your identification card (IC) number: ");
		IC = input.next();
		
   
		System.out.println("Have you been vaccinated before (at least first dose)? (Yes/No): ");
		vac = input.next();
	   
		//f.CheckYesNo(vac);
		
		if (vac.equalsIgnoreCase("Yes"))
	   	{
			
			vacStatus = true;
	   
			System.out.println("Are you exhibiting any of the symptoms? \n(Cough/Difficulty/Loss of smell/Loss of taste) (Yes/No):");
			symp = input.next();
			if (symp.equalsIgnoreCase("Yes"))
				sympStatus = true;
			checkSymptom cs = new checkSymptom(name, IC, vacStatus, sympStatus );
			System.out.println(cs.resultsymp());
			
	   	}
		else if (vac.equalsIgnoreCase("No"))
		{
			vacStatus = false;
			
			System.out.println("Have you registered on MySejahtera application? (Yes/No): ");
			reg = input.next();
			 if (reg.equalsIgnoreCase ("Yes") ) {
				 regStatus = true;
				 MySejahtera ms = new MySejahtera(name, IC, vacStatus, regStatus,phoNum);
				 System.out.println(ms.apptrue());
		}else if (reg.equalsIgnoreCase("No") ) {
				
				regStatus = false;
				System.out.println("State your reason for not registering on MySejahtera: ");
				reason = input.nextLine();
		   			
				System.out.println("State your phone number: ");
				phoNum = input.nextLine();
				MySejahtera ms = new MySejahtera(name, IC, vacStatus, regStatus,phoNum);
				System.out.println(ms.myreason(reason));
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