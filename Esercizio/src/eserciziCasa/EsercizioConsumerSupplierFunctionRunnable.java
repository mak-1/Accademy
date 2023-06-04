package eserciziCasa;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
public class EsercizioConsumerSupplierFunctionRunnable {
//5.Combina le interfacce funzionali Consumer, Supplier, Function e Runnable per implementare un programma che genera una sequenza di numeri casuali,
// li filtra prendendo solo quelli pari, li eleva al quadrato e li stampa.
    private List<Integer> lista = new ArrayList<>();
    public static void main(String[] args) {
        EsercizioConsumerSupplierFunctionRunnable es = new EsercizioConsumerSupplierFunctionRunnable();
        es.test();
    }


    public void test() {

        Runnable runnable = () -> {
        for (Integer elemento : lista)
            System.out.println(elemento);
    };
        Supplier<List<Integer>> supplier = () ->{
            List<Integer> listaNumeriCasuali = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < 5; i++) {
               int numero = random.nextInt(101);
                listaNumeriCasuali.add(numero);
            }
            return listaNumeriCasuali;
        };
        Function <List<Integer>,List<Integer>>  function = (lista) ->{
                for(int i = 0; i < lista.size(); i++) {
                    if(lista.get(i)%2!=0){

                        lista.remove(lista.get(i));
                    }

                }
                return lista;
        };
        Consumer<List<Integer>> consumer = (lista) ->{
    for (int i = 0; i < lista.size(); i++) {
        int temp =lista.get(i);
        lista.remove(lista.get(i));
        lista.add((int) Math.pow(temp, 2));
    }

        };
        this.lista= function.apply(supplier.get());
        consumer.accept(this.lista);
        runnable.run();
    }




}


