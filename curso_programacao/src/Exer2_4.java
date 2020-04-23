import java.util.Locale;
import java.util.Scanner;

public class Exer2_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFuncionario;
		double horasTrabalhadas, valorHora, salario;

		numFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		valorHora = sc.nextDouble();

		salario = valorHora * horasTrabalhadas;

		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f%n ", salario);

		sc.close();

	}

}
