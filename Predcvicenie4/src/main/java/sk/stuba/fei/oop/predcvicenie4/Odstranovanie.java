package sk.stuba.fei.oop.predcvicenie4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Odstranovanie {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        dictionary.put("man", "muz");
        dictionary.put("woman", "zena");
        dictionary.put("child", "detato");
        dictionary.put("grandmothers", "babky");

        System.out.println("Obsah slovníka: " + dictionary);

        System.out.print("Zadaj kľúč prvku, ktorý chceš odstrániť: ");
        String key = scanner.nextLine();

        if (dictionary.containsKey(key)) {
            dictionary.remove(key);
            System.out.println("Prvok s kľúčom " + key + " bol úspešne odstránený.");
        } else {
            System.out.println("Prvok s kľúčom " + key + " sa nenachádza v slovníku.");
        }

        System.out.println("Nový obsah slovníka: " + dictionary);

        for (String value : dictionary.values()) {
            if (value.startsWith("y")) {
                System.out.println(value);
            }
        }

        // vytvorenie kópie slovníka
        HashMap<String, String> dictionary2 = (HashMap<String, String>) dictionary.clone();


        if (dictionary.equals(dictionary2)) {
            System.out.println("Slovníky sú rovnaké.");
        } else {
            System.out.println("Slovníky sa líšia.");
        }
    }
}