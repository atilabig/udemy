package entities;

public class Notas {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public double missingPoints() {
		if(finalGrade() >= 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}

}