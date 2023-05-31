package eserciziCasa;

//Esercizio: Validazione di un indirizzo IP
//        Scrivi un programma Java che chiede all'utente di inserire un indirizzo IP e verifica se l'indirizzo inserito è valido.
//        Utilizza un'espressione regolare per convalidare la struttura dell'indirizzo IP, controllando che sia nel formato corretto (es. "xxx.xxx.xxx.xxx")
//        e che ogni parte dell'indirizzo sia compresa tra 0 e 255. Fai in modo che il programma stampi "Indirizzo IP valido" o "Indirizzo IP non valido"
//        a seconda dell'esito della convalida.


import java.util.Scanner;

public class EsercizioIpREGEX {

    public static void main(String[] args) {
EsercizioIpREGEX ip = new EsercizioIpREGEX();
        System.out.println(ip.validaIP());

    }

    public boolean validaIP(){
        Scanner mioScanner = new Scanner(System.in);
        System.out.print("Inserisci un indirizzo ip ");
        String indirizzoIp = mioScanner.nextLine();
        String regex1 = "^\\w{1,3}\\.\\w{1,3}\\.\\w{1,3}\\.\\w{1,3}$";
        boolean b = indirizzoIp.matches(regex1);
        if (b){
            String[] partiIP =indirizzoIp.split(".");
            int[] parziale =new int[partiIP.length];
            for(int i = 0; i<partiIP.length; i++){
               parziale[i] = Integer.parseInt(partiIP[i]);
               if (parziale[i]>255){
                   return false;
               }
            }
        }
        System.out.println();
        return b;
    }
}
