package feladatok;

import java.util.Random;
import java.util.Scanner;

public class BekeresTomb {

    static Scanner sc = new Scanner(System.in, "windows-1250");
    static Random rnd = new Random();

    public static void main(String[] args) {
        System.out.print("Helység szám:");
        final int DB = sc.nextInt();
        sc.nextLine();

        String[] helysegek = new String[DB];

        for (int i = 0; i < DB; i++) {
            System.out.printf("%d/%d Helység: ", DB, i + 1);
            String helyseg = sc.nextLine();
            helysegek[i] = helyseg;
        }

        int[] letszamok = new int[DB];
        for (int i = 0; i < DB; i++) {
            int letszam = rnd.nextInt(1500);
            letszamok[i] = letszam;
        }

        for (int i = 0; i < DB; i++) {
            System.out.printf("%s-ban/ben %d-an/en vannak\n", helysegek[i], letszamok[i]);
        }

        int max = 0;
        for (int i = 1; i < DB; i++) {
            if (letszamok[max] < letszamok[i]) {
                max = i;
            }
        }
        System.out.printf("%s-ban/ben vannak a legtöbben\n", helysegek[max]);

        int i = 0;
        while (i < DB && !(letszamok[i] == 1000)) {
            i++;
        }
        boolean van = i < DB;
        if (van) {
            System.out.println("Van");
        } else {
            System.out.println("Nincs");
        }

        i = 0;
        while (i < DB && letszamok[i] > 1000) {
            i++;
        }
        van = i >= DB;
        if (van) {
            System.out.println("Van");
        } else {
            System.out.println("Nincs");
        }

        final int VEL_DB = rnd.nextInt(15, 26);
        int[] paratlanok = new int[VEL_DB];

        for (i = 0; i < VEL_DB; i++) {
            int paratlan = rnd.nextInt(10, 101);
            if (paratlan % 2 == 0) {
                paratlan += 1;
            }
            paratlanok[i] = paratlan;
        }

        paratlanok[(int) (Math.random() * paratlanok.length)]++;

        while (paratlanok[i] % 2 != 0) {
            i++;
        }
        System.out.println("Páratlan szám helye: " + i);
    }
}
