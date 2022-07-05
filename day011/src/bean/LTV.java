package bean;

import frame.TV;

public class LTV implements TV {
	
	public LTV() {
		System.out.println("Creat LG TV Bean...");
	}

	@Override
	public void on() {
		System.out.println("lg TV ON...");
	}

	@Override
	public void off() {
		System.out.println("lg TV OFF...");

	}

}
