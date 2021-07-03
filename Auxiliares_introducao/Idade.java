package Auxiliares_introducao;

import java.util.Scanner;

public class Idade {
	public int anos =0,meses = 0,dias = 0,diasPego = 0 ,resultadoIdadeemDias = 0;
	Scanner entrada = new Scanner (System.in);
	
	public void pegaAnos() {
		System.out.println("Digite sua idade em anos");
		anos = entrada.nextInt();
	}
	
	public void pegaMeses() {
		System.out.println("Digite a sua idade em meses");
		meses = entrada.nextInt();
	}
	
	public void pegaDias() {
		System.out.println("Digite a sua idade em dias");
		diasPego = entrada.nextInt();
	}
	
    public void calcularIdadeemDias() {
        resultadoIdadeemDias = (anos*365) + (meses*30) + (diasPego);
    }
    public void calcularIdade() {
   		 anos = diasPego/365;
   		 meses = (diasPego%365)/30;
   		 dias = diasPego%365%30;
    }
    
    public  void  exibirIdadeemDias() {
        System.out.println("Sua idade em Dias é: " + resultadoIdadeemDias);
    }
    public void  exibirIdade() {
    	System.out.println("Sua idade em anos é "+anos+"anos, "+meses+" meses"
    						+" e "+dias+" dias");
    }
}
