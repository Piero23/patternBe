package org.example;

import org.example.mementoProva.CarrelloDellaSpesa;
import org.example.mementoProva.CarrelloDellaSpesaMemento;

import java.util.Stack;

public class CareTakerCarrello {
    CarrelloDellaSpesa carrello;
    Stack<CarrelloDellaSpesaMemento> carrelloMemento = new Stack<>();

    public CareTakerCarrello(CarrelloDellaSpesa carrello) {
        this.carrello = carrello;
    }

    public void save() {
        carrelloMemento.push(carrello.createMemento());
    }

    public void undo(){
        carrelloMemento.pop().restore();
    }
}
