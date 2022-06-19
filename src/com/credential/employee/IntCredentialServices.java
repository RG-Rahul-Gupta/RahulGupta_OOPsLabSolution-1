package com.credential.employee;

public interface IntCredentialServices 
{
	void generateempID();
	void generateEmailAddress(String firstName, String lastName, int department);
	void showEmpCredentials(String firstName, String lastName);
	void generatePassword(String firstName, String lastName, int department);
	
}
