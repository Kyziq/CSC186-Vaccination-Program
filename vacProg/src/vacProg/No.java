package vacProg;

public class No extends newuserInfo
{
   
      private String reason; 
      
     
      public No (String n, String i, String pn, String vs, String r)//normal
      {
    	  super(n, i, pn, vs);
         reason = r;
      }
      
      public void setNo (String n, String i, String pn, String vs, String r)//mutator(setter)
	  {
		reason = r;
	  }
      
      
      //accessor(getter)
		public String getReason () {return reason;}
	
   
   
}

