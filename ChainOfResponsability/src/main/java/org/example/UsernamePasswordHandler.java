package org.example;

public class UsernamePasswordHandler extends Handler {

    @Override
    public void processRequest(Utente utente) throws InterruptedException {
        if (!(utente.getUsername().equals("Ciao") && utente.getPassowrd().equals("bella")))
            throw new InterruptedException("Email e password non corretti");
        else {
        }
    }
}
