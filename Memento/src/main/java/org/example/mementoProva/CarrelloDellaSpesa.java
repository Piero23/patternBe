package org.example.mementoProva;

import org.example.Prodotto;

import java.util.ArrayList;
import java.util.List;

public class CarrelloDellaSpesa {

    private List<Prodotto> listaSpesa;


    public CarrelloDellaSpesa() {
        listaSpesa = new ArrayList<>();
    }

    public void addSpesa(Prodotto p) {
        listaSpesa.add(p);
    }

    public void removeSpesa(Prodotto p) {
        listaSpesa.remove(p);
    }

    public CarrelloDellaSpesaMemento createMemento(){
        return new CarrelloDellaSpesaMemento(this,new ArrayList<>(listaSpesa));
    }

    public void setMemento(CarrelloDellaSpesaMemento memento) {
        listaSpesa = memento.statoSalvato.stream().toList();
    }

    public void showProdotti(){
        for (Prodotto p : listaSpesa) {
            System.out.print(p.nome()+" ");
        }
        System.out.println();
    }

}
