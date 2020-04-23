package condicionais;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		int entrada = sc.nextInt();
		
		if (entrada < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
			
		
		sc.close();
	}

}
