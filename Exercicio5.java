package Introducao;
import Auxiliares_introducao.aluno;

/*. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.\*
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
