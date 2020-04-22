package com.Life;



import com.Documentation.Passport;
import com.Person.Man;
import com.Person.Person;
import com.Person.Woman;
import com.Social.Birth;
import com.Social.Family;
import com.Technical.Lists;


public class Life {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Birth.birthMan("Macsim", "Sobolev", 20, 173, 75.5);
	//	Birth.birthMan("Kiril", "Uriv", 22, 168, 71.5);
	//	Birth.birthMan("Valera", "Belik", 25, 170, 73.5);
	/*	
		for (Man element : Lists.man)
			
			System.out.println(element.getFirstName() + " "+  element.getLastName());
			System.out.println(Lists.man.size());
		
		Birth.birthWoman("Mila", "Ponova", 12, 167, 55.1);
		Birth.birthWoman("Vika", "Ivanova", 19, 168, 52.1);
		Birth.birthWoman("lila", "Vernut", 21, 188, 56.7);
		Birth.birthWoman("Cona", "Dimau", 31, 188, 56.7);
	/*	
		for(Woman element : Lists.woman)
			System.out.println(element.getFirstName() + " "+ element.getLastName());	
		    System.out.println(Lists.woman.size());
	*/	    
		    
		//System.out.println(Lists.woman.getAge());
		//Lists.woman.setAge(Lists.woman.getAge() + 1);
		//System.out.println(Lists.woman.getAge());
		
//	(() Lists.man).getPassport(new Passport());
			//System.out.println(Lists.man.getFirstName() + " " + Lists.man.getLastName() + " " +
		//" get the passport " + Lists.man.getNumberOfPassport());
		 
//		Family family = new Family();
		
		//if(family.registrationOfFamily(Lists.woman, Lists.man)) System.out.println("They are Married");
		//else System.out.println("They are not Married");

		
		//		woman.WhoAreYou();
//		man.WhoAreYou();
	}

}
