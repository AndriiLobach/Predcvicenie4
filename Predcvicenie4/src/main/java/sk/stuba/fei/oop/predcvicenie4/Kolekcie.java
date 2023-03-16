package sk.stuba.fei.oop.predcvicenie4;

import java.util.ArrayList;
import java.util.List;

public class Kolekcie {
    List<List<Integer>> dvojrozmernyZoznam = new ArrayList<>();

    // vytvorenie poľa s 3 riadkami a 4 stĺpcami
    for (int i = 0; i < 3; i++) {
            List<Integer> riadok = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                riadok.add(i * j); // pridanie prvku do riadku
            }
            dvojrozmernyZoznam.add(riadok); // pridanie riadku do poľa
    }

    // výpis poľa
    for (List<Integer> riadok : dvojrozmernyZoznam) {
            for (int prvok : riadok) {
                System.out.print(prvok + " ");
            }
            System.out.println();
    }
}
