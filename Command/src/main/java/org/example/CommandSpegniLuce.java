package org.example;

public class CommandSpegniLuce implements Command {

    Luce luce;

    public CommandSpegniLuce(Luce luce) {
        this.luce = luce;
    }

    @Override
    public void execute() {
        System.out.println("luce spenta");
    }
}
