package vacProg;

public class checkSymptom extends userInfo
{
	// n = name, i = IC, vs = vaccine status, ss = symptom status
	private boolean sympStatus;
    public checkSymptom (String n, String i, boolean vs, boolean ss)//normal
    {
    	super(n, i, vs);
        sympStatus = ss;
    }
	public void setYes (String n, String i, boolean vs, boolean ss)//mutator(setter)
	{
	 	
		sympStatus = ss;
	}
    // Accessor(getter)
	public boolean getSympStatus () {return sympStatus;}
	
	public String resultsymp() 
	{
		if (sympStatus == true)
			return  super.toString() + "you have a symptom. Please consult a doctor very soon. Thank you.";
		    else if (sympStatus == false)
		    	return  super.toString() + "congratulations, You have been vaccinated. Thank you.";
		    else 
		    	return null;
	 }
}

