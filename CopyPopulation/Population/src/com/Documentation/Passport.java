package com.Documentation;

import java.util.Random;

public class Passport {
	
	private int numberOfPassport = 0;
		
	public Passport() {
		// add to ahead  the start zero
		Random r = new Random();
		this.numberOfPassport = r.nextInt(9999999);
	}
	
	public int getNumberOfPassport() {
		return this.numberOfPassport;
	}
}
