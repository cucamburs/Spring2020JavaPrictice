package com.Technical;

import java.util.HashSet;
import java.util.Iterator;

import com.Person.Man;
import com.Person.Woman;

public class Lists {
	public static HashSet<Man> man = new HashSet<Man>();  
	public static HashSet<Woman> woman = new HashSet<Woman>();
	
	
	
	public static Man getManList(Man fMan) {
		Man m = null;
		int i = 0;
		Iterator <Man> itr = man.iterator();
		
		while (itr.hasNext())
		{
			boolean searchMan = false;
			
			m = itr.next();
			
			if(fMan.getFirstName() != null && fMan.getFirstName() == m.getFirstName())
				{
					searchMan = true;
				}
			else if(fMan.getFirstName() != null) {searchMan = false; continue;}	
		
			if(fMan.getLastName() != null && fMan.getLastName() == m.getLastName())
				{
					searchMan = true;
				}
			
			else if(fMan.getLastName() != null) {searchMan = false; continue;}

			if(fMan.getAge() != 0 && fMan.getAge() == m.getAge())
				{
					searchMan = true;
				}
			else if(fMan.getAge() != 0) {searchMan = false; continue;}

			if(fMan.getMarried() != 0 && fMan.getMarried() == m.getMarried())
				{
					searchMan = true;
				}
			else if(fMan.getMarried() != 0) {searchMan = false; continue;}
			
			if (searchMan) i++;

		}
		if (i == 1)return m;
		else System.out.println("found more one man or man did't find");
		
		return m;
	}
}
