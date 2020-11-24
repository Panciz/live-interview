package org.dpoletti.interview.hrhospital;

public class HrHospital {

	
	public static final void main(String args[]) {
		Department d = new Department();
		Doctor doc = new Doctor();
		doc.name="Doc1";
		doc.basicSalary=20;
		doc.workingHours=160; 
		Nurse n = new Nurse();
		n.name="Nurse1";
		n.nightSalary=10;
		n.basicSalary=5; 
		n.workingHours=100;
		n.nigthHour=20; 
		
		d.addWorker(doc);
		d.addWorker(n);
		
		ChirurgicalDoctor cdoc = new ChirurgicalDoctor();
		cdoc.name="Doc1";
		cdoc.basicSalary=20;
		cdoc.workingHours=160; 
		cdoc.operations=10;
		cdoc.bonusOperation=100; 
		
		d.addWorker(cdoc);
		System.out.println(d.calculateCost());
	}
}
