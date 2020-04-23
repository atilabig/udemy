package app;

import java.util.Scanner;

import entities.Inquilinos;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Inquilinos[] vetor = new Inquilinos[10];
		
		System.out.println("Quantos quartos serão alugados: ");
		int n = entrada.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			System.out.print("E-mail: ");
			String email = entrada.nextLine();
			System.out.print("Quarto: ");
			int quarto = entrada.nextInt();
			vetor[quarto] = new Inquilinos(nome, email);
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i=0; i<10; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ":" + vetor[i]);
			}
		}

		entrada.close();
	}

}
