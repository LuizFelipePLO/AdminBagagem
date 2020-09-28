/*
Luiz Felipe Porto Lara de Oliveira
20103391-7
Turma 137
 */

public class BagagemFragil extends Bagagem {

    private double ValorSeguro;

    BagagemFragil(double peso, String descr, Prioridade pri){
        super(peso, descr, pri);
    }


    public double getValorSeguro(){
        return ValorSeguro;
    }

    public void setValorSeguro(double valor){
        valor = ValorSeguro;
    }

    @Override
    public Double getCusto(){

        double custo = getValorSeguro();

        if(getPrioridade() == Prioridade.PRIORITARIA){
            custo = 5 * getTaxaBagagem();
        } else {
            if (getPrioridade() == Prioridade.URGENTE) {
                custo = 10 * getTaxaBagagem();
            }else{
                custo = 0;
            }
        }
        return custo;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + "Tipo: Frágil";
    }
}
