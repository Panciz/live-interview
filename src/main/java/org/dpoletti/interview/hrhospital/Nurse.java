package org.dpoletti.interview.hrhospital;

public class Nurse extends Worker {
	
	public String name;
	public int workingHours;
	public int basicSalary;
	public int nigthHour;
	public int nightSalary;
	
	private int basicSalaryCalculation(){
		return workingHours*basicSalary+(nigthHour*nightSalary);
	}

	@Override
	public int calculateSalary() {
		return basicSalaryCalculation();
	}
}
