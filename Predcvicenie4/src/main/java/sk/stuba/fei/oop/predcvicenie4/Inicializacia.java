package sk.stuba.fei.oop.predcvicenie4;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Inicializacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> zoznam = new ArrayList<String>();

        System.out.println("Zadaj prvky zoznamu, ukončiť prázdny reťazec:");

        while (true) {
            String hodnota = scanner.next();
            if (hodnota.isEmpty()) {
                break;
            }
            zoznam.add(hodnota);
        }

        System.out.println("Zoznam obsahuje nasledujúce prvky:");
        for (String hodnota : zoznam) {
            System.out.println(hodnota);
        }
    }
}

