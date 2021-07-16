package vacProg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ToTxtFile extends userInfo
{
	public void RunOutput() throws IOException
	{
		Scanner input = new Scanner(System.in);
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\DetailUser.txt"));
		PrintWriter pr = new PrintWriter(br);
		
		pr.println("Name: \t" +userName);
		pr.println("Identification card: \t" +userIC);
		pr.println("Vaccination Status: \t" +getUserVacStatus());
		pr.println("Symptom Status: \t" +userSympStatus);
		pr.println("Reason for not registering MySejahtera: \t" +userReason);
		pr.println("Phone number: \t" +userPhone);
		
		input.close();
		pr.close();
	}
}