package com.Person;

import java.util.HashMap;
import java.util.Map;

import com.Documentation.Passport;

public abstract class Person {
	protected String firstName = null, lastName = null;
	protected double weight = 0.0;
	protected int age = 0, height = 0;
	protected boolean sex = false;
	private int numberOfPassport = 0;
	private int married = 0;
	public Map<String, Integer> propertyOfPerson;
	
	
	

	private int neuro[][][] = new int [1][2][5];
	private double neuroWeight[][][] = new double [1][2][5]; 

	public abstract void WhoAreYou();
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if(age - this.age == 1) this.age = age;
		else System.out.println("Not true age parameter " + age);
    }
	
	/*
	public void setAge(int age) {
		this.age = age;
	}
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	
	public String getFirstName() {
		return this.firstName;
		
	}
	
	public String getLastName() {
		return this.lastName;
		
	}
	
	public boolean getPassport(Passport passport) {
		this.setNumberOfPassport(passport.getNumberOfPassport());
		return true;
	}

	public int getNumberOfPassport() {
		return numberOfPassport;
	}

	public void setNumberOfPassport(int numberOfPassport) {
		this.numberOfPassport = numberOfPassport;
	}

	public int getMarried() {
		return married;
	}

	public void setMarried(int married) {
		this.married = married;
	}

	public int getNeuro(int i, int j) {
		return neuro[0][i][j];
	}

	public void setNeuro(int neuro, int i, int j) {
		this.neuro[0][i][j] = neuro;
	}

	public double getNeuroWeight(int i, int j) {
		return neuroWeight[0][i][j];
	}

	public void setNeuroWeight(double neuroWeight, int i, int j) {
		 this.neuroWeight[0][i][j] = neuroWeight;
	}
	  
}
 
