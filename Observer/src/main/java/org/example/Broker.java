package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Broker implements Subject{
    List<Integer> valoriMercato = new ArrayList<Integer>();

    @Override
    public void update(List<Integer> valoriMercato) {
        this.valoriMercato = valoriMercato;
        this.investi();
    }



    private void investi() {
        System.out.println("Ahhh si rompo il mercato (non so che faccia un broker) su questo mercato il cui primo prodotto è: "+valoriMercato.getLast());
    }
}
