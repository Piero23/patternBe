package org.example.component;

import org.example.Mediator.TorreDiControllo;

import java.awt.*;

public class Jet extends Veivolo {

    public Jet(TorreDiControllo torreDiControllo) {
        super(torreDiControllo);
    }

    @Override
    public void atterra(String nomePista) {
        System.out.println("Jet atterrato a " + nomePista);
    }
}
