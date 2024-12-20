package org.example;

import java.util.ArrayList;
import java.util.List;

public class MercatoAzionario{

    List<Subject> sottoscritti;
    List<Integer> valoriMercato;

    public MercatoAzionario(){
        sottoscritti = new ArrayList<>();
        valoriMercato = new ArrayList<>();
    }

    public void addMercato(int v){
        valoriMercato.add(v);
        this.notifySubs();
    }

    public void subcribe(Subject s){
        sottoscritti.add(s);
    }

    public void unsubcribe(Subject s){
        sottoscritti.remove(s);
    }

    public void notifySubs(){
        for(Subject s : sottoscritti){
            s.update(valoriMercato);
        }
    }
}
