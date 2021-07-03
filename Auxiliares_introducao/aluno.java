package Auxiliares_introducao;

import java.util.Scanner;

public class aluno {
	public double nota;
	static int cont=1;
	
	public void digiteNota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota do aluno #"+cont);
		nota = sc.nextDouble();
		cont++;
	}

}

