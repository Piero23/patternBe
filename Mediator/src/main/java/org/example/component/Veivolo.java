package org.example.component;

import org.example.Mediator.TorreDiControllo;

public abstract class Veivolo{
    TorreDiControllo torreDiControllo;


    public Veivolo(TorreDiControllo torreDiControllo){
        this.torreDiControllo = torreDiControllo;
    }


    public void richiediAtterraggio(int pista){
        try {
            torreDiControllo.notifica(this,"Richeisto atterraggio", pista);
        } catch (InterruptedException e) {
            System.out.println("Aspetterò fino a quando non si libererà");
        }
    };

    public abstract void atterra(String nomePista);
}
