package sk.stuba.fei.oop.predcvicenie4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class DictionaryIterator {
    public void printKeys(Map<String, String> dictionary) {
        Set<String> keys = dictionary.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }

public class Preklady {
    public void main(String[] args) {
        Map<String, String> preklady = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        preklady.put("Ano", "Yes");
        preklady.put("Nie", "No");
        preklady.put("Objektovo orientované programovanie", "Object oriented programming");

        System.out.println(preklady.get("Ano"));
        System.out.println(preklady.get("Nie"));
        System.out.println(preklady.get("Objektovo orientované programovanie"));

        while (true) {
            System.out.print("Zadaj slovo: ");
            String slovo = scanner.nextLine();
            if (preklady.containsKey(slovo)) {
                System.out.println("Slovo už existuje v slovníku.");
            } else {
                System.out.print("Zadaj preklad slova: ");
                String preklad = scanner.nextLine();
                preklady.put(slovo, preklad);
                System.out.println("Slovo " + slovo + " bolo pridané do slovníka.");
            }
        }


    }
}
