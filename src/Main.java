import java.util.*;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto
public class Main {
    public static void main(String[] args) {

        Map<String , String> province1 = new HashMap<>();
        province1.put("NA","Napoli");
        province1.put("AV","Avellino");
        province1.put("BA","Bari");
        System.out.println(province1);


        Map<String , String> province2 = Map.of("NA","Napoli","AV","Avellino","BA","Bari");
        System.out.println(province2);

        Map<String , String> province3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("NA","Napoli"),
                new AbstractMap.SimpleEntry<>("AV","Avellino"),
                new AbstractMap.SimpleEntry<>("BA","Bari")

        );
        System.out.println(province3);
    }
}