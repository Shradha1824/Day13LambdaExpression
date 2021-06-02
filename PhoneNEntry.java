package com.lambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface PhoneNoEntry {
	public abstract void phoneNoValide();
}
public class PhoneNEntry {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	   
		PhoneNoEntry myLambdaEntry = ()-> {
			String phoneNoRegexString = "^91//s[7-9]{1}[0-9]{9}$";
			System.out.println("Enter your Phone No: ");
			String phoneNo = "91 8123456780";
			
			Pattern p = Pattern.compile(phoneNoRegexString);
		//	Matcher matcher = p.matcher(phoneNo);
			
			if(phoneNo.matches(phoneNoRegexString)) {
				System.out.println("phone no is valid");
			}
			else {
				System.out.println("Phone No is Invalid");
			}
		};
		
		myLambdaEntry.phoneNoValide();
	}      
}
