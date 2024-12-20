package org.example;

import org.example.Mediator.Chatroom;
import org.example.Mediator.TorreDiControllo;
import org.example.component.Aereo;
import org.example.component.Elicottero;
import org.example.component.Jet;
import org.example.component.User;

public class Main {
    public static void main(String[] args) {

        //Esempio 1: ChatRoom con più utenti , Una sola classe component
//        Chatroom chatroom = new Chatroom();
//
//        User user1 = new User("Maria",chatroom);
//        User user2 = new User("Bob",chatroom);
//        User user3 = new User("Alice",chatroom);
//
//
//        user1.sendMessage("Hey Ciao a tutti");

        //Esempio 2: Torre Di controllo con più tipi di Veivolo che richiedono atterraggio;

        TorreDiControllo torreDiControllo = new TorreDiControllo();

        Elicottero elicottero = new Elicottero(torreDiControllo);
        Aereo aereo = new Aereo(torreDiControllo);
        Jet jet = new Jet(torreDiControllo);

        elicottero.richiediAtterraggio(1);
        aereo.richiediAtterraggio(1);
        jet.richiediAtterraggio(2);
    }
}