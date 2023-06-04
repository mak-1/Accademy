package eserciziCasa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//1.Implementa un Consumer che prende in input una lista di stringhe e le modifica, sostituendo ogni stringa con la sua versione in maiuscolo.
public class EsercizioSostituisciStringhe1Maiuscolo {

    List<String> lista;
    public static void main(String[] args) {
        EsercizioSostituisciStringhe1Maiuscolo str = new EsercizioSostituisciStringhe1Maiuscolo();
        System.out.println(str.sostituisciPrimaStringaMaiuscolo("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam"));



    }

    public String sostituisciPrimaStringaMaiuscolo (String stringa){
        Consumer<List<String>> consumer= (lista) ->{
            for (int i = 0; i<lista.size();i++){

                String parolaDaModificare= lista.get(i);
               lista.remove(i);
            String s1 = parolaDaModificare.substring(0, 1).toUpperCase();  // recupero la prima lettera
            String s2 = parolaDaModificare.substring(1);     // recupero la parte rimanente  della stringa
            parolaDaModificare = parolaDaModificare.substring(0, 1).toUpperCase() + parolaDaModificare.substring(1); // sommo dopo la modifica le due stringhe
//            lista.add(i,parolaDaModificare);
        }};
           String[] parole= stringa.split(" ");
                lista= Arrays.stream(parole).toList();
//                lista.forEach(consumer);
                consumer.accept(lista);
               String stringaModificata="";
                for (String s: lista){
                    stringaModificata+=s+" ";
                }
                return stringaModificata;

    }
}
