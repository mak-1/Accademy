package eserciziCasa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Esercizio: Ricerca e sostituzione di numeri romani
//        Scrivi un programma Java che legge un testo da input e utilizza un'espressione regolare per individuare tutti i numeri romani presenti nel testo.
//        Successivamente, converti ogni numero romano trovato nel corrispondente numero decimale e sostituisci il numero romano con il numero decimale nel testo.
//        Fai in modo che il programma stampi il testo modificato.
public class EstrazioneNumeriRomani {
    public static void main(String[] args) {
        EstrazioneNumeriRomani numeriRomani = new EstrazioneNumeriRomani();
        numeriRomani.estrazioneNumeriRomani();

    }

    public void estrazioneNumeriRomani(){
        String stringaUtente = "legere ceteros perpetua XII placerat eirmod integer iuvaret V debet ubique MMLVXXX suscipiantursu";

        String regex = "\\b[IVXLCDM]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringaUtente);

        while (matcher.find()) {
            String numeroRomano = matcher.group();
            System.out.println("Il numero romano e': " + numeroRomano);
            stringaUtente=stringaUtente.replaceFirst(numeroRomano, converti(numeroRomano));
        }
        System.out.println(stringaUtente);


    }
    public String converti(String numeroRomano) { //non funziona con le sottrazioni
        char[] caratteri = numeroRomano.toCharArray();
        Integer numero=0;
        for(Character r : caratteri){
        if (r.equals('I'))
            numero+=1;
        if (r == 'V')
            numero+=5;
        if (r == 'X')
            numero+=10;
        if (r == 'L')
            numero+=50;
        if (r == 'C')
            numero+=100;
        if (r == 'D')
            numero+=500;
        if (r == 'M')
            numero+=1000;
        }
        return numero.toString();}
}
