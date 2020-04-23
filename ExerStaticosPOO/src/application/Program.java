package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double bought = sc.nextDouble();
		
		double iof = 0.06 * bought;
		double reais = bought * price + iof;
		
		System.out.printf("Amount to be paid in reais = %.2f%n", reais);
				
		
		sc.close();
	}

}
