package org.example;

public class Main {
    public static void main(String[] args) {
        BuilderEspressione builderEspressione = new BuilderEspressione("""
                hola a = 3
                hola b = 2
                hola d = a
                hola b = 4
                
                hola c = d+b
                stampami c
                """);

        builderEspressione.build();
    }
}