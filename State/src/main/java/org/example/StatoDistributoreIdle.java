package org.example;

import org.example.cia.Distributore;
import org.example.cia.StatoDistributore;

public class StatoDistributoreIdle extends StatoDistributore {

    public StatoDistributoreIdle(Distributore distributore) {
        super(distributore);
    }

    @Override
    public void erogaProdotto(Prodotto prodotto) {
        System.out.println("soldi mancanti");
    }

    @Override
    public void inserisciSoldi(int val) {
        StatoDistributoreHaSoldi soldi = new  StatoDistributoreHaSoldi(distributore);
        soldi.inserisciSoldi(val);

        distributore.cambiaStato(soldi);
    }
}
