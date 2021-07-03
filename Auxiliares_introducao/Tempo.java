package Auxiliares_introducao;

import java.util.Scanner;

public class Tempo {
int segundosTotais, horas, minutos, segundos;
	Scanner sc = new Scanner(System.in);
	
	public void pegarSegundos() {
		System.out.println("Digite os segundos totais: ");
		segundosTotais = sc.nextInt();
	}
	
	public void calculoSegundos() {
		horas = segundosTotais/3600;
		minutos = segundosTotais%3600/60;
		segundos = segundosTotais%3600%60;
	}
	
	public void mostrarSegundos() {
		System.out.println("A quantidade de horas é:" + horas+ "\nMinutos:"+
							minutos+"\nSegundos:"+segundos);
	}
}
