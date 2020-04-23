package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Notas note = new Notas();

		note.nome = sc.nextLine();
		note.nota1 = sc.nextDouble();
		note.nota2 = sc.nextDouble();
		note.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", note.finalGrade());
		if (note.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", note.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
