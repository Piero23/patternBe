package org.example;

import org.example.NonTerminali.Addizione;
import org.example.NonTerminali.Stampami;
import org.example.Terminali.Costante;
import org.example.Terminali.Variabili;

public class BuilderEspressione {

    private Contesto contesto;
    private String[] lines;

    public BuilderEspressione(String input) {
        contesto = new Contesto();
        lines = input.split("\n");
    }





    //Director
    public void build(){
        for(String line : lines){
            parse(line).interpreta(contesto);
        }
    }


    private Espressione parse(String input){

        if(input.equals("")){
            return new Variabili(-9999,"fhewaduyifgbdsafbflbfhsbgoqus_12913");
        }

        if(input.contains("hola")){
            String[] line = input.split("=");
            return new Variabili(parse(line[1].replaceAll("\\s+", "")).interpreta(contesto),line[0].replace("hola", "").replaceAll("\\s+", ""));
        }else
            if (input.contains("+")) {
                String[] line = input.split("\\+");
                return new Addizione(parse(line[0].replaceAll("\\s+", "")),parse(line[1].replaceAll("\\s+", "")));
            }
            else if(input.contains("stampami")){
                return new Stampami(parse(input.replace("stampami","").replaceAll("\\s+", "")).interpreta(contesto));
            }
            else {
                try {
                    return new Variabili(contesto.getVariabile(input),input.replaceAll("\\s+", ""));
                } catch (Exception e) {
                    return new Costante(Integer.parseInt(input.replaceAll("\\s+", "")));
                }
            }

    }


}
