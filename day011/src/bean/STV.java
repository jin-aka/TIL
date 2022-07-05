package bean;

import frame.TV;

public class STV implements TV {
	
	public STV() {
		System.out.println("Creat SS TV Bean...");
	}
	
	@Override
	public void on() {
		System.out.println("ss TV ON...");

	}

	@Override
	public void off() {
		System.out.println("ss TV OFF...");

	}

}
