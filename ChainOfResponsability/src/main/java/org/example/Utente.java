package org.example;

public class Utente {
    private String username;
    private String passowrd;
    private boolean opt;
    private String role;

    Utente(String username, String passowrd, boolean opt, String role) {
        this.username = username;
        this.passowrd = passowrd;
        this.opt = opt;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public boolean isOpt() {
        return opt;
    }

    public String getRole() {
        return role;
    }


}
