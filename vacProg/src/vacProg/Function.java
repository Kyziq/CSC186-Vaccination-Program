import java.util.*;

public class Functions 
{
	public void CheckYesNo(String word)
	{
		Scanner input = new Scanner(System.in);
		while (!word.equalsIgnoreCase("Yes") || !word.equalsIgnoreCase("No"))
		{
			if(word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No")) break;
			System.out.println("Wrong answer! Try again.");
			word = input.next();
		}
		input.close();
	}
}