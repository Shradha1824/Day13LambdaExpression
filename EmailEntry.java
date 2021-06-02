package com.lambda;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@FunctionalInterface
interface EmailValidationEntry {
	public abstract void emailValidation();
}

public class EmailEntry {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	   
		EmailValidationEntry myLambdaEntry = ()-> {
			String emailRegexString = "^[a-z]*[\\.[a-z\\+]]+@[a-z[.//]]*[[a-z]]{1,3}$";
			System.out.println("Enter your Email: ");
			String passward = scanner.next();
			
			Pattern p = Pattern.compile(emailRegexString);
			Matcher matcher = p.matcher(passward);
			
			if(passward.matches(emailRegexString)) {
				System.out.println("Given Emailaddress is valid");
			}
			else {
				System.out.println("Given Emailaddress is Invalid");
			}
		};
		
		myLambdaEntry.emailValidation();
	}      
}

