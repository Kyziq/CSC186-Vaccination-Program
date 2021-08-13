package vacProg;

public class userInfo 
{
	// All variables for user
	private String userName, userIC, userReason, userSympText, userVacText, userRegisteredText;
	private long userPhone;
	private boolean userVacStatus, userSympStatus; 
	//private boolean userRegisteredStatus;
		
	public userInfo() // Default
	{
		userName = ""; 
		userIC = "";
		userReason = "";
		userPhone = 0;
		userSympText = "";
		userVacText = "";
		userRegisteredText = "";

		userVacStatus = false;
		userSympStatus = false;
		//userRegisteredStatus = false;
	}
		
	// Setter
	public void setName(String name) {
		this.userName = name;
	}
	public void setIC(String IC) {
		this.userIC = IC;
	}
	public void setReason(String reason) {
		this.userReason = reason;
	}
	public void setPhone(long phone) {
		this.userPhone = phone;
	}
	public void setVacStatus(boolean vacS) {
		this.userVacStatus = vacS;
	}
	public void setVacText(String vacT) 
	{
		this.userVacText = vacT;
	}
	public void setSympStatus(boolean sympS) {
		this.userSympStatus = sympS;
	}
	public void setSympText(String sympT) {
		this.userSympText = sympT;
	}
	/*public void setRegisteredStatus(boolean regS) {
		this.userRegisteredStatus = regS;
	}*/
	public void setRegisteredText(String regT) {
		this.userRegisteredText = regT;
	}
	
	// Getter
	public String getName() {
		return this.userName;
	}
	public String getIC() {
		return this.userIC;
	}
	public String getReason() {
		return this.userReason;
	}
	public long getPhone() {
		return this.userPhone;
	}
	public boolean getVacStatus() {
		return this.userVacStatus;
	}
	public String getVacText() {
		return this.userVacText;
	}
	public boolean getSympStatus() {
		return this.userSympStatus;
	}
	public String getSympText() {
		return this.userSympText;
	}
	/*public boolean getRegisteredStatus() {
		return this.userRegisteredStatus;
	}*/
	public String getRegisteredText() {
		return this.userRegisteredText;
	}
	
	public String toString() { 
		return "Dear " + this.userName + "(" + this.userIC + "), "; 
	}
}