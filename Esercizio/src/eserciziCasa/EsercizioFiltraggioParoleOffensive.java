package eserciziCasa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//LOL
//        Esercizio: Filtraggio di parole offensive
//        Scrivi un programma Java che chiede all'utente di inserire una stringa e filtra le parole offensive.
//        Utilizza un'espressione regolare per individuare le parole offensive nel testo e sostituiscile con asterischi
//        Fai in modo che il programma stampi il testo filtrato.
public class EsercizioFiltraggioParoleOffensive {
    public static void main(String[] args) {
        EsercizioFiltraggioParoleOffensive paroleOffensive = new EsercizioFiltraggioParoleOffensive();
        paroleOffensive.verificaParoleOffensive();

    }

    public void verificaParoleOffensive(){
        String stringaUtente = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam";

        String regex = "\\b ipsum|dolor|elitr"; //chiedere come rendere la ricerca più restrittiva

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringaUtente);

        while (matcher.find()) {
            String paroleOffensiva = matcher.group();
            System.out.println("La parola offensiva e': " + paroleOffensiva);
            stringaUtente=stringaUtente.replace(paroleOffensiva, "*****");

        }
        System.out.println(stringaUtente);


    }
}
