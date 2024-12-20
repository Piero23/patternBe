package org.example.Terminali;

import org.example.Contesto;
import org.example.Espressione;

public class Variabili implements Espressione {

    private int valore;
    private String nome;

    public Variabili(int valore,String nome) {
        this.valore = valore;
        this.nome = nome;
    }

    @Override
    public int interpreta(Contesto contesto) {
        contesto.addVariabile(nome,valore);
        return valore;
    }


}
