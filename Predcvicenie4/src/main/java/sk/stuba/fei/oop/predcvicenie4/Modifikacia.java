package sk.stuba.fei.oop.predcvicenie4;
import java.util.ArrayList;
import java.util.Scanner;

public class Modifikacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Napis N: ");
        int n = scanner.nextInt();

        System.out.print("NapisK: ");
        int k = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int i = k;
        while (i <= list.size()) {
            list.remove(i - 1);
            i += k - 1;
        }

        System.out.println("Finalny list: " + list);
    }

}
