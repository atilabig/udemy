package condicionais;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para descobrir se é PAR ou Ímpar: ");
		int entrada = sc.nextInt();
		
		if (entrada %2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}
		sc.close();
	}

}
