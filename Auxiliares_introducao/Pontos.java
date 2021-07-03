package Auxiliares_introducao;

import java.util.Scanner;

public class Pontos {
	static int  cont = 1;
	public double x,y;

	
	public void pegarPontos() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ponto x"+cont);
		x = sc.nextDouble();
		System.out.println("Digite o ponto que voce y"+cont);
		y = sc.nextDouble();
		cont++;
		
	}

}
