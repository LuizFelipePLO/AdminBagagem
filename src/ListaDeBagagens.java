/*
Luiz Felipe Porto Lara de Oliveira
20103391-7
Turma 137
 */

import java.util.ArrayList;
import java.util.Collections;

public class ListaDeBagagens{

    private ArrayList<Bagagem> malas;

    public ListaDeBagagens(){
        malas = new ArrayList<>();
    }

    public void incluir (Bagagem b){
        malas.add(b);
    }

    public int getTotal(){
        System.out.println("Número de malas: " + malas.size());
        return malas.size();
    }


    public double custoTotal(){
        double i = 0;
        for(Bagagem b:malas){
            i += b.getCusto();
        }
        System.out.println("Custo total: R$" + i);
        return i;
    }

    public void getComparadorPeso(){
        System.out.println("Listagem por peso: ");
        Collections.sort(malas, Bagagem.comparaPeso());
        for(Bagagem b : malas){
            System.out.println(b.toString());
        }
    }

    public void getComparadorCusto(){
        System.out.println("Listagem por custo: ");
        Collections.sort(malas, Bagagem.comparaCusto());
        for(Bagagem b : malas){
            System.out.println(b.toString());
        }
    }

    public int numeroFragil(){
        int nro = 0;
        for(Bagagem b : malas) {
            if(b instanceof BagagemFragil){
                nro++;
            }
        }
        System.out.println("Bagagens frágeis: " + nro);
        return nro;
    }

    public int numeroMao(){
        int nro = 0;
        for(Bagagem b : malas) {
            if(b instanceof BagagemDeMao){
                nro++;
            }
        }
        System.out.println("Bagagens de mão: " + nro);
        return nro;
    }

    public int numeroNormal(){
        int nro = 0;
        for(Bagagem b : malas) {
            if(b instanceof BagagemNormal){
                nro++;
            }
        }
        System.out.println("Bagagens normais: " + nro);
        return nro;
    }

}

