package AssistedProject;
import java.util.regex.*;

import java.util.*;
public class EmailValidation {

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
  
    public static void main(String[] args)
    {
        ArrayList<String> mail = new ArrayList<>();
            
          mail.add("kannan@gmail.com");
          mail.add("learning.org");
          mail.add("saravanan@yahoo.com");
            
        for(String i : mail){
            if (isValid(i))
                System.out.println(i + " - VALID");
            else
                System.out.println(i + " - INVALID");
        }
    }
}
