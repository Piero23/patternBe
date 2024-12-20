package org.example;

public class Main {
    public static void main(String[] args) {
        MercatoAzionario mercatoAzionario = new MercatoAzionario();

        Investitori investitori = new Investitori();
        Broker broker = new Broker();

        //aggiungo valori alla lista prima di sottoscrivere i subject
        mercatoAzionario.addMercato(1);
        mercatoAzionario.addMercato(3);
        mercatoAzionario.addMercato(4);
        mercatoAzionario.addMercato(6);
        mercatoAzionario.addMercato(3);

        //Sottoscrizione
        mercatoAzionario.subcribe(investitori);
        mercatoAzionario.subcribe(broker);

        //Aggiunta di valori alla lista dopo la sottoscrizione
        mercatoAzionario.addMercato(3);
        mercatoAzionario.addMercato(4);
        mercatoAzionario.addMercato(6);

    }
}