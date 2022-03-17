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

//	private Iterable<Worker> getWorkersByName() {
//		Collections.sort(workers, new Comparator<Worker>() {
//			@Override
//			public int compare(Worker o1, Worker o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		}
//		);
//		return workers;
//	}
//	
//	private Iterable<Worker> getWorkersBySalary() {
//		Collections.sort(workers, new Comparator<Worker>() {
//
//			@Override
//			public int compare(Worker o1, Worker o2) {
//				return Integer.compare(o1.calculateSalary(), o2.calculateSalary());
//				
//			}
//		}
//		);
//		return workers;
//	}
	
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
	
	public void printWorkers() {
		System.out.println("=====List Original =======");
		workers.forEach(w->System.out.println(w.getName()+" "+w.calculateSalary()));
	}

	public void addWorker(Worker doc) {
		workers.add(doc);
	}
	
	public void alertEmergency() {
		workers.stream().filter(w->w instanceof Alertable)
					.map(w->(Alertable)w)
					.forEach(a->a.sendAllert());
	}
	
}
