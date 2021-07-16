package vacProg;

import java.io.*;

public class VacProgApp
{
	public static void main (String[] args) throws IOException
	{
		GUI.main(args);
		ToTxtFile txt = new ToTxtFile();
		txt.RunOutput();
	}
}