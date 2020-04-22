package com.Person;

public class Woman extends Person{

	public Woman(){
		WhoAreYou();
	}
	public Woman(String firstName, String lastName, int age, int height, double weight) {
		this.sex = false;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
		WhoAreYou();
		WhoAreYou(this.firstName, this.lastName, this.age, this.height, this.weight, this.sex);
			
	}
	@Override
	public void WhoAreYou() {
		//System.out.println("I'm a woman");
	}
	
	
	private void WhoAreYou(String firstName, String lastName, int age, int height, double weight, boolean sex) {
		
		System.out.println((sex ? "man" : "woman") + " : " + firstName + " " + lastName + " (age:" + this.getAge() + ", h:" + height + "cm, w:"  
				+ weight + " kg).");
	
	}
	@Override
	public void setAge(int age) {
		if(age - this.age == 1) this.age = age;
		else System.out.println("Not true age parameter " + age);
	}

}
