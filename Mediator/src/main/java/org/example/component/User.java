package org.example.component;

import org.example.Mediator.Chatroom;

public class User {
    private String name;

    private Chatroom chatroom;


    public User (String name, Chatroom chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        chatroom.addUser(this);
    }


    public void reciveMessagee(String message) {
        System.out.println("Utente "+name+" Ha ricevuto il messaggio: "+ message);

    }

    public void sendMessage(String message){
        chatroom.notifica(this,message);
    }
}
