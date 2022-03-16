package org.dpoletti.interview.hrhospital;

public abstract class Worker implements CostCenter{

	public String name;
	
	public abstract int calculateSalary();
	
	public int calculateCost() {
		return this.calculateSalary();
	}
	
}
