/*
Luiz Felipe Porto Lara de Oliveira
20103391-7
Turma 137
 */

public class BagagemNormal extends Bagagem {

    BagagemNormal (double peso, String descr, Prioridade pri){
        super(peso, descr, pri);
    }

    //calculo do preco para bagagens normais, incluindo uma possivel taxa.

    @Override
    public Double getCusto(){
        double custo = 0;

        if(getPeso() > 20){
            double pesoTaxado = getPeso() - 20;
            if(getPrioridade() == Prioridade.PRIORITARIA){
                custo = pesoTaxado * (5 * getTaxaBagagem());
            } else {
                if (getPrioridade() == Prioridade.URGENTE){
                    custo = pesoTaxado * (10 * getTaxaBagagem());
                } else {
                    custo = 0;
                }
            }
        }
        return custo;

    }


    @Override
    public String toString(){
        return super.toString() + "\n" + "Tipo: Normal";
    }
}

