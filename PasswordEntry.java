package com.lambda;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@FunctionalInterface
interface PasswardValidation {
	public abstract void passwardValide();
}
public class PasswordEntry {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	   
		PasswardValidation myLambdaEntry = ()-> {
			String passwardRegexString = "^[A-Z]+[a-z]{7}[#]$";
			System.out.println("Enter your Passward: ");
			String passward = scanner.next();
			
			Pattern p = Pattern.compile(passwardRegexString);
			Matcher matcher = p.matcher(passward);
			
			if(passward.matches(passwardRegexString)) {
				System.out.println("Given Passward is valid");
			}
			else {
				System.out.println("Given Passward is Invalid");
			}
		};
		
		myLambdaEntry.passwardValide();
	}      
}
