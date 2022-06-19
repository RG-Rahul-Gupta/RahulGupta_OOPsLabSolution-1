package com.credential.database;


public class Employee
{
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	
	public void print() 
	{
		System.out.println("Employee registered - "+ firstName+" "+ lastName+"\n");	
	}
	
}
