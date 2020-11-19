package org.dpoletti.interview.hrhospital;

public class Doctor extends Worker {

	
	public String name;
	public int workingHours;
	public int basicSalary;
	
	private int basicSalaryCalculation(){
		return workingHours*basicSalary;
	}

	@Override
	public int calculateSalary() {
		return basicSalaryCalculation();
	}
	
}
