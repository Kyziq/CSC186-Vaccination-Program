package vacProg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class userInfo 
{
	// Variables
	public static String userName="", userIC="", userVac="", userSymp="", userReg="", userReason="", userPhone="", userVacStatus="";
	
	public static boolean userSympStatus, userRegStatus;
	
	public static JLabel nameLabel, icLabel, vacLabel, sympLabel, regLabel;
	public static JLabel finalText, finalText2, finalText3, finalText4;
	
	public static JTextField nameText, icText, vacText, sympText, regText, reasonText, phoneText;

	public static JButton submit1, submitVacYes, submitVacNo, submitFinal; 
	
	// Panel, Frames
	final static JFrame frame1 = new JFrame("Vaccination Program");
	static JPanel panel1 = new JPanel();
	final static JFrame frameVacYes = new JFrame("Vaccination Program");
	static JPanel panelVacYes = new JPanel();
	final static JFrame frameVacNo = new JFrame("Vaccination Program");
	static JPanel panelVacNo = new JPanel();
	final static JFrame frameFinal = new JFrame("Vaccination Program");
	static JPanel panelFinal = new JPanel();
		
	public userInfo() // Default
	{
		userName = ""; 
		userIC = "";
		userVacStatus = "";
	}
	public userInfo (String n, String i, String vs) // Normal
	{
		userName = n; 
		userIC = i;
		userVacStatus = vs;
	}
	public void setUser (String n, String i, String vs) // Mutator
	{
		userName = n; 
		userIC = i;
		userVacStatus = vs;
		//test harith
	}
	 // Accessor(getter) / Functions / Methods
	public void HideAndShowFrame(JFrame input1, JFrame input2)
	{
		input1.setVisible(false);
		input2.setVisible(true);
		input2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static String getUserVacStatus() { return userVacStatus; }
	public static void setUserVacStatus(String userVacStatus) { GUI.userVacStatus = userVacStatus; }
	
	public static String convertToMultiline(String orig) { return "<html>" + orig.replaceAll("\n", "<br>"); }
	public String getName () { return userName; }
	public String getIC () { return userIC; }
}