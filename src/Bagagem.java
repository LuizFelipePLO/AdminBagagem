/*
Luiz Felipe Porto Lara de Oliveira
20103391-7
Turma 137
 */

import java.util.Comparator;

public abstract class Bagagem {
    private Double peso;
    private String descricao;
    private Prioridade prioridade;
    private static double taxaBagagem = 2;


    public static Comparator<Bagagem> comparaPeso() {
        return new Comparator<Bagagem>() {
            @Override
            public int compare(Bagagem o1, Bagagem o2) {
                return (int) (o1.getPeso().compareTo(o2.getPeso()));
            }
        };
    }

    public static Comparator<Bagagem> comparaCusto(){
        return new Comparator<Bagagem>() {
            @Override
            public int compare(Bagagem o1, Bagagem o2) {
                return (int) o1.getCusto().compareTo(o2.getCusto());
            }
        };
    }


    public abstract Double getCusto();

    public Bagagem(double peso, String descric, Prioridade pri){
        this.peso = peso;
        this.descricao = descric;
        this.prioridade = pri;
    }

    public Double getPeso(){ return peso; }


    public String getDescricao(){ return descricao; }


    public Prioridade getPrioridade() { return prioridade; }


    public static void setTaxaBagagem(double valor){
        taxaBagagem = valor;
    }

    public static double getTaxaBagagem(){
        return taxaBagagem;
    }

    @Override
    public String toString(){

        return "Peso = " + getPeso() + "kg \n" +
                "Descricao = " + getDescricao() + "\n" +
                "Prioridade = " + getPrioridade();

    }

}
