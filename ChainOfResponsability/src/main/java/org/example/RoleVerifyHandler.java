package org.example;

public class RoleVerifyHandler extends Handler {
    @Override
    public void processRequest(Utente utente) throws InterruptedException {
        if(!utente.getRole().equals("administrator"))
            throw new InterruptedException("L'utente non ha i permessi");
        else
            System.out.println("Autenticazione avvenuta con successo");
    }
}
