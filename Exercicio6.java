package Introducao;
import Auxiliares_introducao.Pontos;
/* Construa um programa em c que, tendo como dados de entrada 
 * dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
 * escreva a distância entre eles. A fórmula 
 */
public class Exercicio6 {
	public static void main(String[]args) {
		
		Pontos p1 = new Pontos();
		Pontos p2 = new Pontos();
		p1.pegarPontos();
		p2.pegarPontos();
		double xTotal = Math.pow((p1.x + p2.x),2) ;
		double yTotal = Math.pow((p1.y + p2.y),2);
		double total = Math.sqrt(xTotal + yTotal);
		System.out.println("O total é igual a:"+total);
	}

}
