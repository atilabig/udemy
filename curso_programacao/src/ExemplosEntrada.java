import java.util.Locale;
import java.util.Scanner;

public class ExemplosEntrada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		String x;
//		int x;
//		double x;
//		char x;
		
		String x;
		int y;
		double z;
		
//		x = sc.next();
//		x = sc.nextInt();
//		x = sc.nextDouble();
//		x = sc.next().charAt(0);
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
//		System.out.println("Voce digitou: " + x);
//		System.out.printf("Voce digitou: %.2f%n", x);
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		sc.close();
		
	}

}
