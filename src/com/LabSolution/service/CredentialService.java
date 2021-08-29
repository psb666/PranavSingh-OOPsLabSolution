package com.LabSolution.service;
import com.LabSolution.model.*;
import java.util.Random;
public class CredentialService {

	public String generateEmailAddress(Employee emp) {
		
		
		return emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+ emp.getDepartment() + ".greatlearning.com";
	}
	
	public String generatePassword() {
		
		Random random = new Random();
		
		String allowedChars="QWERTYUIOPLKJHGFDSAZXCVBNMmnbvcxzlkjhgfdsapoiuytrewq0987654321!@#$%^&*_=+-/.?<>";
		
		char[] password =  new char [8];
		
		for (int i=0;i<8;i++) {
			int index = random.nextInt(allowedChars.length());
		password[i]= allowedChars.charAt(index);
		}
		
		return new String(password);
	}
	
	public void showCredentials(Employee emp, String email, String password) {
		System.out.println("Dear "+emp.getFirstName()+" - here are your credentials");
		System.out.println( "Email : " + email );
		System.out.println( "Password : " + password );

	}
}
