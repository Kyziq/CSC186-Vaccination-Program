package vacProg;

public class userInfo 
{
	
		private String name; 
		private String ic;
		
		private boolean vacStatus;
		
		
		public userInfo()//default
		{
			name = " "; 
			ic = " ";
			vacStatus = false;
			
		}
		
		public userInfo (String n, String i, boolean vs)//normal
		{
			name = n; 
			ic = i;
			vacStatus = vs;
	
		}
		
		public void setUser (String n, String i, boolean vs)//mutator
		{
			name = n; 
			ic = i;
			vacStatus = vs;
			
		}
		
		 //accessor(getter)
		public String getName () {return name;}
		public String getIc () {return ic;}
		
		public boolean getVacStatus () {return vacStatus;}
		
		public void statusVac() {
			if (vacStatus == true)
				System.out.println("Vaccinated");
			else if (vacStatus == false)
				System.out.println("Unvaccinated");
		}
		public String toString () {return "Dear " + name + "(" + ic + ")";}
}