package org.dpoletti.interview.hrhospital;

public abstract class Worker{

	private  String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int calculateSalary();
}
