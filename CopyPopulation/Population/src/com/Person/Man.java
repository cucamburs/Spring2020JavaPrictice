package com.Person;

import java.util.HashMap;


public class Man extends Person {
	
	public Man(){
		WhoAreYou();	
	}
	public Man(String firstName, String lastName, int age, int height, double weight) {
		
		this.sex = true;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		this.propertyOfPerson = new HashMap<String, Integer>();
		
		
		WhoAreYou();
		
		WhoAreYou(this.firstName, this.lastName, this.age, this.height, this.weight, this.sex);
		
		
		//System.out.println("I am "  + firstName + " " + lastName + ". I'm " + (sex ? "man" : "woman") + ", my age " + this.getAge() + " years old, height " + height + "cm and weight "  
		//		+ weight + " kg.");
		
		
		
			
	}

		@Override
	public void WhoAreYou() {
	//System.out.print("Man: ");
	}
	
		
		private void WhoAreYou(String firstName, String lastName, int age, int height, double weight, boolean sex) {
	System.out.println((sex ? "man" : "woman") + " : " + firstName + " " + lastName + " (age:" + this.getAge() + ", h:" + height + "cm, w:"  
			+ weight + " kg).");

		}
	
/*
	   public void setAge(int age) {
			if(age - this.age == 1) this.age = age;
			else System.out.println("Not true age parameter " + age);
        }
*/	  
	
	
}
