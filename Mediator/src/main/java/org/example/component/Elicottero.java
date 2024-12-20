package org.example.component;

import org.example.Mediator.TorreDiControllo;

public class Elicottero extends Veivolo {


    public Elicottero(TorreDiControllo torreDiControllo) {
        super(torreDiControllo);
    }


    @Override
    public void atterra(String nomePista) {
        System.out.println("Elicottero atterato a "+nomePista);
    }
}
