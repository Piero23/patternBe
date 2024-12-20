package org.example.Mediator;

import org.example.component.User;

import java.util.ArrayList;
import java.util.List;

public class Chatroom {


    List<User> users = new ArrayList<>();

    public Chatroom(){}

    public void notifica(User u, String message){
        for (User user : users){
            if(user!=u)
                user.reciveMessagee(message);
        }
    }


    public void addUser(User u){
        users.add(u);
    }

    public void removeUser(User u){
        users.remove(u);
    }


}
