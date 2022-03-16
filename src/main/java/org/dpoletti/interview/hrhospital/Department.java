package org.dpoletti.interview.hrhospital;

import java.util.ArrayList;
import java.util.List;

public class Department implements CostCenter{

	private final List<Worker> workers = new ArrayList<Worker>();
	
	
	public int calculateCost() 
	{
		return workers.stream().map(Worker::calculateSalary).reduce(0,Integer::sum);
	}

	public void addWorker(Worker doc) {
		workers.add(doc);
	}
	
}
