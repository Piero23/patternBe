package org.example;

import java.util.ArrayList;
import java.util.List;

public class GiocoDama extends GiocoScacchiera{


    private int pedineG1;
    private int pedineG2;
    final private int BOARD_SIZE = 8;

    private List<List<String>> scacchieraNow = new ArrayList<List<String>>();

    @Override
    protected void doStampaScachiera(List<List<String>> scacchiera) {

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(scacchiera.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    @Override
    protected List<List<String>> doInitScacchiera() {

        for (int i = 0; i < BOARD_SIZE; i++) {
            List<String> line = new ArrayList<>();
            for (int j = 0; j < BOARD_SIZE; j++) {
                if(i<3){
                    if(j%2==0)
                        line.add("@");
                    else
                        line.add(" ");
                } else if (i ==3 || i == 4) {
                    line.add(" ");
                } else if (j%2 != 0) {
                    line.add("#");
                }else {line.add(" ");}


            }
            scacchieraNow.add(line);
        }

        return scacchieraNow;
    }

    @Override
    protected List<List<String>> doFaiGiocare() {
        return scacchieraNow;
    }

    @Override
    protected int doControlloVittoria(List<List<String>> scacchiera) {
        if(pedineG1 <1)
            return 2;
        else if(pedineG2 <1)
            return 1;

        return -1;
    }


}
