package org.dpoletti.interview.hrhospital;

 interface Alertable {
	

	default void sendAllert() {
		System.out.println("Sent allert" + this.toString());
	}
}
