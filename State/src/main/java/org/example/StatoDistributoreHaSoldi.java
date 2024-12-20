package org.example;

import org.example.cia.Distributore;
import org.example.cia.StatoDistributore;

public class StatoDistributoreHaSoldi extends StatoDistributore {


    int soldi;

    public StatoDistributoreHaSoldi(Distributore distributore) {
        super(distributore);
    }

    @Override
    public void erogaProdotto(Prodotto prodotto) {
        if(prodotto.prezzo()>soldi || prodotto.inStock()<1)
            System.out.println("soldi insufficienti o prodotto non in stock");
        else{
            soldi-=prodotto.prezzo();
            System.out.println("Prodotto erogato: "+ prodotto.nome() + " prezzo: " + prodotto.prezzo() + "\n Soldi attuali: "+ soldi);
        }
    }

    @Override
    public void inserisciSoldi(int val) {
        soldi += val;
        System.out.println("Soldi: " + soldi);
    }
}
