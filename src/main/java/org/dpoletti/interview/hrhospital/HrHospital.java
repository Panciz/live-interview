package org.dpoletti.interview.hrhospital;

import java.util.ArrayList;
import java.util.List;

public class HrHospital {

	
	public static final void main(String args[]) {
		
		
		List<CostCenter> costCenters = new ArrayList<>();	
		
		
		Department department = new Department();
		Doctor doctor1 = new Doctor();
		doctor1.name="Doc1";
		doctor1.basicSalary=100;
		doctor1.workingHours=10; 
		Nurse nurse1 = new Nurse();
		nurse1.name="Nurse1";
		nurse1.nightSalary=10;
		nurse1.basicSalary=9; 
		nurse1.workingHours=10;
		nurse1.nigthHour=1; 
		
		department.addWorker(doctor1);
		department.addWorker(nurse1);

		Doctor indipendentDoctor = new Doctor();
		indipendentDoctor.name="Doc1";
		indipendentDoctor.basicSalary=200;
		indipendentDoctor.workingHours=10; 
		
		
		costCenters.add(indipendentDoctor);
		
		costCenters.add(department);
		

		//Calculate costs
		
		System.out.println(costCenters.stream().map(CostCenter::calculateCost).reduce(0,Integer::sum));
	}
	
	
	
}
