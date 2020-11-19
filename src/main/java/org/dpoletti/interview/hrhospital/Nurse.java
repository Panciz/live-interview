package org.dpoletti.interview.hrhospital;

public class Nurse {
	
	public String name;
	public int workingHours;
	public int basicSalary;
	public int nigthHour;
	public int nightSalary;
	
	public int basicSalaryCalculation(){
		return workingHours*basicSalary+(nigthHour*nightSalary);
	}
}
