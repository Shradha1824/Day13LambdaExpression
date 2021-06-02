package com.lambda;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@FunctionalInterface
interface IValideUserEntry {
	public abstract void firstNameValide();
}

public class FirstNameEntry {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
			IValideUserEntry myLambdaEntry = ()-> {
			String firstNRegexString = "^[a-zA-Z]{4,15}$";
			System.out.println("Enter your first name: ");
			String firstName = scanner.next();
			
			Pattern p = Pattern.compile(firstNRegexString);
			Matcher matcher = p.matcher(firstName);
			
			if(firstName.matches(firstNRegexString)) {
				System.out.println("first name is valid");
			}
			else {
				System.out.println("first name is invalid");
			}
		};
			myLambdaEntry.firstNameValide();
	}      
}
