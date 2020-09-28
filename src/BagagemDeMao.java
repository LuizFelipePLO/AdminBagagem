/*
Luiz Felipe Porto Lara de Oliveira
20103391-7
Turma 137
 */

public class BagagemDeMao extends Bagagem {

    BagagemDeMao (double peso, String descr, Prioridade pri){
        super(peso,descr,pri);
    }

    public Double getCusto() {

        double custo = 0;
        double pesoTaxado = getPeso() - 5;

        if(getPeso() > 5){
            custo = pesoTaxado * (3 * getTaxaBagagem());
        }
        return custo;
    }


    @Override
    public String toString() {

        return super.toString() + "\n" + "Tipo: Bagagem de mão";
    }

}
