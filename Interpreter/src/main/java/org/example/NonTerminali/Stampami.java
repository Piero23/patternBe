package org.example.NonTerminali;

import org.example.Contesto;
import org.example.Espressione;

public class Stampami implements Espressione {

    private int value;

    public Stampami(int value) {
        this.value = value;
    }


    @Override
    public int interpreta(Contesto contesto) {
        System.out.println(value);
        return value;
    }
}
