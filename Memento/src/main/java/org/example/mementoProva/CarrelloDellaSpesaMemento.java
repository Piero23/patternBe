package org.example.mementoProva;

import org.example.Prodotto;

import java.util.List;

public class CarrelloDellaSpesaMemento {

    private final CarrelloDellaSpesa carrelloDellaSpesa;
    final List<Prodotto> statoSalvato;

    public CarrelloDellaSpesaMemento(CarrelloDellaSpesa carrelloDellaSpesa, List<Prodotto> statoSalvato) {
        this.carrelloDellaSpesa = carrelloDellaSpesa;
        this.statoSalvato = statoSalvato;
    }


    //So che dovrebbe essere passata la classe corrente ma non capisco quale delle 2 classi può avere un setter e quale no
    public void restore() {
        carrelloDellaSpesa.setMemento(this);
    }

}
