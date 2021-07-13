package vacProg;
import java.util.*;

public class Test123
{
   public static void main (String args[]) {
   Scanner identity = new Scanner(System.in);
   
   String name;
   int ic;
   String vac;
   
   System.out.println("Please enter your name : ");
   name = identity.next();
   
   System.out.println("Please enter your identification card(IC) number : ");
   ic = identity.nextInt();
   
   System.out.println("Have you been vaccinated before ? : ");
   vac = identity.next();
   }
}


