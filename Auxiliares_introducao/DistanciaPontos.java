package Auxiliares_introducao;

import java.util.Scanner;

public class DistanciaPontos {
	public double a,b,c,r,s;
	public double t ;		

	public void pegarVariavel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para A");
		a = sc.nextDouble();
		
		System.out.println("Digite um valor para B");
		b = sc.nextDouble();
		
		System.out.println("Digite um valor para C");
		c = sc.nextDouble();
		sc.close();
	}
	
	public void calcularVariavel(){
		r = Math.pow((a+b),2);
		s = Math.pow((c+b),2);
		t= (s + r) /2 ;
	}
	
	public void mostrarTela() {
		System.out.println("O resultado dos calculos é igual a: "+t);
	}
	
}
