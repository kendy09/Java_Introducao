package Introducao;
import Auxiliares_introducao.Idade;

public class Exercicio1 {

    int idadeAnos, idadeMeses, idadeDias, resultadoIdadeemDias;

    public static void main(String[] args) {


        Idade ex1 = new Idade();

         ex1.pegaAnos();
         ex1.pegaMeses();
         ex1.pegaDias();
         ex1.calcularIdadeemDias();
         ex1.exibirIdadeemDias();


    }
}
