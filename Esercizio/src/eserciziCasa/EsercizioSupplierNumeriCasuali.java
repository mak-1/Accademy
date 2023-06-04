package eserciziCasa;

import java.util.Random;
import java.util.function.Supplier;
//Implementa un Supplier che genera una sequenza di numeri interi casuali e restituisce la somma di questi numeri.

public class EsercizioSupplierNumeriCasuali {
    public static void main(String[] args) {
        EsercizioSupplierNumeriCasuali es = new EsercizioSupplierNumeriCasuali();
        System.out.println(es.numeriCasuali());

    }

    public int numeriCasuali(){
        Supplier<Integer> supplier=() ->{
            Random random= new Random();
            int int_random = random.nextInt(100);
            int int_random2 = random.nextInt(100);
            int int_random3 = random.nextInt(100);
            return int_random+int_random2+int_random3;
        };
   return supplier.get(); }

}
