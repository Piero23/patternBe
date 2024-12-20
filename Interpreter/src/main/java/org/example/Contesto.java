package org.example;

import java.util.HashMap;

public class Contesto {

    HashMap<String, Integer> valori;




    public Contesto() {
        valori = new HashMap<>();
    }

    public void addVariabile(String nome, int val){
        valori.put(nome,val);
    }

    public int getVariabile(String nome){
        if(!valori.containsKey(nome)){
            throw new RuntimeException("Variabile inesistente");
        }
        return valori.get(nome);
    }

}
