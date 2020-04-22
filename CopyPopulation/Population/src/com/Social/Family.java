package com.Social;

import com.Person.*;

public class Family {
	protected String lastName = null;
	protected int age = 0;
	
	public boolean registrationOfFamily(Woman woman, Man man) {
	if(woman.getAge() >= 16 && man.getAge() >= 18
			&& woman.getMarried() != 0 && man.getMarried() != 0) 
		{ 
			woman.setMarried(man.getNumberOfPassport());
			woman.setLastName(man.getLastName());
			man.setMarried(woman.getNumberOfPassport());
			return true;
		}
	else return false;	
	}
	
}
