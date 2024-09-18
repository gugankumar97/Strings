package StringConcept;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegularExpressions {

	public static void main(String[] args) {
		
		System.out.println("===== Regular expressions =====");
		System.out.println();
		
		String gmailPattern = "[a-zA-Z-\\d]+#XXX\\.org";
		Pattern p = Pattern.compile(gmailPattern);
		String sampleText = "Some random#XXX.org text that contains gmail addresses "
				+ "like this one some-email@gmail.com. And some other random text.";
		Matcher m = p.matcher(sampleText); //identifies the pattern
		
		m.find(); // adding the identified pattern to matcher object
		String gmailAddress = m.group(); //retrieves the identified pattern and assigned to a string variable
		System.out.println(gmailAddress);
		
		

	}

}
