package tombfeltoltes;

import java.util.Random;

public class VelSzam {

    static Random rnd = new Random();

    public static void main(String[] args) {
        final int DB = 5;
        int[] korok = new int[DB];

        for (int i = 0; i < DB; i++) {
            korok[i] = rnd.nextInt(101);
        }

        for (int i = 0; i < DB; i++) {
            System.out.println(korok[i]);
        }
    }
}
