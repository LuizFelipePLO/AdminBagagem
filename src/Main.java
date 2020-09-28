/*
Luiz Felipe Porto Lara de Oliveira
20103391-7
Turma 137

Questão 1:

- Polimorfismo pode ser visto no método getCusto, presente na classe Bagagem e
 em suas herdeiras (BagagemNormal, BagagemFragil e BagagemDeMao), que executa um processo
 diferente, dependendo do tipo de bagagem.

- Não há sobrecarga, pois não existe nenhum critério que ordene que o método
 getCusto seja diferente em cada classe que aparece.

- O Melhor exemplo de sobrescrita é o método toString, que é implementado
na descrição das bagagens com adições específicas dependendo do tipo de bagagem.

 - A classe Bagagem deve ser Abstract, pois é usada de base para suas subclasses, facilitando o compartilhamento
 de código similar entre elas.

 - O método getCusto deve ser abstrato para estabelecer um alicerce
  para suas variações nas classes hereditárias da classe Bagagem.
 */











import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main (String args[]){

        ListaDeBagagens colec = new ListaDeBagagens();

        colec.incluir (new BagagemNormal(25, "Mala Luis Vitton", Prioridade.PRIORITARIA));
        colec.incluir(new BagagemDeMao(2, "Maleta vermelha", Prioridade.NORMAL));
        colec.incluir(new BagagemFragil(8, "Caixa retangular", Prioridade.URGENTE));
        colec.incluir(new BagagemDeMao(1, "Mochila preta", Prioridade.PRIORITARIA));
        colec.incluir(new BagagemNormal(40, "Caixote marrom", Prioridade.URGENTE));
        colec.incluir(new BagagemNormal(35, "Mala rosa", Prioridade.NORMAL));


        colec.getTotal();
        colec.numeroNormal();
        colec.numeroMao();
        colec.numeroFragil();
        colec.custoTotal();
        System.out.println("");
        colec.getComparadorPeso();
        System.out.println("");
        System.out.println("");
        colec.getComparadorCusto();
        System.out.println("");
        System.out.println("");




    }
}






