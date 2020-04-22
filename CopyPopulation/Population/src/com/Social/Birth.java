package com.Social;

import java.util.Random;

import com.Person.Man;
//import com.Person.Person;
import com.Person.Woman;
import com.Technical.*;

public class Birth {
	private static Random rand = new Random();
	
	public static void birth(Man man, Woman woman) {
		birthMan("Ivan", "Pupkin", 18, 188, 85.4);
		birthWoman("Marusya", "Klimova", 16, 165, 59.7);
	}

	public static void birthMan(String firstName, String lastName, int age, 
								int hight, double weight) {
		Man man = new Man(firstName, lastName, age, hight, weight);
		Lists.man.add(man);
		createNeuroNet(man, null);
		defineMan(man);
	}
	

	public static void birthWoman(String firstName, String lastName, int age, 
			int hight, double weight) {
		Woman woman = new Woman(firstName, lastName, age, hight, weight);
		Lists.woman.add(woman);
		createNeuroNet(null,woman);

	}
	
	private static void createNeuroNet(Man man, Woman woman) {

		int max[] = {0, 0};

	//	Random r = new Random();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				int random = rand.nextInt(50);

				man.setNeuro(random, i, j);
				max[i] = max[i] + random;
			}

		}

		for (int i = 0; i < 2; i++) {

			// constant 5 needs out of to settings
			double maxR = (double)(50 * 5) / (50 * 5 - max[i]); // maximum  value coefficient, proverit delenie na 0 
// test			System.out.println("maxR "+maxR);
				for (int j = 0; j < 5; j++) {

						double kWieght = TechFunction.random(maxR);
	// test					System.out.println("kWieght "+ kWieght);
						man.setNeuroWeight(kWieght, i, j);

				}
				
				
/* test block 				
				for (int j = 0; j < 5; j++) {
						
						System.out.println("b from massive "+ man.getNeuroWeight(0, j));					
				}
*/				
				
		}					
	}
	public static void defineMan(Man man) {
		man.propertyOfPerson.put("beauty", rand.nextInt(50));
		man.propertyOfPerson.put("education", rand.nextInt(50));
		man.propertyOfPerson.put("sexuality", rand.nextInt(50));
		man.propertyOfPerson.put("untidiness", rand.nextInt(50));
		man.propertyOfPerson.put("laziness", rand.nextInt(50));
		
	// test 	System.out.println(x);
	}
}
			
			

			
				
		
		
		
	
	


