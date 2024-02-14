package feladatok;

import java.util.Random;

public class VeletlenSzoveg {

    static Random rnd = new Random();

    public static void main(String[] args) {
        String[] betuk = {"a", "b", "c", "d", "e"};

        for (int i = 0; i < 3; i++) {
            int index = rnd.nextInt(betuk.length);
            String betu = betuk[index];
            System.out.println(betu);
        }
    }
}
