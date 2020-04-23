import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 450;
		double x = 46.658452;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.println("RESULTADO = "+ x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
