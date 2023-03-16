package sk.stuba.fei.oop.predcvicenie4;
import java.util.ArrayList;


abstract class Zivocich {
    int pocetNoh;
    abstract void zvuk();
}

class Pes extends Zivocich {
    Pes(int pocetNoh) {
        this.pocetNoh = pocetNoh;
    }
    void zvuk() {
        System.out.println("Haff!");
    }
}

class Clovek extends Zivocich {
    Clovek(int pocetNoh) {
        this.pocetNoh = pocetNoh;
    }
    void zvuk() {
        System.out.println("Som clovek!");
    }
}

public class Main {
    public static void main(String[] args) {
        Zivocich pes = new Pes(4);
        pes.zvuk();

        Zivocich clovek = new Clovek(2);
        clovek.zvuk();

        ArrayList<Object> zoznam = new ArrayList<>();
        zoznam.add("som clovek");
        zoznam.add(40);
        Zivocich z = new Pes(4);
        zoznam.add(z);

        for (Object element : zoznam) {
            System.out.println(element.toString());
        }

        for (int i = 0; i < zoznam.size(); i++) {
            System.out.println(zoznam.get(i).toString());
        }

        // Volanie metody zvuk() pre vsetky objekty triedy Zivocich v zozname s pouzitim cyklu for-each
        for (Object element : zoznam) {
            if (element instanceof Zivocich) {
                ((Zivocich) element).zvuk();
            }
        }

        // Volanie metody zvuk() pre vsetky objekty triedy Zivocich v zozname s pouzitim cyklu for s indexom
        for (int i = 0; i < zoznam.size(); i++) {
            if (zoznam.get(i) instanceof Zivocich) {
                ((Zivocich) zoznam.get(i)).zvuk();
            }
        }





    }
}

