package interfacesancCollection;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailidValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String>emails=new ArrayList<String>();
     
    emails.add("nisha@gamil.com");
    emails.add("sakshi1@gmail.com");
    emails.add("mahi2@gamil.com");
    emails.add("chaitra@yahoo.com");
    emails.add("Sanju5@yahoo.com");
    
    emails.add("@gamil.com");
    emails.add("patil#gamil.com");
    
    String regex="^(.+)@(.+)$";
    Pattern pattern=Pattern.compile(regex);
    
    for(String email:emails) {
    Matcher matcher=pattern.matcher(email);
    System.out.println(email+":"+matcher.matches());
    }
	}

}
