package testProject;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	
	public static double CalculateMortgagePayment(int P, double r, int n) {
		double a = Math.pow ((1+r), n);
		double mortgage = P * ((r*a)/(a -1));
		return mortgage;
	}

	public static void main(String[] args) {
		
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal: ");
		int p = scanner.nextInt();
		
		System.out.print("Annual interest rate: ");
		double annualRate = scanner.nextDouble();
		
		System.out.print("Period (Years): ");
		int period = scanner.nextInt();
		
		double r = annualRate/(PERCENT * MONTHS_IN_YEAR);
		int n = period * 12;
		
		double MortgagePayment = CalculateMortgagePayment(p,r,n);
		String MortgageFormatted = NumberFormat.getCurrencyInstance().format(MortgagePayment);
		System.out.println("Mortgage: "+ MortgageFormatted);
 
	}

}
