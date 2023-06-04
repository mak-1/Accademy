package eserciziCasa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//3.Implementa una Function che prende in input una lista di stringhe e restituisce una nuova lista contenente solo le stringhe che iniziano con la lettera "A".
public class EsercizioStringheLetteraA {
    public static void main(String[] args) {
        EsercizioStringheLetteraA es = new EsercizioStringheLetteraA();
        es.restituisceListaConA( Arrays.asList("Alunno", "Albino", "Alluminio", "Diego", "Mario", "Claudio", "Attila"));
    }
    public List<String> restituisceListaConA(List<String> listaNomi) {

        Consumer<List<String>> consumer = (parole) -> {
            for(String parola: parole){
                System.out.println(parola);
            }
        };


        Function<String, List<String>> function = (stringhe) -> {

            List<String> listaModificata = new ArrayList<>();
            if (stringhe.startsWith("A")) {
                listaModificata.add(stringhe);
            }
            return listaModificata;
        };



        listaNomi.stream().map(function).forEach(consumer);
    return listaNomi;}

}

