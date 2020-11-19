package org.dpoletti.interview.hrhospital;

public class Doctor {

	
	public String name;
	public int workingHours;
	public int basicSalary;
	
	public int basicSalaryCalculation(){
		return workingHours*basicSalary;
	}
	
}
