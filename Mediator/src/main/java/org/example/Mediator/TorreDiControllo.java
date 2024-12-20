package org.example.Mediator;

import org.example.component.Veivolo;

import java.util.ArrayList;
import java.util.List;

public class TorreDiControllo {

    public enum PISTE {

    }


    private List<Veivolo> pista1 = new ArrayList<>();
    private List<Veivolo> pista2 = new ArrayList<>();

    public enum PISTA {

        Pista1("Pista Agrigento"),
        Pista2("Pista Berlusca");

        private final String saluto;

        // Costruttore per associare il valore
        PISTA(String saluto) {
            this.saluto = saluto;
        }

        // Metodo per ottenere il valore associato
        public String getSaluto() {
            return saluto;
        }

        // Metodo statico per ottenere il saluto da un numero
        public static String getSalutoByNumber(int number) {
            PISTA[] piste = PISTA.values();
            if (number >= 1 && number <= piste.length) {
                return piste[number - 1].getSaluto();
            } else {
                throw new IllegalArgumentException("Numero non valido. Deve essere compreso tra 1 e " + piste.length);
            }
        }
    }

    public void notifica(Veivolo veivolo , String messaggio, int pista) throws InterruptedException {
        if(pista==1)
            aggiungiAPista(veivolo,pista1,pista);
        else
            aggiungiAPista(veivolo,pista2,pista);
    }



    private void aggiungiAPista(Veivolo veivolo,List<Veivolo> list,int pista) throws InterruptedException {
        if(list.size()>=2)
            throw new InterruptedException("Errore");
        list.add(veivolo);

        veivolo.atterra(PISTA.getSalutoByNumber(pista));
    }


}
