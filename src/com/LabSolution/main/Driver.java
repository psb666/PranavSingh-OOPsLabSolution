package com.LabSolution.main;
import com.LabSolution.service.*;
import java.util.Scanner;
import com.LabSolution.model.*;

public class Driver {
	private static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("Your first name: ");
		String firstName = in.next();
		System.out.println("Your last name: ");
		String lastName = in.next();
		System.out.println("Your department: ");
		System.out.println("1. Technical ");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int choice = in.nextInt();
		
		Employee emp;
		
		switch(choice) {
		case 1:
			emp = new Employee( firstName, lastName, "tech" );
		break;
	case 2:
		emp = new Employee( firstName, lastName, "adm" );
		break;
	case 3:
		emp = new Employee( firstName, lastName, "hr" );
		break;
	case 4:
		emp = new Employee( firstName, lastName, "lg" );
		break;
	default:
		System.out.println( "Incorrect choice" );
		return;
		}
		CredentialService serv = new CredentialService();
		String email = serv.generateEmailAddress( emp );
		
		String password=serv.generatePassword();
		
		serv.showCredentials( emp, email, password );


	}
	
}
