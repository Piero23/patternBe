package org.example;

public class CommandSetTermostato implements Command {

    int temp;

    public CommandSetTermostato(int temp) {
        this.temp = temp;
    }

    @Override
    public void execute() {
        System.out.println("temperatura termostato: " + temp);
    }
}
