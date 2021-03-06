package hrhospital;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.dpoletti.interview.hrhospital.ChirurgicalDoctor;
import org.dpoletti.interview.hrhospital.Department;
import org.dpoletti.interview.hrhospital.Doctor;
import org.dpoletti.interview.hrhospital.Nurse;
import org.junit.jupiter.api.Test;

public class HrTest {

	@Test
	public void testCalculateCost() {
		
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
		
		assertEquals(8100,d.calculateCost());
	} 
	
}
