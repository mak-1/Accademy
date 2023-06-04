package eserciziLezione;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EsercizioInterfacceFunzionaliELambda {
    public static void main(String[] args) {
        List<Integer> listaNumeri= Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> consumer= (x) -> System.out.println("Elemento della lista "+x);
        listaNumeri.forEach(consumer);

        List<String> listaStringhe = Arrays.asList("Mario","Pippo","Luigi","Davide");
        Consumer<String> consumer2= (x) -> {if(x.startsWith("L")) System.out.println("Nome che comincia con la lettera L maiuscola nell'elenco " +  x);};
        listaStringhe.forEach(consumer2);


        Supplier<Integer> interoCasuale =()->{
            Random rand = new Random();
           return rand.nextInt(1,11);};

        int intero = interoCasuale.get();
        System.out.println("Numero casuale "+intero);
    }



}
