package org.dpoletti.interview.hrhospital;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Department {

	private final List<Worker> workers = new ArrayList<Worker>();
	
	
	public List<Worker> getWorkersByName() 
	{
		return workers.stream()
				.sorted(Comparator.comparing(Worker::getName))
				.collect(Collectors.toList());
	}
	public List<Worker> getWorkersBySalary() 
	{
		return workers.stream()
				.sorted(Comparator.comparing(Worker::calculateSalary))
				.collect(Collectors.toList());
	}

	
	public void printListWorkerByName() {
		System.out.println("=====List By Name =======");
		getWorkersByName().forEach(w->{
			System.out.println(w.getName()+" "+w.calculateSalary());
		});
	}
	public void printWorkerBySalary() {
		System.out.println("=====List By Salary =======");
		getWorkersBySalary().forEach(w->{
			System.out.println(w.getName()+" "+w.calculateSalary());
		});
	}
	
	public void addWorker(Worker doc) {
		workers.add(doc);
	}
	
}
