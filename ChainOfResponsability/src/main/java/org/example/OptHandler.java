package org.example;

public class OptHandler extends Handler {
    @Override
    public void processRequest(Utente utente) throws InterruptedException {
        if(!utente.isOpt())
            throw new InterruptedException("L'utente non è verificato con OPT");
    }
}
