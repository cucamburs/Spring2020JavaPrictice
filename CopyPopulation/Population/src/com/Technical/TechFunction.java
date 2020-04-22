package com.Technical;

import java.util.Random;

public class TechFunction {
 public static double random(double max) {
	 
	 Random random = new Random();

	 int i = random.nextInt((int)max + 1);

	 int a = (int) ((max - (int) max) * 1000);

	 a = random.nextInt(a);

	 double b = (double) a / 1000;

	 
	 return i+b;
 }
}
