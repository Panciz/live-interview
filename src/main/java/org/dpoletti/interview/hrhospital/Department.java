package org.dpoletti.interview.hrhospital;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private final List<Worker> workers = new ArrayList<Worker>();
	
	
	public int calculateCost() 
	{
		int res = 0;
		for(Worker w:workers) {
			res+=w.calculateSalary();
		}
		return  res;
	}

	public void addWorker(Worker doc) {
		workers.add(doc);
	}
	
}
