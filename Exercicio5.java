package Introducao;
import Auxiliares_introducao.aluno;

/*. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.\*
 */
public class Exercicio5 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		aluno p1 = new aluno();
		aluno p2 = new aluno();
		aluno p3 = new aluno();
		
		p1.digiteNota();
		p2.digiteNota();
		p3.digiteNota();
		double mediaTotal = (p1.nota*2+p2.nota*3+p3.nota*5)/10;
		System.out.println("A media ponderada foi igual a:"+mediaTotal);
	}

}
