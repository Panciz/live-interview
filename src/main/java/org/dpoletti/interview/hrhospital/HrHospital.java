package org.dpoletti.interview.hrhospital;

public class HrHospital {

	
	public static final void main(String args[]) {
		Department department = new Department();
		for(int i=0;i<5;i++) {
			Doctor doctor1 = new Doctor();
			doctor1.setName( (char)((int)(Math.random()*100)%26+65)+"-Doc"+i);
			doctor1.basicSalary=(int)((Math.random()*100)+10);
			doctor1.workingHours=(int)((Math.random()*10));; 
			department.addWorker(doctor1);
		}
		for(int i=0;i<5;i++) {
			Nurse nurse1 = new Nurse();
			nurse1.setName((char)((int)(Math.random()*100)%26+65)+"-Nurse"+i);
			nurse1.nightSalary=(int)((Math.random()*110));
			nurse1.basicSalary=(int)((Math.random()*100)); 
			nurse1.workingHours=(int)((Math.random()*10));
			nurse1.nigthHour=(int)((Math.random()*2));;  
			department.addWorker(nurse1);

		}	
		for(int i=0;i<2;i++) {
			ChirurgicalDoctor cdoctor = new ChirurgicalDoctor();
			cdoctor.setName((char)((int)(Math.random()*100)%26+65)+"-DocCh"+i);
			cdoctor.basicSalary=(int)((Math.random()*100)+10);
			cdoctor.workingHours=(int)((Math.random()*10)); 
			cdoctor.operations=10;
			cdoctor.bonusOperation=100; 
			department.addWorker(cdoctor);

		}
		
		
		for(int i=0;i<2;i++) {
			Technician technician = new Technician();
			technician.setName((char)((int)(Math.random()*100)%26+65)+"-Tec"+i);

			department.addWorker(technician);

		}
		department.printWorkers();
		department.printListWorkerByName();
		department.printWorkerBySalary();
		department.alertEmergency();
	}
}
