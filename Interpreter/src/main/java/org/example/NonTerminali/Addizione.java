package org.example.NonTerminali;

import org.example.Contesto;
import org.example.Espressione;

public class Addizione implements Espressione {

    Espressione espressione1;
    Espressione espressione2;


    public Addizione(Espressione espressione1, Espressione espressione2) {
        this.espressione1 = espressione1;
        this.espressione2 = espressione2;
    }

    @Override
    public int interpreta(Contesto contesto) {
        return espressione1.interpreta(contesto) + espressione2.interpreta(contesto);
    }
}
