package Auxiliares_introducao;

import java.util.Scanner;

public class algebra {
	int a,b,c,d,e,f,x,y;
	public void digiteValor() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para a");
		a = sc.nextInt();
		System.out.println("Digite um valor para b");
		b = sc.nextInt();
		System.out.println("Digite um valor para c");
		c = sc.nextInt();
		System.out.println("Digite um valor para d");
		d =sc.nextInt();
		System.out.println("Digite um valor para e");
		e =sc.nextInt();
		System.out.println("Digite um valor para f");
		f =sc.nextInt();
	}
	public void calculo() {
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
	}
	public void mostrarValor() {
		System.out.println("O valor de x é igual a:"+x);
		System.out.println("O valor de y é igual a :"+y);
	}
	
}
