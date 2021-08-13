package vacProg;

public class MySejahtera extends userInfo {
 
	private boolean register;
	private String phoneNumber;
	
    
    
    
    public MySejahtera (String n, String i, boolean vs, boolean r,  String pn)//normal
    {
    	super(n, i, vs);
        register = false;
    }
	
	  public void setReason (String n, String i, boolean vs, boolean r, String pn)//mutator(setter)
	  {
	 	
		  register = false;
		
	  }
	  public String apptrue () {
		  if (register == true)
			  return  super.toString() +  "kindly wait your turn to be vaccinated. Thank you.";
		  else
			  return null;
	  }
	  public String myreason(String r) {
		  
		  if (register == false)
			  return  super.toString() + " your reason for not registering yet in MySejahtera :" + r + "\n" + " your phone number is " + phoneNumber + " KPM will contact you soon. Thank you.";
		  else 
			  return null;
	  }
	  
	  
}