package eserciziCasa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Esercizio: Estrazione di codici di prodotto (es: Lorem ipsum ABC123 dolor sit amet, consectetur XYZ456 adipiscing elit, sed LMN789 do eiusmod.";)
//        Scrivi un programma Java che legge un testo da input e utilizza un'espressione regolare per estrarre tutti i codici di prodotto presenti nel testo.
//        I codici di prodotto sono rappresentati da una sequenza di lettere maiuscole seguite da una sequenza di numeri.
//        Fai in modo che il programma stampi i codici di prodotto estratti separatamente.
public class EsercizioEstrazioneCodiceProdotto {
    public static void main(String[] args) {
        EsercizioEstrazioneCodiceProdotto cp = new EsercizioEstrazioneCodiceProdotto();
        cp.verificaCodiciProdotto();

    }

    public void verificaCodiciProdotto(){
        String stringaUtente = "Lorem ipsum ABC123 dolor sit amet, consectetur XYZ456 adipiscing elit, sed LMN789 do eiusmod.";

        String regex = "\\b[A-Z]{3}\\d{3}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringaUtente);

        while (matcher.find()) {
            System.out.println("Il codice prodotto e': " + matcher.group());
        }



    }

}
