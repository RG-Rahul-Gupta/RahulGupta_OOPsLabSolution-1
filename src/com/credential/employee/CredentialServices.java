package com.credential.employee;

public class CredentialServices implements IntCredentialServices {
	public String firstName;
	public String lastName;
	String empID;
	String emailID;
	String[] password = new String[10];

	@Override
	public void generateempID() 
	{
		empID =String.valueOf((int)(10000 * Math.random()));
	}
	
	public void generatePassword(String firstName, String lastName, int department) 
	{ String temp1 = Character.toString(firstName.charAt(0));
	  String temp2 = Character.toString(lastName.charAt(0));
	  String temp3 = Character.toString(firstName.charAt(2));
	  String temp4 = Character.toString(lastName.charAt(2));
		password [0]=temp1.toUpperCase(); //
		password [1]=temp2.toUpperCase();
		password [2]=empID;
		password [3]=String.valueOf((int)(100*Math.random()));
		password [4]=String.valueOf((int)(100*Math.random()));
		password [5]="@";
		password [6]="#";
		password [7]=temp3.toLowerCase();
		password [8]=temp4.toLowerCase();
		password [9]=String.valueOf(department);
	}

	public void generateEmailAddress(String firstName, String lastName, int department) 
	{
		if(department==1) 
		{
			emailID = firstName.concat(lastName.concat("@".concat("Technical.".concat("abc.com"))));		
		}
		else if(department==2)
		{
			emailID = firstName.concat(lastName.concat("@".concat("Admin.".concat("abc.com"))));
		}
		else if(department==3)
		{
			emailID = firstName.concat(lastName.concat("@".concat("HumanResource.".concat("abc.com"))));
		}
		else if(department==4)
		{
			emailID = firstName.concat(lastName.concat("@".concat("Legal.".concat("abc.com"))));
		}
		else
		{
			emailID = " Data Entered Insufficient to generate Email-ID please contact HR Departement";
		}
		
	}

	public void showEmpCredentials(String firstName,String lastName) 
	{
		System.out.println("Dear "+firstName+" "+lastName+" your Generated Credentials are as follows - \n");
		System.out.println("Employee ID --> "+ empID);
		System.out.println("Email ID    --> "+ emailID);
		System.out.print("Passowrd    --> ");
		for(int i=0; i<password.length; i++)
		{
			System.out.print(password[i]);
		}
		System.out.println("\n");
		System.out.println("Note - Please Change Your Email ID Password for Securtiy Purposes \n");
	}

}
