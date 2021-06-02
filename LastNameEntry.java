package com.lambda;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@FunctionalInterface
interface LastNameValidation {
	public abstract void lastName();
}
public class LastNameEntry {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	   
		 LastNameValidation myLambdaEntry = ()-> {
			String lastNRegexString = "^[a-zA-Z]{4,10}$";
			System.out.println("Enter your last name: ");
			String lastName = scanner.next();
			
			Pattern p = Pattern.compile(lastNRegexString);
			Matcher matcher = p.matcher(lastName);
			
			if(lastName.matches(lastNRegexString)) {
				System.out.println("last name is valid");
			}
			else {
				System.out.println("last name is invalid");
			}
		};
		myLambdaEntry.lastName();
	}      
}
