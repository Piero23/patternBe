package org.example;

public class BuilderVerification {

    RoleVerifyHandler roleVerifyHandler;
    OptHandler optHandler;
    UsernamePasswordHandler usernamePasswordHandler;


    public BuilderVerification(){
        roleVerifyHandler = new RoleVerifyHandler();
        optHandler = new OptHandler();
        usernamePasswordHandler = new UsernamePasswordHandler();

        usernamePasswordHandler.setNextHandler(optHandler);
        optHandler.setNextHandler(roleVerifyHandler);
    }


    public void verify(Utente utente) {


        usernamePasswordHandler.handleRequest(utente);
    }
}
