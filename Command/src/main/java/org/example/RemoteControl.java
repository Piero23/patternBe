package org.example;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void playCommand(){
        if (command != null) {
            command.execute();
        }else
            System.out.println("Command is null!");
    }
}
