package org.example;

public class Main {
    public static void main(String[] args) {
        BuilderVerification verification = new BuilderVerification();
        //Ciao,bella,true,administrator
        Utente utente = new Utente("Ciao","bella",true,"administrator");

        verification.verify(utente);
    }
}