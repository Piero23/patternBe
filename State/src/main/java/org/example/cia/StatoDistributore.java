package org.example.cia;

import org.example.Prodotto;

public abstract class StatoDistributore {
    protected Distributore distributore;

    public StatoDistributore(Distributore distributore) {
        this.distributore = distributore;
    }


    public abstract void erogaProdotto(Prodotto prodotto);

    public abstract void inserisciSoldi(int val);
}
