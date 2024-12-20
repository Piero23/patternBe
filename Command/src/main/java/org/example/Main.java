package org.example;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new CommandSpegniLuce(new Luce(false)));

        remoteControl.playCommand();

        remoteControl.setCommand(new CommandSetTermostato(6));
        remoteControl.playCommand();
    }
}