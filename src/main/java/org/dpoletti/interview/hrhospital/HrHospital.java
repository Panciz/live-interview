package org.dpoletti.interview.hrhospital;

public class HrHospital {

	
	public static final void main(String args[]) {
		Department department = new Department();
		Doctor doctor1 = new Doctor();
		doctor1.name="Doc1";
		doctor1.basicSalary=20;
		doctor1.workingHours=160; 
		Nurse nurse1 = new Nurse();
		nurse1.name="Nurse1";
		nurse1.nightSalary=10;
		nurse1.basicSalary=5; 
		nurse1.workingHours=100;
		nurse1.nigthHour=20; 
		
		department.addWorker(doctor1);
		department.addWorker(nurse1);
		
		ChirurgicalDoctor cdoctor = new ChirurgicalDoctor();
		cdoctor.name="Doc1";
		cdoctor.basicSalary=20;
		cdoctor.workingHours=160; 
		cdoctor.operations=10;
		cdoctor.bonusOperation=100; 
		
		department.addWorker(cdoctor);
		System.out.println(department.calculateCost());
	}
}
