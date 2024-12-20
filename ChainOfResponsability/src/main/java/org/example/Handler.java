package org.example;

public abstract class Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Utente utente) {
        try {
            this.processRequest(utente);
            if (nextHandler != null) {
                nextHandler.handleRequest(utente);
            }
        }catch (InterruptedException e){System.out.println("Errore: "+e.getMessage());}
    }

    public abstract void processRequest(Utente utente) throws InterruptedException;

}
