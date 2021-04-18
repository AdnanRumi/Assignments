package lab_2;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		/* Write a program that will ask the user to enter the amount of a purchase. 
		 * The program should then compute the state and county tax sales tax. 
		 * Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		 * The program should display: 
		 * the amount of the purchase , the state sales tax, the county sales tax, 
		 * the total sales tax, and the total of the sale 
		 * (which is the sum of the amount of purchase plus the total sales tax) */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the amount for your purchase: ");
		
		double a = sc.nextDouble();
		
		double totalSale, totalSalesTax, stateTax, countyTax;
		
		stateTax = a * 0.04;
		 
		countyTax = a * 0.02;
		
		totalSalesTax = stateTax + countyTax;
		
		totalSale = a + totalSalesTax;
		
		System.out.println("The amount of purchase: " + a + ";\nState sales tax: " + stateTax + ";\nCounty sales tax: " + countyTax + ";\nTotal sales tax: " + totalSalesTax + ";\nTotal sale: " + totalSale);

	}

}
