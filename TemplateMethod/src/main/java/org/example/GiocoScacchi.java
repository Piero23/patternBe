package org.example;

import java.util.List;

public class GiocoScacchi extends GiocoScacchiera{
    @Override
    protected void doStampaScachiera(List<List<String>> scacchiera) {

    }

    @Override
    protected List<List<String>> doInitScacchiera() {

        return List.of();
    }

    @Override
    protected List<List<String>> doFaiGiocare() {


        return List.of();
    }

    @Override
    protected int doControlloVittoria(List<List<String>> scacchiera) {

        return 0;
    }
}
