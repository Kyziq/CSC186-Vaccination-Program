package vacProg;

public class Functions 
{
	public CheckInput(String input)
	{
		   while (!vac.equalsIgnoreCase("Yes") || !vac.equalsIgnoreCase("No"))
		   {
			   if(vac.equalsIgnoreCase("Yes") || vac.equalsIgnoreCase("No")) break;
			   System.out.println("Wrong answer! Try again.");
			   vac = input.next();
		   }
	}
}
