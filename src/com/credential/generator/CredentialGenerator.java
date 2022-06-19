package com.credential.generator;

import java.util.Scanner;
import com.credential.employee.CredentialServices;
import com.credential.employee.IntCredentialServices;
import com.credential.database.Employee;

public class CredentialGenerator extends CredentialServices 
{   static String firstName;
    static String lastName;
	public static IntCredentialServices credentials = new CredentialServices();
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main (String args[]) 
	{
		System.out.println("Welcome to Our Company New Employee Registering Portal \n\n");
		System.out.println("Please proceed by Entering your Details \n\n");
		System.out.println("Enter Your First Name - ");
		firstName = sc.nextLine();
		System.out.println("Enter Your Last Name - ");
		lastName = sc.nextLine();
		Employee emp = new Employee(firstName, lastName);
		int department;
	    do {department = choosedepartment(emp); }
	    while	(department!=0 && department<5);
		
	}
	
	public static int choosedepartment(Employee emp) {
		System.out.println("Please Choose your department from the following - \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		int department = sc.nextInt();
		switch(department) {
	    case 1:
	    {
	    	emp.print();
	    	credentials.generateempID();
	    	credentials.generateEmailAddress(firstName, lastName, department);
	    	credentials.generatePassword(firstName, lastName, department);
	    	credentials.showEmpCredentials(firstName, lastName);
	    	System.out.println("Employee Registered under Technical Department");
	    }
	    break;
	    case 2:
	    {
	    	emp.print();
	    	credentials.generateempID();
	    	credentials.generateEmailAddress(firstName, lastName, department);
	    	credentials.generatePassword(firstName, lastName, department);
	    	credentials.showEmpCredentials(firstName, lastName);
	    	System.out.println("Employee Registered under Admin Department");
	    }
	    break;
	    case 3:
	    {
	    	emp.print();
	    	credentials.generateempID();
	    	credentials.generateEmailAddress(firstName, lastName, department);
	    	credentials.generatePassword(firstName, lastName, department);
	    	credentials.showEmpCredentials(firstName, lastName);
	    	System.out.println("Employee Registered under Human Resource Department");
	    }
	    break;
	    case 4:
	    {
	    	emp.print();
	    	credentials.generateempID();
	    	credentials.generateEmailAddress(firstName, lastName, department);
	    	credentials.generatePassword(firstName, lastName, department);
	    	credentials.showEmpCredentials(firstName, lastName);
	    	System.out.println("Employee Registered under Legal Department");
	    }
	    break;
	    default:
	    {
	    	System.out.println("Ivalid Option Selected, Please Select from the Options Provided");
	    }
	    break;
	    }
		return 0;
	}

}
