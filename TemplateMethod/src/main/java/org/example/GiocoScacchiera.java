package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class GiocoScacchiera {

    public void gioca(){

        int giocatoreVincente = -1;
        int numeroTurni = 1;

        List<List<String>> scacchiera = new ArrayList<>();

        scacchiera = this.doInitScacchiera();

        while (giocatoreVincente == -1){

            System.out.println("Turno: " + numeroTurni);


            this.doStampaScachiera(scacchiera);
            scacchiera = this.doFaiGiocare();

            giocatoreVincente = this.doControlloVittoria(scacchiera);

            this.hookFineTurno();

            giocatoreVincente = 1;
        }

    }

    protected void hookFineTurno() {
    }

    protected abstract void doStampaScachiera(List<List<String>> scacchiera);

    protected abstract List<List<String>> doInitScacchiera();

    protected abstract List<List<String>> doFaiGiocare();

    protected abstract int doControlloVittoria(List<List<String>> scacchiera);


}
