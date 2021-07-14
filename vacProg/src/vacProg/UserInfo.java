package vacProg;

public class UserInfo 
{
	public class User
	{
		private String name; 
		private String reason;
		private String ic;
		private String phoNum;
		private String vacStatus;
		private String sympStatus;
		
		public User()//default
		{
			name = null; 
			reason = null;
			ic = null;
			phoNum = null;
			vacStatus = null;
			sympStatus = null;
		}
		
		public User (String n, String r, String i, String pn, String vs, String ss)//normal
		{
			name = n; 
			reason = r;
			ic = i;
			phoNum = pn;
			vacStatus = vs;
			sympStatus = ss;
		}
		
		public void User (String n, String r, String i, String pn, String vs, String ss)//mutator
		{
			name = n; 
			reason = r;
			ic = i;
			phoNum = pn;
			vacStatus = vs;
			sympStatus = ss;
		}
		 //accessor(getter)
		public String getName () {return name;}
		public String getReason () {return reason;}
		public String getIc () {return ic;}
		public String getPhoNum () {return phoNum;}
		public String getVacStatus () {return vacStatus;}
		public String getSympStatus () {return sympStatus;}
		
	}
}
