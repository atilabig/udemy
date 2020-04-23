package condicionais;

import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		int x = 5;
		int hora;
		
		System.out.println("Quantas horas? ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
//		if (x < 0) {
//		else { 
			//			System.out.println("Boa tarde");
		else if (hora < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
		
//		System.out.println("Boa noite");
		sc.close();
	}

}
