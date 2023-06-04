package eserciziCasa;

public class EsercizioRunnableConteggioDelay {
//    4.Implementa un Runnable che esegue un conteggio progressivo da 1 a 10. [bonus]stampando ogni numero dopo un breve ritardo. (classe Thread)
public static void main(String[] args) {
    Runnable runnable = () ->{
        for(int i=0; i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };
    runnable.run();
}
}
