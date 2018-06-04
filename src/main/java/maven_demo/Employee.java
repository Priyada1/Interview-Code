package maven_demo;

import java.util.Date;

public class Employee {

	private String name;
	private String email;
	private Date dob;
	private double salary;
	
	
	public Employee(String name, String email, Date dob,double salary)
	{
		this.name=name;
		this.email=email;
		this.dob=dob;
		this.salary=salary;
		
	}
	
	public void  setName()
	{
		
	}
	
	public  String getName()
	{
		return name;
	}
	
	public  String getEmail()
	{
		return email;
	}
	
	public  Date getDob()
	{
		return dob;
	}
	
	public  double getSalary()
	{
		return salary;
	}
	
}
