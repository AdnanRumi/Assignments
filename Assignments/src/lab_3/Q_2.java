package lab_3;

public class Q_2 {

	public static void main(String[] args) {
		/* Create a method that accepts two strings, a and b, 
		 * return the result of putting them together in the order abba, 
		 * e.g. "Hi" and "Bye" returns "HiByeByeHi".
		 * makeAbba("Hi", "Bye") → "HiByeByeHi"
		 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
		 * makeAbba("What", "Up") → "WhatUpUpWhat" */
		
		String a = "Building";
		
		String b = "Peace";
		
		System.out.println(a.concat(b).concat(b).concat(a));

	}

}
