package org.example.Terminali;

import org.example.Contesto;
import org.example.Espressione;

public class Costante implements Espressione {

    int val;

    public Costante(int val) {
        this.val = val;
    }

    @Override
    public int interpreta(Contesto contesto) {
        return val;
    }
}
