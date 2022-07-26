package AssistedProject;

import java.util.*;
public class email {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> mail = new ArrayList<>();
        
        mail.add("kannan@gmail.com");
        mail.add("learning.org");
        mail.add("saravanan@yahoo.com");
        mail.add(" siva27@gmail.com");
        mail.add("divya23@gmail.com");
        mail.add("saravanan23@gmail.com");

				
		 System.out.println("Enter an Email to search");
		//Get input from user to search emailid
	   String s=sc.next();
	   //Validating email
	      for (String ele:mail)
	      {
	    	  if(ele.contains(s))
	    	  {
	    		  System.out.println("Valid email");
	    		  break;
	    	  }
	    	  else 
	    	  {
	    		  System.out.println("Invalid email");
	    		  break;
	    	  }
	    	  
	       }
	}
}
