package vacProg;

public class reason extends newuserInfo {

	private String reason; 
	private boolean register;
    
    
    
    public reason (String n, String i, String pn, boolean vs, boolean r)//normal
    {
    	super(n, i, pn, vs);
        register = false;
    }
	
	  public void setReason (String n, String i, String pn, boolean vs, boolean r)//mutator(setter)
	  {
	 	
		  register = false;
		
	  }
	  public void setPhoNum (String r) {
		  super.setPhoNum(r);
	  }
	  public String reason(String r) {
		  if (register == true)
			  return  super.toString() +  "kindly wait your turn to be vaccinated. Thank you.";
		  else if (register == false)
			  return  super.toString() + " your reason for not registering yet in MySejahtera :" + r + "\n" + " your phone number is " + super.getPhoNum() + " KPM will contact you soon. Thank you.";
		  else 
			  return null;
	  }
}
