package org.example;

import org.example.cia.Distributore;

public class Main {
    public static void main(String[] args) {
        Distributore distributore =new Distributore();

        distributore.erogaProdotto(1,4);

        distributore.inserisciSoldi(3);

        distributore.erogaProdotto(1,4);
    }
}