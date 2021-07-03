package Auxiliares_introducao;
import java.util.Scanner;

public class Fabrica {
	double valorCarro,total;
	
	public void pegarValor() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do carro");
		valorCarro = entrada.nextDouble();
		entrada.close();
	}
	
	public void calculo() {
		total = valorCarro+valorCarro*0.28+valorCarro*0.45;
	}
	
	public void mostraValor() {
		System.out.println("O valor total do carro é de :R$"+total);
	}
}
