package Introducao;

import Auxiliares_introducao.Idade;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
exressa em anos, meses e dias.*/

public class Exercicio2 {

	public static void main(String args[]) {
		Idade ex2 = new Idade();
		ex2.pegaDias();
		ex2.calcularIdade();
		ex2.exibirIdade();
	}
}

