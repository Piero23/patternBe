package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Investitori implements Subject {
    List<Integer> valoriMercato = new ArrayList<Integer>();

    @Override
    public void update(List<Integer> valoriMercato) {
        this.valoriMercato = valoriMercato;
        this.investi();
    }

    private void investi() {
        System.out.println("Ahhh si investo su questo mercato il cui ultimo prodotto è: "+valoriMercato.getLast());
    }
}
