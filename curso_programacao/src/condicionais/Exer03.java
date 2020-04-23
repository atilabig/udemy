package condicionais;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B;
		System.out.println("Entre com os números: ");
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são Multiplus");
		}
		
		
		
		sc.close();
	}

}
