package org.dpoletti.interview.hrhospital;

public class Technician extends Worker implements Alertable {

	@Override
	public int calculateSalary() {
		return 100;
	}
}
