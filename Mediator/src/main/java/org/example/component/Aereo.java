package org.example.component;

import org.example.Mediator.TorreDiControllo;

public class Aereo extends Veivolo {


    public Aereo(TorreDiControllo torreDiControllo) {
        super(torreDiControllo);
    }


    @Override
    public void atterra(String nomePista) {
        System.out.println("Aereo atterrato a " + nomePista);
    }
}
