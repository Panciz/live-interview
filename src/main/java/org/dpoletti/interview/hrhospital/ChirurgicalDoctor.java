package org.dpoletti.interview.hrhospital;

public class ChirurgicalDoctor extends Doctor {

	public int operations;
	public int bonusOperation;

	@Override
	public int calculateSalary() {
		return super.calculateSalary()+(operations*bonusOperation);
	}
	
	
}
