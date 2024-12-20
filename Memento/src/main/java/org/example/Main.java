package org.example;

import org.example.mementoProva.CarrelloDellaSpesa;

public class Main {
    public static void main(String[] args) {
        CarrelloDellaSpesa spesa = new CarrelloDellaSpesa();
        CareTakerCarrello careTakerCarrello = new CareTakerCarrello(spesa);


        //prodotti
        Prodotto cesoie = new Prodotto("cesoie",10);
        Prodotto manette = new Prodotto("manette",10);
        Prodotto bottiglia = new Prodotto("bottiglia",10);
        Prodotto mouse = new Prodotto("mouse",10);


        spesa.addSpesa(cesoie);
        spesa.addSpesa(manette);

        //salva
        careTakerCarrello.save();
        spesa.addSpesa(bottiglia);
        spesa.addSpesa(mouse);

        //mostra prima della ripristina
        spesa.showProdotti();

        //Ripristina
        careTakerCarrello.undo();

        spesa.showProdotti();



    }
}