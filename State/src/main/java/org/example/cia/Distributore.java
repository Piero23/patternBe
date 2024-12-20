package org.example.cia;

import org.example.Prodotto;
import org.example.StatoDistributoreIdle;

import java.util.ArrayList;
import java.util.List;

public class Distributore {

    private final int COL = 5;
    private final int ROW = 8;

    private StatoDistributore statoAttuale;

    private List<List<Prodotto>> prodotti = new ArrayList<>(){
        {
            add(new ArrayList<>(){{
                add(new Prodotto("Shampoo",5,6));
                add(new Prodotto("Chiavi",1,1));
                add(new Prodotto("Profumo",2,5));
                add(new Prodotto("Mouse",8,7));
                add(new Prodotto("Detersivo",2,1));
            }});
            add(new ArrayList<>(){{
                add(new Prodotto("Shampoo",5,6));
                add(new Prodotto("Chiavi",1,1));
                add(new Prodotto("Profumo",2,5));
                add(new Prodotto("Mouse",8,7));
                add(new Prodotto("Detersivo",2,1));
            }});
            add(new ArrayList<>(){{
                add(new Prodotto("Shampoo",5,6));
                add(new Prodotto("Chiavi",1,1));
                add(new Prodotto("Profumo",2,5));
                add(new Prodotto("Mouse",8,7));
                add(new Prodotto("Detersivo",2,1));
            }});
            add(new ArrayList<>(){{
                add(new Prodotto("Shampoo",5,6));
                add(new Prodotto("Chiavi",1,1));
                add(new Prodotto("Profumo",2,5));
                add(new Prodotto("Mouse",8,7));
                add(new Prodotto("Detersivo",2,1));
            }});
            add(new ArrayList<>(){{
                add(new Prodotto("Shampoo",5,6));
                add(new Prodotto("Chiavi",1,1));
                add(new Prodotto("Profumo",2,5));
                add(new Prodotto("Mouse",8,7));
                add(new Prodotto("Detersivo",2,1));
            }});
            add(new ArrayList<>(){{
                add(new Prodotto("Shampoo",5,6));
                add(new Prodotto("Chiavi",1,1));
                add(new Prodotto("Profumo",2,5));
                add(new Prodotto("Mouse",8,7));
                add(new Prodotto("Detersivo",2,1));
            }});
            add(new ArrayList<>(){{
                add(new Prodotto("Shampoo",5,6));
                add(new Prodotto("Chiavi",1,1));
                add(new Prodotto("Profumo",2,5));
                add(new Prodotto("Mouse",8,7));
                add(new Prodotto("Detersivo",2,1));
            }});
            add(new ArrayList<>(){{
                add(new Prodotto("Shampoo",5,6));
                add(new Prodotto("Chiavi",1,1));
                add(new Prodotto("Profumo",2,5));
                add(new Prodotto("Mouse",8,7));
                add(new Prodotto("Detersivo",2,1));
            }});
        }
    };

    public Distributore(){
        statoAttuale = new StatoDistributoreIdle(this);
    }

    public void cambiaStato(StatoDistributore stato){
        statoAttuale = stato;
    }

    public void erogaProdotto(int row, int col){
        if(col > COL || row > ROW || row<1 || col<1)
            throw new IllegalArgumentException("Numero non valido");

        statoAttuale.erogaProdotto(prodotti.get(row).get(col));
    }

    public void inserisciSoldi(int val){
        if(val<=0)
            throw new IllegalArgumentException("Numero non valido");

        statoAttuale.inserisciSoldi(val);
    }
}
